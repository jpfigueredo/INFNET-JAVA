package br.edu.infnet.poo1;

public class ContaPJ extends Conta {
    private String cnpj;

    public ContaPJ() { }
    
    public ContaPJ(int num, String nome, double saldo, String cnpj) {
        super(num, nome, saldo);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    @Override
    public String toString() {
        return super.toString() + " " + cnpj;
    }   
}
