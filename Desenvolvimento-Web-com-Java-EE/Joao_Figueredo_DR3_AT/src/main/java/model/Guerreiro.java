package model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

import exception.AtributosExcedidosException;
import exception.NumeroNegativoException;
import exception.NumeroNuloException;
import exception.SkillsInvalidasException;

@Entity
@Table(name="guerreiros")
public class Guerreiro extends Personagem{

	private int forca;
	private int resistencia;
	private int defesa;
	private List<String> meleeSkills;
		
	public Guerreiro() {}
	
	public Guerreiro(int forca, int resistencia, int defesa, List<String> meleeSkills) throws NumeroNegativoException, NumeroNuloException, SkillsInvalidasException, AtributosExcedidosException {
		super();
		
		if(forca < 0 || resistencia < 0 || defesa < 0) {throw new NumeroNegativoException("Habilidades nao podem ser negativas.");}
		if(forca > 10 || resistencia > 10 || defesa > 10) {throw new AtributosExcedidosException("Atributos excedidos. Nivel maximo de atributos: 10.");}
		if(forca == 0 || resistencia == 0 || defesa == 0) {throw new NumeroNuloException("Habilidades nao podem ser iguais a 0.");}
		if(meleeSkills.isEmpty()) {throw new SkillsInvalidasException("Habilidades invalidas, insira uma habilidade.");}
		
		this.forca = forca;
		this.resistencia = resistencia;
		this.defesa = defesa;
		this.meleeSkills = meleeSkills;
		
	}

	public int getForca() {
		return forca;
	}
	public void setForca(int forca) {
		this.forca = forca;
	}
	
	public int getResistencia() {
		return resistencia;
	}
	public void setResistencia(int resistencia) {
		this.resistencia = resistencia;
	}
	
	public int getDefesa() {
		return defesa;
	}
	public void setDefesa(int defesa) {
		this.defesa = defesa;
	}
	
	public List<String> getMeleeSkills() {
		return meleeSkills;
	}
	public void setMeleeSkills(List<String> meleeSkills) {
		this.meleeSkills = meleeSkills;
	}
	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Guerreiro [forca=");
		builder.append(forca);
		builder.append(", resistencia=");
		builder.append(resistencia);
		builder.append(", defesa=");
		builder.append(defesa);
		builder.append(", meleeSkills=");
		builder.append(meleeSkills);
		builder.append("]");
		return builder.toString();
	}
	
}
