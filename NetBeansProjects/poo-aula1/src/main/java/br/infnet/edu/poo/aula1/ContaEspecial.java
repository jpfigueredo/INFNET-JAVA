package br.infnet.edu.poo.aula1;

//herança - Subclasse de Contat
public class ContaEspecial extends Conta {
    private double especial;
    
    public ContaEspecial(){}
    
    public ContaEspecial(int num, String nome, double saldo, double especial){
        // chamando o construtor da super classe, ou seja, classe-mãe (Conta)
        super(num, nome, saldo);
        this.especial = especial;
    }
    
    public void setEspecial(double valor){
        especial = valor;
    }
    
    public double getEspecial(){
        return especial;
    }
    
    @Override
    public String debitar(double valor){
        if(valor < 0){
            return "Valor Inválido";
        }
        if((saldo - valor) + especial < 0){
            return "Saldo Insuficiente";
        }
        return "Valor debitado";
    }
    
    
    @Override
    public String toString(){
        return super.toString() + " " + especial;
    }
    
}
