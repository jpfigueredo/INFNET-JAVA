package br.infnet.edu.hotel;


public class Gerente {
    int id_gerente;
    String nome_gerente;
    String endereço_gerente;
    String telefone_gerente;
    
    public Gerente(){}

        
    
//    public void cadastrarSuite(){
        //if gerente cadastrarSuite
//    }
    
    
    @Override
    public String toString() {
        return ("ID: "+id_gerente+"\nNome: "+nome_gerente+"\nEndereço: "+endereço_gerente+"\nTelefone: "+telefone_gerente);
    }
    
}
