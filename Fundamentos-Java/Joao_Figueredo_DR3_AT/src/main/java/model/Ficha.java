package model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import exception.JogadorInexistenteException;
import exception.PersonagensNulosExceptions;

@Entity
@Table(name="fichas")
public class Ficha{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@OneToMany
	private Equipamento equipamentos;
	
	@ManyToOne
	private Jogador jogador;
	
	@OneToMany
	private List<Personagem> personagens;
	
	private LocalDateTime data;
	
	public Ficha() {}
	
	public Ficha(Jogador jogador) throws JogadorInexistenteException {
		if(jogador == null) {throw new JogadorInexistenteException("Jogador inexistente!");}
		this.jogador = jogador;
		this.data = LocalDateTime.now();
	}
	
    public void impressao() throws PersonagensNulosExceptions {
        System.out.println("Cadastro de personagens: ");
        for(Personagem p : personagens){
            System.out.println(p);
        }
        if (personagens.size() <= 0){
          throw new PersonagensNulosExceptions("Personagens serão registrados" + " \n "+ "Loading...");
            
        }
    }
	
	
	public String obterLinhaGravacaoArquivo() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(personagens.toString());
		sb.append(";");
		sb.append(jogador.getNome());
		sb.append(";");
		sb.append(equipamentos.toString());
		sb.append(";");
		sb.append(personagens.size());
		sb.append("\r\n");
		
		return sb.toString();
	}

	public List<Personagem> getPersonagem() {
		return personagens;
	}

	public void setPersonagem(List<Personagem> personagens) {
		this.personagens = personagens;
	}

	public Equipamento getEquipamentos() {
		return equipamentos;
	}

	public void setEquipamento(Equipamento equipamentos) {
		this.equipamentos = equipamentos;
	}

	public Jogador getJogador() {
		return jogador;
	}

	public LocalDateTime getData() {
		return data;
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Ficha [personagem=");
		builder.append(personagens);
		builder.append(", equipamentos=");
		builder.append(equipamentos);
		builder.append(", usuario=");
		builder.append(jogador);
		builder.append("]");
		return builder.toString();
	}
		
}
