package br.edu.infnet.VenturaHr.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="empresas")
public class Empresa extends Usuario {

	private static final long serialVersionUID = 1L;

	private String tipo;
	private String cnpj;
	private String razao_social;

	public Empresa() {
		super();
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazao_social() {
		return razao_social;
	}

	public void setRazao_social(String razao_social) {
		this.razao_social = razao_social;
	}

}
