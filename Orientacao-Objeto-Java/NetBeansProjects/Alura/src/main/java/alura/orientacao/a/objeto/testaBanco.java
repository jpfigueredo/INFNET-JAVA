package alura.orientacao.a.objeto;

public class testaBanco {
    
    public static void main(String[] args) {
        
        Cliente joao = new Cliente();    
        joao.nome = "joao pedro";
        joao.cpf = "16281332792";
        joao.profissao = "programador";

        Conta contaJoao = new Conta();
        contaJoao.depositar(100);
        contaJoao.titular = joao; //Cliente joao, associação por referencia

        System.out.println(contaJoao.titular.nome);
    
    }
}
