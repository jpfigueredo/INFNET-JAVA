package br.edu.infnet.poo1;

public class Conta {
    private int num;
    private String nome;
    protected double saldo;

    public Conta() { }
    
    public Conta(int num, String nome, double saldo) {
        this.num = num;
        this.nome = nome;
        this.saldo = saldo;
    }
    
    public void setNum(int num) {
        this.num = num;        
    }
    
    public int getNum() {
        return num;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
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
        return num + " " + nome + " " + saldo;
    }
}