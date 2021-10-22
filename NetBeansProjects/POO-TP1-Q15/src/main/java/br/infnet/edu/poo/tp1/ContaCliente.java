package br.infnet.edu.poo.tp1;

public class ContaCliente extends Cliente {
    protected double saldo;
    
    public ContaCliente(String nome, String email, int numero, double saldo) {
        super(nome, email, numero);
        this.saldo = saldo;
    }
    
    public String setSaldo(double saldo) {
        if (saldo < 0) {
            return "Valor inválido";
        }
        this.saldo = saldo;
        return "Saldo alterado";
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public String creditar(double valor) {
        if (valor <= 0) {
            return "Valor inválido";
        }
        saldo += valor;
        return "Valor creditado";
    }
    
    public String debitar(double valor) {
        if (valor <= 0) {
            return "Valor inválido";
        }
        if ((saldo - valor) < 0) {
            return "Saldo insuficiente";
        }
        saldo -= valor;
        return "Valor debitado";
    }

    @Override
    public String toString() {
        return getNome() + " " + getNumero() + " " + saldo;
    }
}