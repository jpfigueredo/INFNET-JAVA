package testes;

import java.util.ArrayList;
import java.util.List;

import exception.AtributosExcedidosException;
import exception.NumeroNegativoException;
import exception.NumeroNuloException;
import exception.SkillsInvalidasException;
import model.Arqueiro;
import model.Personagem;

public class ArqueiroTeste {
	
	public static void main(String[] args) {
		try {
			List<String> skills = new ArrayList<String>();
			skills.add("atirar");
			skills.add("esquivar");
			
			Personagem mage = new Arqueiro(5,5,5,skills);
			
			System.out.println(mage.toString());
		}catch (SkillsInvalidasException | NumeroNegativoException | NumeroNuloException | AtributosExcedidosException e){
			System.out.println(e.getMessage());	
		}
		
		try {
			List<String> skills2 = new ArrayList<String>();
			skills2.add("");
			
			Personagem mage2 = new Arqueiro(-5,15,0,skills2);
			
			System.out.println(mage2.toString());
		}catch (SkillsInvalidasException | NumeroNegativoException | NumeroNuloException | AtributosExcedidosException e){
			System.out.println(e.getMessage());	
		}
		
		try {
			List<String> skills3 = new ArrayList<String>();
			skills3.add("atirar");
			skills3.add("esquivar");
			
			Personagem mage3 = new Arqueiro(0,0,0,null);
			
			System.out.println(mage3.toString());
		}catch (SkillsInvalidasException | NumeroNegativoException | NumeroNuloException | AtributosExcedidosException e){
			System.out.println(e.getMessage());	
		}
	}
}
