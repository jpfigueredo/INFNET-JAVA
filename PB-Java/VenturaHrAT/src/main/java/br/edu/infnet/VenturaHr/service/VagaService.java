package br.edu.infnet.VenturaHr.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.VenturaHr.model.Vaga;
import br.edu.infnet.VenturaHr.repository.VagaRepository;

@Service
public class VagaService {
	
	@Autowired
	private VagaRepository vagaRepository;

	public Collection<Vaga> obterLista() {
		return (Collection<Vaga>) vagaRepository.findAll(); 
	}

	public void incluir(Vaga vaga) {
		vagaRepository.save(vaga);
	}
	
	public Vaga incluiRetorna(Vaga vaga) {
		return vagaRepository.save(vaga);
	}
	
	public List<Vaga> findByIdUsuario(Integer id) {
		return vagaRepository.findByIdUsuario(id);
	}
	
	public List<Vaga> findByCargo(String pesquisa) {
		return vagaRepository.findByCargoContainingIgnoreCase(pesquisa);
	}
	
	public List<Vaga> findByCidade(String pesquisa) {
		return vagaRepository.findByCidadeContainingIgnoreCase(pesquisa);
	}
}		

