package testes;

import java.util.ArrayList;
import java.util.List;

import exception.AtributosExcedidosException;
import exception.NumeroNegativoException;
import exception.NumeroNuloException;
import exception.SkillsInvalidasException;
import model.Mago;
import model.Personagem;

public class MagoTeste {
	public static void main(String[] args) {
		
		try {
			List<String> skills = new ArrayList<String>();
			skills.add("atirar");
			skills.add("esquivar");
			
			Personagem arch = new Mago(5,5,5,skills);
			
			System.out.println(arch.toString());
			
		}catch (SkillsInvalidasException | NumeroNegativoException | NumeroNuloException | AtributosExcedidosException  e){
			System.out.println(e.getMessage());	
		}
		
		try {
			List<String> skills2 = new ArrayList<String>();
			skills2.add("");
			
			Personagem arch = new Mago(-5,15,0,skills2);
			
			System.out.println(arch.toString());
		}catch (SkillsInvalidasException | NumeroNegativoException | NumeroNuloException | AtributosExcedidosException e){
			System.out.println(e.getMessage());	
		}
		
		try {
			List<String> skills3 = new ArrayList<String>();
			skills3.add("atirar");
			skills3.add("esquivar");
			
			Personagem arch = new Mago(0,0,0,null);
			
			System.out.println(arch.toString());
		}catch (SkillsInvalidasException | NumeroNegativoException | NumeroNuloException | AtributosExcedidosException  e){
			System.out.println(e.getMessage());	
		}
		
	}
}
