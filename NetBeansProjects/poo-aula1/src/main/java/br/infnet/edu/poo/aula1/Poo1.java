package br.infnet.edu.poo.aula1;

public class Poo1 {

    public static void main(String[] args) {
        
        Conta conta1 = new Conta(1, "Daniel", 300);
        System.out.println(conta1); 
        
        ContaEspecial conta2 = new ContaEspecial(2, "André", 100, 200);
        System.out.println(conta2.debitar(300));
        System.out.println(conta2);
        
        ContaPJ conta3 = new ContaPJ(3, "INFNET",400, "11.222.333/0001-44");
        System.out.println(conta3);
    }
    
}
