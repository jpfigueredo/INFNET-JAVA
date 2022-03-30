package br.edu.infnet.VenturaHr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.VenturaHr.model.Criterio;
import br.edu.infnet.VenturaHr.model.Vaga;
import br.edu.infnet.VenturaHr.service.VagaService;

@RestController
@RequestMapping(name = "vagas")
public class VagaController {

	@Autowired
	private VagaService vagaService;

	@GetMapping(value = "/vagas")
	public String telaLista(Model model) {

		model.addAttribute("vagaLista", vagaService.obterLista());

		return "/vaga/lista";
	}

	@GetMapping(value = "/vaga")
	public String telaRegistro() {
		return "/vaga/registro";
	}

	@PostMapping(value = "/vaga/incluir")
	public String incluir(Vaga vaga) {

		vagaService.incluir(vaga);

		return "redirect:/";
	}

	@PostMapping(value = "/atualizar/vaga")
	public String atualizar(Vaga vaga) {

		vagaService.incluir(vaga);

		return "redirect:/";
	}

	@GetMapping(path = "/vaga/{idVaga}")
	public ResponseEntity<List<Vaga>> listarPorIdUsuario(@PathVariable int idVaga) {
		ResponseEntity<List<Vaga>> retorno = ResponseEntity.notFound().build();
		try {
			List<Vaga> lista = vagaService.findByIdUsuario(idVaga);
			if (!lista.isEmpty()) {
				retorno = ResponseEntity.ok().body(lista);
			}
		} catch (Exception e) {
		}
		return retorno;
	}

	@GetMapping(path = "/cargo/{pesquisa}")
	public ResponseEntity<List<Vaga>> pesquisarVagasPorCargo(@PathVariable String pesquisa) {
		ResponseEntity<List<Vaga>> retorno = ResponseEntity.notFound().build();

		try {
			List<Vaga> lista = vagaService.findByCargo(pesquisa);
			if (!lista.isEmpty()) {
				retorno = ResponseEntity.ok().body(lista);
			}
		} catch (Exception e) {
		}
		return retorno;
	}

	@GetMapping(path = "/cidade/{pesquisa}")
	public ResponseEntity<List<Vaga>> pesquisarVagasPorcidade(@PathVariable String pesquisa) {

		ResponseEntity<List<Vaga>> retorno = ResponseEntity.notFound().build();
		try {

			List<Vaga> lista = vagaService.findByCidade(pesquisa);
			if (!lista.isEmpty()) {

				retorno = ResponseEntity.ok().body(lista);
			}
		} catch (Exception e) {
		}
		return retorno;
	}

	@PostMapping
	public ResponseEntity<Vaga> publicarVaga(@RequestBody Vaga vaga) {

		ResponseEntity<Vaga> retorno = ResponseEntity.badRequest().build();
		List<Criterio> listaCriterio = vaga.getCriterioList();
		if (listaCriterio != null && !listaCriterio.isEmpty()) {
			for (Criterio criterio : listaCriterio) {
				criterio.setVaga(vaga);
			}
			Vaga gravado = vagaService.incluiRetorna(vaga);
			retorno = ResponseEntity.ok().body(gravado);
		}
		return retorno;
	}
}