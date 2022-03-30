package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Guerreiro;
import model.repository.GuerreiroRepository;

@Service
public class GuerreiroService {

	@Autowired
	GuerreiroRepository guerreiroRepository;
	
	public Object obterLista() {
		return guerreiroRepository.findAll();
	}

	public Guerreiro obterPorId(Integer id) {
		return guerreiroRepository.findById(id).orElse(null);
	}

	public void excluir(Integer id) {
		guerreiroRepository.deleteById(id);;
	}

	public void incluir(Guerreiro guerreiro) {
		guerreiroRepository.save(guerreiro);
	}
	
}
