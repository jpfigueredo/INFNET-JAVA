package testes;

import java.util.ArrayList;
import java.util.List;

import exception.AtributosExcedidosException;
import exception.IdadeInvalidaException;
import exception.InvalidEmailException;
import exception.InvalidNameException;
import exception.JogadorInexistenteException;
import exception.NumeroNegativoException;
import exception.NumeroNuloException;
import exception.PersonagensNulosExceptions;
import exception.SkillsInvalidasException;
import model.Arqueiro;
import model.Equipamento;
import model.Ficha;
import model.Guerreiro;
import model.Personagem;
import model.Jogador;
import model.Mago;

public class FichaTeste {
	public static void main(String[] args) {
		
		try {
			List<String> skills = new ArrayList<String>();
			skills.add("atirar");
			skills.add("defender");
			
			List<Personagem> personagens = new ArrayList<Personagem>();

			Personagem personagem = new Guerreiro(5, 10, 10, skills);
			personagem.setNome("joao");
			personagem.setLevel(100);
			personagem.setVida(100);
			personagem.setMana(0);
			personagem.setStamina(100);
			
			personagens.add(personagem);
			
			Equipamento equipamento = new Equipamento(personagem, "Espada Grande +3", "Prismatic Shield", "Ornate Chestplate");
			Jogador player1 = new Jogador("Joao Figueredo", "jp@jp.jp", 25);
				
			Ficha ficha = new Ficha(player1);
			ficha.setPersonagem(personagens);
			ficha.setEquipamento(equipamento);

//			System.out.println(player1);
			System.out.println(personagens);
			System.out.println(equipamento);
			System.out.println(ficha);
		}catch(SkillsInvalidasException | NumeroNegativoException | NumeroNuloException | InvalidNameException | InvalidEmailException | IdadeInvalidaException | AtributosExcedidosException | JogadorInexistenteException | PersonagensNulosExceptions e){
			System.out.println(e.getMessage());
			
		}
		
		
		
		try {
			List<String> skills2 = new ArrayList<String>();
			skills2.add("");
			skills2.add("");
			
			List<Personagem> personagens2 = new ArrayList<Personagem>();

			Personagem personagem2 = new Arqueiro(-1, 0, 10, skills2);
			personagem2.setNome("pedro");
			personagem2.setLevel(0);
			personagem2.setVida(0);
			personagem2.setMana(100);
			personagem2.setStamina(1000000);
			
			Equipamento equipamento2 = new Equipamento(personagem2, "Arco", "Flexa", "Cloth Armor");
			Jogador player2 = new Jogador("Pedrin", "pedrin@yahool.cn", 25);
				
			Ficha ficha2 = new Ficha(player2);
			ficha2.setPersonagem(personagens2);
			ficha2.setEquipamento(equipamento2);
			
			System.out.println(ficha2);
		}catch(SkillsInvalidasException | NumeroNegativoException | NumeroNuloException | InvalidNameException | InvalidEmailException | IdadeInvalidaException | AtributosExcedidosException | JogadorInexistenteException | PersonagensNulosExceptions e){
			System.out.println(e.getMessage());
			
		}
		
		
		
		try {
			List<String> skills3 = new ArrayList<String>();

			Personagem personagem3 = new Mago(5, 10, 100, skills3);
			personagem3.setNome("Leticia");
			personagem3.setLevel(100);
			personagem3.setVida(100000);
			personagem3.setMana(0);
			personagem3.setStamina(-9);
			List<Personagem> personagens3 = new ArrayList<Personagem>();

			Equipamento equipamento3 = new Equipamento(personagem3, "Varinha", "Varinha", "Vestes M�gicas");
			Jogador usuario = new Jogador("Leticia", "lele@let.com", 25);
				
			Ficha ficha3 = new Ficha(usuario);
			ficha3.setPersonagem(personagens3);
			ficha3.setEquipamento(equipamento3);
			
			System.out.println(ficha3);
		}catch(SkillsInvalidasException | NumeroNegativoException | NumeroNuloException | InvalidNameException | InvalidEmailException | IdadeInvalidaException | AtributosExcedidosException | JogadorInexistenteException | PersonagensNulosExceptions e){
			System.out.println(e.getMessage());
			
		}

	
	}

}
