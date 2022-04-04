package br.edu.infnet.EmpresaACME.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.edu.infnet.EmpresaACME.model.Produto;
import br.edu.infnet.EmpresaACME.repository.ProdutoRepository;

@Service
public class ProdutoService {
	
    @Autowired
	private ProdutoRepository produtoRepository;

    public List<Produto> getAllProdutos(){
        return (List<Produto>) produtoRepository.findAll();
    }

    public Produto getProdutoById(int id){
    	Produto produto = produtoRepository.findById(id).get();
    	if(produto != null) {
    		return produto;
    	}
    	return null;
    }

    public void removeProdutoById(int id) {
        try {
        	produtoRepository.deleteById(id);
        }catch(Exception e){
            e.getMessage();
        }
    }

    public void updateProduto(Produto produto){
        produtoRepository.save(produto);
    }

    public void insertProduto(Produto produto) {
        produtoRepository.save(produto);
    }
    
}
