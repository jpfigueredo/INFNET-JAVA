package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="equipamentos")
public class Equipamento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name = "id_personagem")
	private Personagem personagem;
	
	private String armaPrincipal;
	private String armaSecundaria;
	private String roupas;

	public Equipamento() {}
	
	public Equipamento(Personagem personagem, String armaPrincipal, String armaSecundaria, String roupas) {
		this.personagem = personagem;
		this.armaPrincipal = armaPrincipal;
		this.armaSecundaria = armaSecundaria;
		this.roupas = roupas;
	}

	public String getArmaPrincipal() {
		return armaPrincipal;
	}

	public void setArmaPrincipal(String armaPrincipal) {
		this.armaPrincipal = armaPrincipal;
	}

	public String getArmaSecundaria() {
		return armaSecundaria;
	}

	public void setArmaSecundaria(String armaSecundaria) {
		this.armaSecundaria = armaSecundaria;
	}

	public String getRoupas() {
		return roupas;
	}

	public void setRoupas(String roupas) {
		this.roupas = roupas;
	}

	public Personagem getPersonagem() {
		return personagem;
	}

	public void setPersonagem(Personagem personagem) {
		this.personagem = personagem;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Equipamento [armaPrincipal=");
		builder.append(armaPrincipal);
		builder.append(", armaSecundaria=");
		builder.append(armaSecundaria);
		builder.append(", roupas=");
		builder.append(roupas);
		builder.append("]");
		return builder.toString();
	}
}
