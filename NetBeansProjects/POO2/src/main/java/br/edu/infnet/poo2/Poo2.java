package br.edu.infnet.poo2;

public class Poo2 {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        
        calc.setOp1(7);
        calc.setOp2(3);
        calc.soma();
        System.out.println(calc);
        System.out.println(calc.soma(7, 3));

        System.out.println("");
        CalculadoraCientifica calc2 = new CalculadoraCientifica(2, 10);
        System.out.println(calc2.exp());
        System.out.println(calc2.exp(2, 20));
    }
}
