package model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

import exception.AtributosExcedidosException;
import exception.NumeroNegativoException;
import exception.NumeroNuloException;
import exception.SkillsInvalidasException;

@Entity
@Table(name="arqueiros")
public class Arqueiro extends Personagem{
	
	private int agilidade;
	private int dextreza;
	private int sorte;
	private List<String> rangedSkills;
	
	public Arqueiro() {}
	
	public Arqueiro(int agilidade, int dextreza, int sorte, List<String> rangedSkills) throws SkillsInvalidasException , NumeroNegativoException , NumeroNuloException, AtributosExcedidosException{
		super();
		
		if(agilidade < 0 || dextreza < 0 || sorte < 0) {throw new NumeroNegativoException("Habilidades nao podem ser negativas.");}
		if(agilidade > 10 || dextreza > 10 || sorte > 10) {throw new AtributosExcedidosException("Atributos excedidos. Nivel maximo de atributos: 10.");}
		if(agilidade == 0 || dextreza == 0 || sorte == 0) {throw new NumeroNuloException("Habilidades nao podem ser iguais � 0.");}
		if(rangedSkills.isEmpty()) {throw new SkillsInvalidasException("Habilidades invalidas, insira uma habilidade.");}
		
		this.agilidade = agilidade;
		this.dextreza = dextreza;
		this.sorte = sorte;
		this.rangedSkills = rangedSkills;
	}
	
	public int getAgilidade() {
		return agilidade;
	}
	public void setAgilidade(int agilidade) {
		this.agilidade = agilidade;
	}
	public int getDextreza() {
		return dextreza;
	}
	public void setDextreza(int dextreza) {
		this.dextreza = dextreza;
	}
	public int getSorte() {
		return sorte;
	}
	public void setSorte(int sorte) {
		this.sorte = sorte;
	}
	public List<String> getRangedSkills() {
		return rangedSkills;
	}
	public void setRangedSkills(List<String> rangedSkills) {
		this.rangedSkills = rangedSkills;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Arqueiro [agilidade=");
		builder.append(agilidade);
		builder.append(", dextreza=");
		builder.append(dextreza);
		builder.append(", sorte=");
		builder.append(sorte);
		builder.append(", rangedSkills=");
		builder.append(rangedSkills);
		builder.append("]");
		return builder.toString();
	}

	
}
