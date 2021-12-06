package alura.sintaxe.variaveis.e.fluxos;

public class TestePontoFlutuante {

    public static void main(String[] args) {
        // Não é recomendado criar variável não utilizada
        //ex:
        // double salario;
        double salario = 1250.70;
        
        System.out.println("meu salário é " + salario);
        
        double divisao = 3.14/1.13;
        
        System.out.println("a divisão entre 3.14/1.13, é igual à: " + divisao);
           
        double maisUmaDivisao = 5/2;
        System.out.println("O Java identifica 5/2 como divisão de inteiros e retorna inteiro: " + maisUmaDivisao);
        
        double outraDivisao = 5.0/2;
        System.out.println("Porém, adicionando o ponto, nesse caso 5.0/2, temos uma divisão em double: " + outraDivisao);
        
    }
    
}
