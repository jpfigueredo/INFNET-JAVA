package br.edu.infnet.EmpresaACME.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import br.edu.infnet.EmpresaACME.model.Produto;
import br.edu.infnet.EmpresaACME.service.ProdutoService;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

	@Autowired
	private ProdutoService produtoService;

	@GetMapping
	public String hello(){
		return "Olá, mundo!";
	}

	@GetMapping(value="/all")
	public Collection<Produto> getAllProdutos() {
		return produtoService.getAllProdutos();
	}

	@GetMapping(value="/{id}")
	public Produto getProdutoById(@PathVariable("id") int id) {
		return produtoService.getProdutoById(id);
	}
	

//	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
//	public void deleteProdutoById(@PathVariable("id") int id) {
//		produtoService.removeProdutoById(id);
//		System.out.println("Produto removido!");
//	}

//	@RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
//	public void deleteProdutoById(@RequestBody Produto produto) {
//		produtoService.updateProduto(produto);
//	}

    @PostMapping(value="/incluir")
	public void insertProduto(@RequestBody Produto produto) {
		produtoService.insertProduto(produto);
	}
    
}
