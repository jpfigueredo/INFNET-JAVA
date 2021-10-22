package br.edu.infnet.poo1;

public class ContaEspecial extends Conta {
    private double especial;

    public ContaEspecial() { }
    
    public ContaEspecial(int num, String nome, double saldo, double especial) {
        super(num, nome, saldo);
        this.especial = especial;
    }
    
    public void setEspecial(double valor) {
        especial = valor;
    }
    
    public double getEspecial() {
        return especial;
    }
    
    @Override
    public String debitar(double valor) {
        if (valor < 0) {
            return "Valor inválido";
        }
        if ((saldo - valor) + especial < 0) {
            return "Saldo insuficiente";
        }
        saldo -= valor;
        return "Valor debitado";
    }
    
    @Override
    public String toString() {
        return super.toString() + " " + especial;
    }
}
