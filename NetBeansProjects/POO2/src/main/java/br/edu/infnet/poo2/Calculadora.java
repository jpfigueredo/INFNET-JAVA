package br.edu.infnet.poo2;

public class Calculadora implements ICalculadora {
    protected int op1, op2;
    private double result;
    
    public Calculadora() {}
    
    public Calculadora(int op1, int op2) {
        this.op1 = op1;
        this.op2 = op2;
    }

    public void setOp1(int op1) {
        this.op1 = op1;
    }
    
    public int getOp1() {
        return op1;
    }

    public void setOp2(int op2) {
        this.op2 = op2;
    }
    
    public int getOp2() {
        return op2;
    }    
    
    public double getResult() {
        return result;
    }
    
    public void soma() {
        result = op1 + op2;
    }

    public double soma(int op1, int op2) {
        return op1 + op2;
    }

    public void subtracao() {
        result = op1 - op2;
    }
    
    public void multiplicacao() {
        result = op1 * op2;
    }
    
    public void divisao() {
        result = (double) op1 / op2;
    }
    
    @Override
    public String toString() {
        return Double.toString(result);
    }
}
