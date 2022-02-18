package br.edu.infnet;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import feign.FeignException;

@EnableFeignClients
@SpringBootApplication
public class ClientPostApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ClientPostApplication.class, args);
	}

	@Autowired
	private IClientPostAPI clientPost;

	@Override
	public void run(String... args) throws Exception {

//		buscarPost();
		listarPosts();
//		inserirPost();

	}

	public void listarPosts() {
		List<Post> posts = clientPost.buscarTodos();

		for (Post post : posts) {
			System.out.println(post);
		}
	}

	public void inserirPost() {
		Post post = new Post(1, "Titulo Post", "Corpo post");
		System.out.println(clientPost.inserirPost(post));
	}

	private void buscarPost() {
		Scanner in = new Scanner(System.in);

		System.out.println("Insira o id: ");
		int id = in.nextInt();
		try {
			System.out.println(clientPost.buscaPostPorId(id));
		} catch (FeignException e) {
			System.out.println(e.getMessage());
		}
	}
}
