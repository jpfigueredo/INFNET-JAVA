package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import model.Jogador;
import service.JogadorService;

@Controller
public class JogadorController {

	@Autowired
	private JogadorService jogadorService;

	@GetMapping(value = "/jogador")
	public String telaCadastro() {
		return "jogador/cadastro";
	}

	@GetMapping(value = "/jogadores")
	public String telaLista(Model model) {

		model.addAttribute("jogadorLista", jogadorService.obterLista());

		return "jogador/lista";
	}

	@PostMapping(value = "/jogador/incluir")
	public String incluir(Jogador jogador) {

		jogadorService.incluir(jogador);

		return "redirect:/";
	}

	@GetMapping(value = "/jogador/{id}/excluir")
	public String excluir(Model model, @PathVariable Integer id) {

		Jogador jogador = jogadorService.obterPorId(id);

		if (jogador != null) {
			jogadorService.excluir(id);
		} else {
			model.addAttribute("mensagem", "Usuário inexistente.. impossível realizar a exclusão!!!");
		}

		return telaLista(model);
	}
}