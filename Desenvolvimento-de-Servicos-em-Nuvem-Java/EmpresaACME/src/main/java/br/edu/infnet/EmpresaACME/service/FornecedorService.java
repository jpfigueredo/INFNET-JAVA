package br.edu.infnet.EmpresaACME.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.EmpresaACME.model.Fornecedor;
import br.edu.infnet.EmpresaACME.repository.FornecedorRepository;

@Service
public class FornecedorService {

	@Autowired
	private FornecedorRepository fornecedorRepository;
	
	public void incluir(Fornecedor f) {
		fornecedorRepository.save(f);
	}	
	
}
