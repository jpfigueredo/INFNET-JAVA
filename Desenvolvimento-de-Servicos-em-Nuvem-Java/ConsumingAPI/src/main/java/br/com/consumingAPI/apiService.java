package br.com.consumingAPI;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

public interface apiService {

	@GetMapping("//rest/v2/all")
	public List<Object> getCountries();
	
	@GetMapping("/countries")
	public List<Object> getProducts();

}
