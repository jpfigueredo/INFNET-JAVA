package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "https://api.agify.io", value = "nome")
public interface IClienteAPI {

	@GetMapping(value="?name={nome}")
	Genero buscaGeneroPor(@PathVariable("nome") String nome);
}
