package br.infnet.edu.fdevjavaaula1;

public class main {

    private static boolean validar(int qtd){
        if(qtd == 6){
            return true;
        }
        return false; 
    }
    
    private static int calcularIdade(int pIdade){
        return 2021 - pIdade;
    } 
    
    private static float calcularValorTotal(float pSalario, int pQtdMeses){
        return pSalario * pQtdMeses;
    } 
    
    private static String definirStatus(int pIdade){
        String status = "veterano";
        if(pIdade<= 50){
            status = "iniciante";
        }
        return status;
    }
    
    
    public static void main(String[] args) {
        
        if(validar(args.length)){
            
            
            //tratar parametros
            String nome = args[0];
            String sobrenome = args[1];
            int idade = Integer.valueOf(args[2]);
            float salario = Float.valueOf(args[2]);
            boolean ehJava = Boolean.valueOf(args[2]);
            int qtdMeses = Integer.valueOf(args[2]);

            int anoNascimento = calcularIdade(idade);
            float valorTotal = calcularValorTotal(salario, qtdMeses);

            String situacao = "instavel";
            if (salario > 1000){
                situacao = "estável";
            }
            
            String status = definirStatus(idade);
            
            
            //imprimir
            System.out.println("Nome: ");
            System.out.println("Sobrenome: ");
            System.out.println("Idade: ");
            System.out.println("Nome: ");
            System.out.println("Nome: ");
            System.out.println("Nome: ");
            
            
        }else{
            System.out.println("A quantidade" + args.length + " de argumentos está incorreta! "
                    + "\nNecessário 5 argumentos.");
        }
    }
    
}
