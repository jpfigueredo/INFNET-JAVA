package br.edu.infnet.VenturaHr.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="candidatos")
public class Candidato extends Usuario {
	private static final long serialVersionUID = 1L;

	private String cpf;

	public Candidato() {
		super();
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
