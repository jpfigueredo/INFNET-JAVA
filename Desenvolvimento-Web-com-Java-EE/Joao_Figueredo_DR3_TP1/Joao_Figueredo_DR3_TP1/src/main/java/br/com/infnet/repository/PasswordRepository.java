package br.com.infnet.repository;

import br.com.infnet.model.User;

public class PasswordRepository {

	public static User validate(String senha, String confirmaSenha) {
		if (senha.equalsIgnoreCase(confirmaSenha) && !(senha.isBlank() && confirmaSenha.isBlank())) {
			User user = new User();
			user.setSenha(senha);

			return user;
		}
		return null;
	}

}
