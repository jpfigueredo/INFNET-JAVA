package br.infnet.edu.infra;

import java.util.HashMap;
import br.infnet.edu.domain.Contato;
import java.util.ArrayList;


public class ContatoRepository {
    private HashMap<Integer, Contato> contatos = new HashMap<>();
    
    public ArrayList<Contato> listar(){
        return new ArrayList(contatos.values());
    }
    
    public void inserirContato(Contato contato){
        
        if(contato.getId() == 0){
            
            int id = contatos.values().size() + 1;
            contato.setId(id);
            contatos.put(id, contato);
        }
        
    }
    public Contato obterContato(int id){
        return contatos.get(id);
    }

    public void alterarContato(Contato contato) {
        Contato temp = contatos.get(contato.getId());
        temp.setNome(contato.getNome());
        temp.setEmail(contato.getEmail());
        temp.setTelefone(contato.getTelefone());
        contatos.put(temp.getId(), temp);
        
        
    }
}
