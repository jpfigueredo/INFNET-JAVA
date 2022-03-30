
package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Usuario;
import model.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	public Object obterLista() {
		return usuarioRepository.findAll();
	}

	public Usuario obterPorId(Integer id) {
		return usuarioRepository.findById(id).orElse(null);
	}

	public void excluir(Integer id) {
		usuarioRepository.deleteById(id);
	}

	public void incluir(Usuario usuario) {
		usuarioRepository.save(usuario);
	}
	

	public boolean validar(String username, String senha) {
		if(username==senha) {
			return true;
		}
		return false;
	}
}
