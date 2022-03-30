package br.edu.infnet.EmpresaACME.service;

import org.springframework.stereotype.Service;

import br.edu.infnet.EmpresaACME.model.Produto;
import br.edu.infnet.EmpresaACME.repository.ProdutoRepository;

@Service
public class ProdutoService {

	private ProdutoRepository produtoRepository;
	
	public void incluir(Produto p) {
		produtoRepository.save(p);
	}
	
}
