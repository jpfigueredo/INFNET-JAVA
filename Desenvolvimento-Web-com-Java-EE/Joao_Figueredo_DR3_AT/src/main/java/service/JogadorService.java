package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Jogador;
import model.repository.JogadorRepository;

@Service
public class JogadorService {

	@Autowired
	JogadorRepository jogadorRepository;
	
	public Object obterLista() {
		return jogadorRepository.findAll();
	}

	public Jogador obterPorId(Integer id) {
		return jogadorRepository.findById(id).orElse(null);
	}

	public void excluir(Integer id) {
		jogadorRepository.deleteById(id);;
	}

	public void incluir(Jogador jogador) {
		jogadorRepository.save(jogador);
	}

}
