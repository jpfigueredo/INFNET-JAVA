package br.infnet.edu.poo.aula2;

public class Calculadora implements ICalculadora{
    private int op1, op2;
    private double result;
    
    //sobrecarga de construtor
    public Calculadora(){
        
    }
    
    public static void olaPessoal(){
        System.out.println("Ola Pessoal");
    }
    
    public void setOp1(int op1){
        this.op1 = op1;
    }
    public int getOp1(){
        return op1;
    }
    public void setOp2(int op2){
        this.op2 = op2;
    }
    public int getOp2(){
        return op2;
    }
    
    public double getResult(){
        return result;
    }
    
    //sobrecarga de método
    public void soma(){
        result = op1 + op2;
    }
    public double soma(int op1, int op2){
        return op1 + op2;
    } 
    public void subtracao(){
        result = op1 - op2;
    }
    public void multiplicacao(){
        result = op1 * op2;
    }
    public void divisao(){
        result = (double) op1 / op2;
    }
        
    //sobrescrita de método
    @Override
    public String toString(){
        return Double.toString(result);
    }
}
