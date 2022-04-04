package br.edu.infnet.VenturaHr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.VenturaHr.model.User;
import br.edu.infnet.VenturaHr.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository usuarioRepository;

	public List<User> getList() {
		return (List<User>) usuarioRepository.findAll();
	}

	public User getById(Integer id) {
		return usuarioRepository.findById(id).orElse(null);
	}

	public void add(User user) {
		usuarioRepository.save(user);
	}

	public void delete(Integer id) {
		usuarioRepository.deleteById(id);
	}
	
	public User authentication(String email, String password) {
		return usuarioRepository.authentication(email, password);
	}
}
