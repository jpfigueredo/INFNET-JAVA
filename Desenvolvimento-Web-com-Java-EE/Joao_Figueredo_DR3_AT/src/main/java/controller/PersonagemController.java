package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import service.PersonagemService;

@Controller
public class PersonagemController {

	@Autowired
	private PersonagemService personagemService;

	@GetMapping(value = "/personagens")
	public String telaLista(Model model) {

		model.addAttribute("personagensLista", personagemService.obterLista());

		return "personagem/lista";
	}

	@GetMapping(value = "/personagem/{id}/excluir")
	public String excluir(@PathVariable Integer id) {

		personagemService.excluir(id);

		return "redirect:/personagens";
	}
}