package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Arqueiro;
import model.repository.ArqueiroRepository;

@Service
public class ArqueiroService {
	
	@Autowired
	ArqueiroRepository arqueiroRepository;
	
	
	public Object obterLista() {
		return arqueiroRepository.findAll();
	}

	public Arqueiro obterPorId(Integer id) {
		return arqueiroRepository.findById(id).orElse(null);
	}

	public void excluir(Integer id) {
		arqueiroRepository.deleteById(id);;
	}

	public void incluir(Arqueiro arqueiro) {
		arqueiroRepository.save(arqueiro);
	}
}
