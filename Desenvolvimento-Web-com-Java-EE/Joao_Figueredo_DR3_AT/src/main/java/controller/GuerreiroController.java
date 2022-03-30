
package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import model.Guerreiro;
import service.GuerreiroService;
import service.PersonagemService;

@Controller
public class GuerreiroController {

	@Autowired
	private GuerreiroService guerreiroService;
	@Autowired
	private PersonagemService personagemService;

	@GetMapping(value = "/guerreiros")
	public String telaLista(Model model) {

		model.addAttribute("guerreiroLista", guerreiroService.obterLista());

		return "guerreiro/lista";
	}

	@GetMapping(value = "/guerreiro")
	public String telaCadastro() {
		return "guerreiro/cadastro";
	}

	@PostMapping(value = "/guerreiro/incluir")
	public String incluir(Guerreiro guerreiro) {

		personagemService.incluir(guerreiro);

		return "redirect:/guerreiros";
	}

	@GetMapping(value = "/guerreiro/{id}/excluir")
	public String excluir(@PathVariable Integer id) {

		personagemService.excluir(id);

		return "redirect:/guerreiros";
	}
}
