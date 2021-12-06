package alura.orientacao.a.objeto;

public class Cliente {
    String nome;
    String cpf;
    String profissao;

    @Override
    public String toString() {
        return "Nome: "+this.nome+"\nCPF: " + this.cpf+"\nProfissão: " + this.profissao;
    }
    
}
