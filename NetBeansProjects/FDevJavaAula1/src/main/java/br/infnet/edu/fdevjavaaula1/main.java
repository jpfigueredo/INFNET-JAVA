package br.infnet.edu.fdevjavaaula1;

public class main {
    // Primeiro
    private static String nome;
    private static String sobrenome;
    private static int idade;
    private static float salario;
    private static boolean ehJava;
    private static int qtdMeses;
    
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
    private static String definirSituacao(float salario){
        if (salario > 1000){
            return "estável";
        }
        return "instável";
    }
    
    private static void tratarParametros(String[] parametros){
        nome = parametros[0];
        sobrenome = parametros[1];
        idade = Integer.valueOf(parametros[2]);
        salario = Float.valueOf(parametros[3]);
        ehJava = Boolean.valueOf(parametros[4]);
        qtdMeses = Integer.valueOf(parametros[5]);
    }
    
    private static void Imprimir(){
        
        //int anoNascimento = calcularIdade(idade);
        //float valorTotal = calcularValorTotal(salario, qtdMeses);
        //String status = definirStatus(idade);
        //String situacao = definirSituacao(salario);


        System.out.println("Nome: " + nome);
        System.out.println("Sobrenome: " + sobrenome);
        System.out.println("Idade: " + calcularIdade(idade));
        System.out.println("Salário: " + calcularValorTotal(salario, qtdMeses));
        System.out.println("Status: " + definirStatus(idade));
        System.out.println("Situação: " + definirSituacao(salario));
    }
    
    public static void main(String[] args) {
        
        if(validar(args.length)){
            
            tratarParametros(args);            
            Imprimir();
                       
        }else{
            System.out.println("A quantidade" + args.length + " de argumentos está incorreta! "
                    + "\nNecessário 5 argumentos.");
        }
    }
    
}
