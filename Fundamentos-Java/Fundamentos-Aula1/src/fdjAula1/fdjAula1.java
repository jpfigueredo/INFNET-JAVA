package fdjAula1;

public class fdjAula1 {

	public static void main(String[] args) {
		if(args.length == 6) {
			String nome = args[0];
			String sobrenome = args[1];
			int idade = Integer.valueOf(args[2]);
			float salario = Float.valueOf(args[3]);
			boolean ehJava = Boolean.valueOf(args[4]);
			int qtdMeses = Integer.valueOf(args[5]);
			
			int anoNascimento = 2021 - idade;
			float valorTotal = salario * qtdMeses;
			
			
			
		}
	}
	
}
