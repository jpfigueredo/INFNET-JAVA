package model;

import java.time.LocalDateTime;

import exception.InvalidLevelExpcetion;
import exception.InvalidNameException;
import exception.StatusExcedidosException;


public abstract class Personagem{
	
	private String nome;
	private int level;
	private double vida;
	private double mana;
	private double stamina;
	private LocalDateTime creationDate;
	
	public Personagem(){
		this.creationDate = LocalDateTime.now();
	}
	
	public Personagem(String nome, int level, int vida, int mana, int stamina) throws InvalidNameException, InvalidLevelExpcetion, StatusExcedidosException {

		if(nome == null) {throw new InvalidNameException("Nome nao pode ser nulo!");}
		if(level <= 0 || level > 100) {throw new InvalidLevelExpcetion("Level nao pode ser menor ou igual a 0 ou maior que 100.");}
		if(vida > 10000 || mana > 10000 || stamina > 10000) {throw new StatusExcedidosException("Status nao podem ser maiores que 10000.");}
		
		this.nome = nome;
		this.level = level;
		this.vida = vida;
		this.mana = mana;
		this.stamina = stamina;
		this.creationDate = LocalDateTime.now();
	}
	
	public String verificaVida() {return vida==0 ? "Personagem est� morto" : "Personagem est� vivo";}

	public String verificaMana() {return mana==0 ? "Sem mana!" : "Tem mana!";}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	
	public double getVida() {
		return vida;
	}
	public void setVida(double vida) {
		this.vida = vida;
	}
	
	public double getMana() {
		return mana;
	}
	public void setMana(double mana) {
		this.mana = mana;
	}
	
	public double getStamina() {
		return stamina;
	}
	public void setStamina(int stamina) {
		this.stamina = stamina;
	}
	
	public LocalDateTime getCreationDate() {
		return creationDate;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Personagem [nome=");
		builder.append(nome);
		builder.append(", level=");
		builder.append(level);
		builder.append(", vida=");
		builder.append(vida);
		builder.append(", mana=");
		builder.append(mana);
		builder.append(", stamina=");
		builder.append(stamina);
		builder.append("]");
		return builder.toString();
	}
		
}
