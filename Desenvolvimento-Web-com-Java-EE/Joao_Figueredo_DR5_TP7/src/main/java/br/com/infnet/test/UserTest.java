package br.com.infnet.test;

import java.util.List;

import br.com.infnet.model.User;
import br.com.infnet.repository.UserRepository;

public class UserTest {

	public static void main(String[] args) {

		User user = new User();
		user.setNome("Joao");
		user.setEmail("joao@joao.com");
		user.setSenha("Abcd1234");

		UserRepository.doAdd(user);

		List<User> uList = UserRepository.getList();
		uList.forEach(u -> System.out.println(u));
		uList.size();
	}
}
