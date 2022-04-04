package br.edu.infnet.VenturaHr.controller;

import br.edu.infnet.VenturaHr.service.ApplicantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.VenturaHr.model.Applicant;
import br.edu.infnet.VenturaHr.model.User;


@Controller
public class ApplicantController {
	
	@Autowired
	private ApplicantService applicantService;

	@GetMapping(value = "/applicant")
	public String registerScreen() {
		return "applicant/register";
	}
	
	@GetMapping(value = "/applicants")
	public String listScreen(Model model, @SessionAttribute("user") User user) {

		model.addAttribute("applicantList", applicantService.getList(user));

		return "applicant/list";
	}

	@PostMapping(value = "/applicant/add")
	public String include(Applicant applicant, Model model, @SessionAttribute("user") User user){

		applicant.setUser(user);
		applicantService.add(applicant);

		model.addAttribute("msg", "The applicant " + applicant.getName() + " was added with success!");
		
		return listScreen(model, user);
	}

	@GetMapping(value = "/applicants/delete/{id}")
	public String delete(Model model, @PathVariable Integer id, @SessionAttribute("user") User user) {
		
		Applicant applicant = applicantService.getById(id);
				
		if(applicant != null) {
			applicantService.delete(id);
			model.addAttribute("msg", "The applicant "+applicant.getName()+" was deleted.");
		} else {
			model.addAttribute("msg", "Applicant does not exist.");
		}
		
		return listScreen(model, user);
	}
}