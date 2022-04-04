package br.edu.infnet.VenturaHr.controller;

import java.util.ArrayList;
import java.util.List;

import br.edu.infnet.VenturaHr.service.ApplicantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.VenturaHr.model.User;
import br.edu.infnet.VenturaHr.model.Vacancy;
import br.edu.infnet.VenturaHr.model.VacancyApplicant;
import br.edu.infnet.VenturaHr.service.VacancyApplicantService;
import br.edu.infnet.VenturaHr.service.VacancyService;

@Controller
public class VacancyApplicantController {
	@Autowired
	private VacancyApplicantService vacancyApplicantService;
	@Autowired
	private ApplicantService applicantService;
	@Autowired
	private VacancyService vacancyService;

	@GetMapping(value = "/vacancyApplicant")
	public String registerScreen(Model model, @SessionAttribute("user") User user) {

		model.addAttribute("applicantList", applicantService.getList(user));

		model.addAttribute("vacancyList", vacancyService.getList(user));

		return "vacancyApplicant/register";
	}

	@GetMapping(value = "/vacancyApplicants")
	public String listScreen(Model model, @SessionAttribute("user") User user) {

		model.addAttribute("vacancyApplicantList", vacancyApplicantService.getList(user));

		return "vacancyApplicant/list";
	}

	@PostMapping(value = "/vacancyApplicant/add")
	public String include(@RequestParam String[] idVacancies, VacancyApplicant vacancyApplicant, Model model,
						  @SessionAttribute("user") User user) {

		List<Vacancy> vacancies = new ArrayList<Vacancy>();

		for (String id : idVacancies) {
			Vacancy vacancy = vacancyService.getById(Integer.valueOf(id));
			vacancies.add(vacancy);
		}

		vacancyApplicant.setUser(user);
		vacancyApplicant.setVacancies(vacancies);
		vacancyApplicantService.include(vacancyApplicant);

		model.addAttribute("msg", "Applicant linked to an oportunity!");

		return listScreen(model, user);
	}

	@GetMapping(value = "/vacancyApplicant/delete/{id}")
	public String delete(Model model, @PathVariable Integer id, @SessionAttribute("user") User user) {

		VacancyApplicant vacancyApplicant = vacancyApplicantService.getById(id);

		if (vacancyApplicant != null) {
			vacancyApplicantService.delete(id);
		model.addAttribute("msg", "The applicant's vacancy was deleted with success!");
		} else {
			model.addAttribute("msg", "Error upon deleting!");
		}

		return listScreen(model, user);
	}
}

