package alura.orientacao.a.objeto;

public class ByteBank {

    public static void main(String[] args) {
        
        Conta contaJoao = new Conta();
        contaJoao.depositar(200);
        System.out.println(contaJoao);
        
        
        Conta contaLele = new Conta();
        contaLele.depositar(1000);
        
        Conta contaVovs = new Conta();
        contaVovs.transfere(110, contaLele);
        
        System.out.println(contaLele.saldo);
        System.out.println(contaVovs.saldo);
        
        boolean sucessoTransferencia = contaLele.transfere(100, contaVovs);
        
        System.out.println(contaLele.saldo);
        System.out.println(contaVovs.saldo);
        
        if(sucessoTransferencia){
            System.out.println("Transferencia feita com sucesso!");
        }else{
            System.out.println("Faltou dinheiro.");
        }
        
        //contaJoao.titular = "Joao Figueredo";
        //System.out.println(contaJoao.titular);
        
    }
    
}