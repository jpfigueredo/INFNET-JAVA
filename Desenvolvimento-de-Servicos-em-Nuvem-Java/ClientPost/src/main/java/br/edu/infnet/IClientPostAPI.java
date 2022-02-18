package br.edu.infnet;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(url = "https://jsonplaceholder.typicode.com/posts", name="JsonPlaceholderService")
public interface IClientPostAPI {

	@GetMapping("{id}")
	Post buscaPostPorId(@PathVariable("id") int id);

	@GetMapping("posts")
	List<Post> buscarTodos();
	
	@PostMapping
	Post inserirPost(@RequestBody Post post);
	
}
