package testes;

import java.util.ArrayList;
import java.util.List;

import exception.AtributosExcedidosException;
import exception.NumeroNegativoException;
import exception.NumeroNuloException;
import exception.SkillsInvalidasException;
import model.Guerreiro;
import model.Personagem;

public class GuerreiroTeste {
	
	public static void main(String[] args) {
		
		try {
			List<String> skills = new ArrayList<String>();
			skills.add("atirar");
			skills.add("esquivar");
			
			Personagem guer1 = new Guerreiro(5,5,5,skills);
			
			System.out.println(guer1.toString());
			
		}catch (SkillsInvalidasException | NumeroNegativoException | NumeroNuloException | AtributosExcedidosException e){
			System.out.println(e.getMessage());	
		}
		
		try {
			List<String> skills2 = new ArrayList<String>();
			skills2.add("");
			
			Personagem guer2 = new Guerreiro(-5,15,0,skills2);
			
			System.out.println(guer2.toString());
		}catch (SkillsInvalidasException | NumeroNegativoException | NumeroNuloException | AtributosExcedidosException e){
			System.out.println(e.getMessage());	
		}
		
		try {
			List<String> skills3 = new ArrayList<String>();
			skills3.add("atirar");
			skills3.add("esquivar");
			
			Personagem guer3 = new Guerreiro(0,0,0,null);
			
			System.out.println(guer3.toString());
		}catch (SkillsInvalidasException | NumeroNegativoException | NumeroNuloException | AtributosExcedidosException e){
			System.out.println(e.getMessage());	
		}
		
	}
}
