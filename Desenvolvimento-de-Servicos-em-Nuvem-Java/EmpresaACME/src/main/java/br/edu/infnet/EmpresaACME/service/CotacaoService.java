package br.edu.infnet.EmpresaACME.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.EmpresaACME.model.Cotacao;
import br.edu.infnet.EmpresaACME.repository.CotacaoRepository;

@Service
public class CotacaoService {

	@Autowired
	private CotacaoRepository cotacaoRepository;
	
	public void incluir(Cotacao c) {
		cotacaoRepository.save(c);
	}
	
}
