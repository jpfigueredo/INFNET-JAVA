package testes;

import exception.InvalidEmailException;
import exception.InvalidNameException;
import model.User;

public class UserTest {
	public static void main(String[] args) {
		
		try {
			User user1 = new User("Joao", "joao@joao.joao.br");
			System.out.println(user1);
		}catch (InvalidNameException | InvalidEmailException e){
			System.out.println(e.getMessage());
		}
		
		try {
			User user2 = new User("Leticia", "lele@lele.com");
			System.out.println(user2);
		}catch (InvalidNameException | InvalidEmailException e){
			System.out.println(e.getMessage());
		}
		
		try {
			User user3 = new User("Elberth", null);
			System.out.println(user3);
		}catch (InvalidNameException | InvalidEmailException e){
			System.out.println(e.getMessage());
		}
	}
}
