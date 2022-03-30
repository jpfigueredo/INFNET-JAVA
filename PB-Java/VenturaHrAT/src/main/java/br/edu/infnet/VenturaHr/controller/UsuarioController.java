package br.edu.infnet.VenturaHr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.VenturaHr.model.Usuario;
import br.edu.infnet.VenturaHr.service.UsuarioService;

@RestController
@RequestMapping(name = "usuarios")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;

	@GetMapping(value = "/usuarios")
	public String telaLista(Model model) {

		model.addAttribute("usuarioLista", usuarioService.obterLista());
		
		return "redirect:/";
	}

	@GetMapping(value = "/usuario")
	public String telaRegistro() {
		return "usuario/registro";
	}
	
	
	@PostMapping(value = "/usuario/incluir")
	public String incluir(Usuario usuario) {
		
		usuarioService.incluir(usuario);
		
		return "redirect:/";
	}

	@GetMapping(path = {"/{id}"})
	public ResponseEntity<Usuario> obterPorId(@PathVariable int id) {

		ResponseEntity<Usuario> retorno = ResponseEntity.notFound().build();

		Usuario usuario = usuarioService.findById(id);

		if (usuario != null) {
			retorno = ResponseEntity.ok().body(usuario);
		}
		return retorno;

	}

	@GetMapping(path = { "/email/{email}" })

	public ResponseEntity<Usuario> obterPorEmail(@PathVariable String email) {

		ResponseEntity<Usuario> retorno = ResponseEntity.notFound().build();
		try {
		Usuario usuario = usuarioService.findByEmail(email);
			if (usuario != null) {
		retorno = ResponseEntity.ok().body(usuario);
			}
		} catch (Exception e) {
		}
		return retorno;
	}
	
	@PostMapping
	public ResponseEntity<Usuario> inserirUsuario(@RequestBody Usuario usuario) {
		ResponseEntity<Usuario> retorno = ResponseEntity.badRequest().build();
		if (usuario != null && usuario.getId() == null) {

			Usuario usuarioInserido = usuarioService.incluiRetorna(usuario);
			retorno = ResponseEntity.ok().body(usuarioInserido);
		}
		return retorno;
	}

	@PutMapping
	public ResponseEntity<Usuario> atualizarUsuario(@RequestBody Usuario usuario) {

		ResponseEntity<Usuario> retorno = ResponseEntity.badRequest().build();

		if (usuario != null && usuario.getId() != null) {
			Usuario usuarioGravado = usuarioService.findById(usuario.getId());
			if (usuarioGravado != null) {
				try {
					usuarioGravado = usuarioService.incluiRetorna(usuario);
					retorno = ResponseEntity.ok().body(usuarioGravado);
				} catch (Exception e) {
				}
			}
		}
		return retorno;
	}
	
	@GetMapping(value = "/usuario/{id}/excluir")
	public String excluir(Model model, @PathVariable Integer id) {
		
		Usuario usuario = usuarioService.findById(id);

		if(usuario!= null) {			
			usuarioService.excluir(id);
			
			model.addAttribute("mensagem", "O usuario "+ usuario.getNome() +" foi excluido");
		} else {
			model.addAttribute("mensagem", "Usuario inexistente.. logo, nao ha exclusao a fazer");
		}
		
		return telaLista(model);
	}
}