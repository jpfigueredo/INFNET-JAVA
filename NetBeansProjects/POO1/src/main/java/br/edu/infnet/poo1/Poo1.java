package br.edu.infnet.poo1;

public class Poo1 {
    public static void main(String[] args) {
        
        Conta conta1 = new Conta(3, "Daniel", 300);
        System.out.println(conta1);       
        
        ContaEspecial conta2 = new ContaEspecial(1, "Andre", 100, 200);
        System.out.println(conta2.debitar(300));
        System.out.println(conta2);

        ContaPJ conta3 = new ContaPJ(2, "Infnet", 400, "8181818181818");
        System.out.println(conta3);
    }
}
