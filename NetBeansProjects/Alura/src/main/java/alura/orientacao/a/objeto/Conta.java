package alura.orientacao.a.objeto;

public class Conta {
//        saldo/agencia/numero/titular
//        saca/deposita/transfere
    double saldo;
    int agencia;
    int numero;
    Cliente titular;
    
    boolean sacar(double pValor){
        if(this.saldo >= pValor){
            this.saldo -= pValor;
            return true;
        }else{
            return false;
        }
    }
    void depositar(double pValor){
        this.saldo += pValor;
    }
    
    boolean transfere(double pValor, Conta destino){
        if(this.saldo >= pValor){
            this.saldo -= pValor;
            destino.depositar(pValor);
            return true;
        }
        return false;    
    }
    

    @Override
    public String toString() {
        return ("Saldo: "+ this.saldo +"\n Agência: "+ this.agencia +"\n Número: "+this.numero +"\n Titular: "+ this.titular);
    }
    
    
    
}
