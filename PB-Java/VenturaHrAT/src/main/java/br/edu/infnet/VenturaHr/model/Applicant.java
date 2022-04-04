package br.edu.infnet.VenturaHr.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="applicants")
public class Applicant {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String cpf;
	private String name;
	private String address;
	private String phone;
	private String email;
	
	@ManyToOne
	@JoinColumn(name = "idUser")
	private User user;

	@JsonIgnore
	@JoinColumn(name = "idVacancy", referencedColumnName = "id")
	@ManyToOne(optional = true)
	private Vacancy vacancy;

	public Applicant() {
	}

	public Applicant(String name, String email, String cpf, String address, String phone) {

		this.name = name;
		this.email = email;
		this.cpf = cpf;
		this.address = address;
		this.phone = phone;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Vacancy getVacancy() {
		return vacancy;
	}

	public void setVacancy(Vacancy vacancy) {
		this.vacancy = vacancy;
	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(name);
		sb.append(" ; ");
		sb.append(email);
		sb.append(" ; ");
		sb.append(cpf);
		sb.append(" ; ");
		sb.append(address);
		sb.append(" ; ");
		sb.append(phone);

		return sb.toString();
	}

}
