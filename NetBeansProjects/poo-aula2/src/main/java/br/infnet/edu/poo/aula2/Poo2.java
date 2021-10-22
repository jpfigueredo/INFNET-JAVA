package br.infnet.edu.poo.aula2;

public class Poo2 {
    public static void main(String[] args) {
        
        Calculadora calc = new Calculadora();
        
        calc.setOp1(7);
        calc.setOp2(3);
        
        calc.soma();
        
        System.out.println(calc);
        System.out.println(calc.soma(7,3));
    }
}