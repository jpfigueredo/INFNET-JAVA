package br.edu.infnet.VenturaHr.model;

import javax.persistence.*;

@Entity
@Table(name = "companies")
public class Company {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String type;
	private String cnpj;
	private String razaoSocial;

	public Company() {}

	public Company(Integer id, String type, String cnpj, String razaoSocial) {
		this.id = id;
		this.type = type;
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Company{" +
				"id=" + id +
				", type='" + type + '\'' +
				", cnpj='" + cnpj + '\'' +
				", razaoSocial='" + razaoSocial + '\'' +
				'}';
	}
}
