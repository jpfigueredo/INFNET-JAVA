package br.edu.infnet.EmpresaACME.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.EmpresaACME.model.Contato;
import br.edu.infnet.EmpresaACME.repository.ContatoRepository;

@Service
public class ContatoService {

	@Autowired
	private ContatoRepository contatoRepository;
	
	public void incluir(Contato c) {
		contatoRepository.save(c);
	}
	
}
