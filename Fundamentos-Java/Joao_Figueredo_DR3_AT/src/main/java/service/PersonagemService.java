package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Personagem;
import model.repository.PersonagemRepository;

@Service
public class PersonagemService {

	@Autowired
	PersonagemRepository personagemRepository;
	
	public Object obterLista() {
		return personagemRepository.findAll();
	}

	public Personagem obterPorId(Integer id) {
		return personagemRepository.findById(id).orElse(null);
	}

	public void excluir(Integer id) {
		personagemRepository.deleteById(id);
	}

	public void incluir(Personagem personagem) {
		personagemRepository.save(personagem);
	}


}
