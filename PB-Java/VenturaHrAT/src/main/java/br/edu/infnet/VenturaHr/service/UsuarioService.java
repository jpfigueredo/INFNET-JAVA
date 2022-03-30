package br.edu.infnet.VenturaHr.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.VenturaHr.model.Usuario;
import br.edu.infnet.VenturaHr.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	UsuarioRepository usuarioRepository;

	public Collection<Usuario> obterLista() {
		return (Collection<Usuario>) usuarioRepository.findAll();
	}

	public void incluir(Usuario usuario) {
		usuarioRepository.save(usuario);
	}

	public List<Usuario> findByEmail(String email) {
		return usuarioRepository.findByEmail(email);
	}

	public Usuario findById(int id) {

		Usuario retorno = null;
		try {
			retorno = usuarioRepository.findById(id).get();
		} catch (Exception e) {

		}
		return retorno;
	}

	public Usuario incluiRetorna(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}

	public void excluir(Integer id) {
		usuarioRepository.deleteById(id);
	}

	public boolean validar(String username, String senha) {
		if (username == senha) {
			return true;
		}
		return false;
	}
}
