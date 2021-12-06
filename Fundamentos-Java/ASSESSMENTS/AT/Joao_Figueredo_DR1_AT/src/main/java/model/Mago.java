package model;

import java.util.List;

import exception.AtributosExcedidosException;
import exception.NumeroNegativoException;
import exception.NumeroNuloException;
import exception.SkillsInvalidasException;

public class Mago extends Personagem{
	
	private int inteligencia;
	private int sabedoria;
	private int sorte;
	private List<String> magias;
		
	public Mago(int inteligencia, int sabedoria, int sorte, List<String> magias) throws SkillsInvalidasException , NumeroNegativoException , NumeroNuloException, AtributosExcedidosException{
		super();
		
		if(inteligencia < 0 || sabedoria < 0 || sorte < 0) {throw new NumeroNegativoException("Habilidades n�o podem ser negativas.");}
		if(inteligencia > 10 || sabedoria > 10 || sorte > 10) {throw new AtributosExcedidosException("Atributos excedidos. N�vel m�ximo de atributos: 10.");}
		if(inteligencia == 0 || sabedoria == 0 || sorte == 0) {throw new NumeroNuloException("Habilidades n�o podem ser iguais � 0.");}
		if(magias.isEmpty()) {throw new SkillsInvalidasException("Habilidades inv�lidas, insira uma habilidade.");}
		
		this.inteligencia = inteligencia;
		this.sabedoria = sabedoria;
		this.sorte = sorte;
		this.magias = magias;
	}
	
	public int getInteligencia() {
		return inteligencia;
	}
	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}
	
	public int getSabedoria() {
		return sabedoria;
	}
	public void setSabedoria(int sabedoria) {
		this.sabedoria = sabedoria;
	}
	public int getSorte() {
		return sorte;
	}
	public void setSorte(int sorte) {
		this.sorte = sorte;
	}
	public List<String> getMagias() {
		return magias;
	}
	public void setMagias(List<String> magias) {
		this.magias = magias;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Mago [inteligencia=");
		builder.append(inteligencia);
		builder.append(", sabedoria=");
		builder.append(sabedoria);
		builder.append(", sorte=");
		builder.append(sorte);
		builder.append(", magias=");
		builder.append(magias);
		builder.append("]");
		return builder.toString();
	}
	 
}
