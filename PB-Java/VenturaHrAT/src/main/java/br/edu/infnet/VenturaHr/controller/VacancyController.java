package br.edu.infnet.VenturaHr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.VenturaHr.model.User;
import br.edu.infnet.VenturaHr.model.Vacancy;
import br.edu.infnet.VenturaHr.service.VacancyService;

@Controller
public class VacancyController {

	@Autowired
	private VacancyService vacancyService;

	@GetMapping(value = "/vacancies")
	public String listScreen(Model model) {

		model.addAttribute("vacancyList", vacancyService.getList());

		return "/vacancy/list";
	}

	@GetMapping(value = "/vacancy")
	public String registerScreen() {
		return "/vacancy/register";
	}

	@PostMapping(value = "/vacancy/add")
	public String include(Vacancy vacancy, @SessionAttribute("user") User user) {
		
		vacancy.setUser(user);
		vacancyService.add(vacancy);

		return "redirect:/vacancies";
	}

	@PostMapping(value = "/update/vacancy")
	public String update(Vacancy vacancy) {

		vacancyService.add(vacancy);

		return "redirect:/";
	}

	@GetMapping(value = "/vacancy/delete/{id}")
	public String delete(@PathVariable Integer id) {

		vacancyService.delete(id);

		return "redirect:/vacancies";
	}
}
