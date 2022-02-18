package br.com.infnet.repository;

import java.util.ArrayList;
import java.util.List;

import br.com.infnet.model.User;

public class UserRepository {
	private static List<User> listUser = new ArrayList<User>();

	public static void doAdd(User user) {
		listUser.add(user);
	}

	public static List<User> getList() {
		return listUser;
	}

}
