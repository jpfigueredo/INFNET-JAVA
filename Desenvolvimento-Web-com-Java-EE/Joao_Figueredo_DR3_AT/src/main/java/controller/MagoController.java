package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import model.Arqueiro;
import service.MagoService;
import service.PersonagemService;

public class MagoController {
	
	@Autowired
	private MagoService magoService;
	@Autowired
	private PersonagemService personagemService;

	@GetMapping(value = "/magos")
	public String telaLista(Model model) {

		model.addAttribute("magoLista", magoService.obterLista());
		
		return "mago/lista";
	}

	@GetMapping(value = "/mago")
	public String telaCadastro() {
		return "mago/cadastro";
	}

	@PostMapping(value = "/mago/incluir")
	public String incluir(Arqueiro mago) {

		personagemService.incluir(mago);
		
		return "redirect:/magos";
	}

	@GetMapping(value = "/mago/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		
		personagemService.excluir(id);
		
		return "redirect:/magos";
	}

}
