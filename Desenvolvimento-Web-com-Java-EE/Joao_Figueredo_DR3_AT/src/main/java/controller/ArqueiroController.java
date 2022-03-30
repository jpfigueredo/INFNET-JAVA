package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import model.Arqueiro;
import service.MagoService;
import service.PersonagemService;

@Controller
public class ArqueiroController {
	
	@Autowired
	private MagoService arqueiroService;
	@Autowired
	private PersonagemService personagemService;

	@GetMapping(value = "/arqueiros")
	public String telaLista(Model model) {

		model.addAttribute("arqueiroLista", arqueiroService.obterLista());
		
		return "arqueiro/lista";
	}

	@GetMapping(value = "/arqueiro")
	public String telaCadastro() {
		return "arqueiro/cadastro";
	}

	@PostMapping(value = "/arqueiro/incluir")
	public String incluir(Arqueiro arqueiro) {

		personagemService.incluir(arqueiro);
		
		return "redirect:/arqueiros";
	}

	@GetMapping(value = "/arqueiro/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		
		personagemService.excluir(id);
		
		return "redirect:/arqueiros";
	}
}