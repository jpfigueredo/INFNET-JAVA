package br.edu.infnet.poo2;

public class CalculadoraCientifica extends Calculadora {

    public CalculadoraCientifica() { }
    
    public CalculadoraCientifica(int op1, int op2) {
        super(op1, op2);
    }

    public double exp() {
        return Math.pow(op1, op2);
    }
    
    public double exp(int op1, int op2) {
        return Math.pow(op1, op2);
    }
}
