package testes;

import exception.IdadeInvalidaException;
import exception.InvalidEmailException;
import exception.InvalidNameException;
import exception.PersonagensNulosExceptions;
import model.Jogador;

public class JogadorTeste {
	public static void main(String[] args) {
		
		try {
			Jogador user = new Jogador("Joao", "jp@jp.jp", 25);
			user.setNome(null);
			user.setEmail(null);
			user.setIdade(0);
			System.out.println(user);
			
		}catch(InvalidNameException | InvalidEmailException | IdadeInvalidaException | PersonagensNulosExceptions e) {
			System.out.println(e.getMessage());
		}

	}
}