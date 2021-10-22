package br.infnet.edu.poo.aula1;

public class Conta {
    private int num;
    private String nome;
    protected double saldo;
/*  Na herança, só é possivel usar a variável "saldo" porque está protected
    Caso contrário, precisaria usar o getSaldo.
*/
        
    public Conta(){}
    
    public Conta(int num, String nome, double saldo){
        this.num = num;
        this.nome = nome;
        this.saldo = saldo;
    }
       
    public void setNum(double valor){
        this.saldo = saldo;
    }
    
    public double getNum(){
        return saldo;
    }
           
    public void setNome(double valor){
        this.saldo = saldo;
    }
    
    public double getNome(){
        return saldo;
    }
    
    public void setSaldo(double valor){
        this.saldo = saldo;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
      
    
    public String debitar(double valor){
        if(valor <= 0){
            return "Valor Inválido";
        } else{
            saldo += valor;
            return "Valor Creditado";
        }
    }
    
    public String creditar(double valor){
        if(valor <= 0){
            return "Valor Inválido";
        } else{
            saldo += valor;
            return "Valor Creditado";
        }
    }
    
    
    
    //sobrescrita de método
    @Override
    public String toString(){
        return num + " " + nome + " " + saldo;
    }
    
}
