package testes;

import dominio.Professor;
import exceptions.NomeIncompletoException;

public class ProfessorTeste {
	
	public static void main(String[] args) {
	    
		Professor primeiroProf = new Professor();
		try {
		    primeiroProf.setNome("Zé");
		    primeiroProf.setSobrenome("Fontura");
		    primeiroProf.setMateria("Matematica");
		    System.out.println(primeiroProf);
		}catch(NomeIncompletoException  e) {
			System.out.println(e.getMessage());
		}
		
	    System.out.println("");
	    
	    primeiroProf.impressao();
	    
	    System.out.println("____________________________");
	    System.out.println("");
	    
	    Professor segundoProf = new Professor();
	    try {
		    segundoProf.setNome("Silva");
		    segundoProf.setSobrenome("da Silva");
		    segundoProf.setMateria("Portugues");
		    System.out.println(segundoProf);
		}catch(NomeIncompletoException  e) {
			System.out.println(e.getMessage());
		}
	    System.out.println("");
	    	    
	    segundoProf.impressao();
	    
	}
    
}
