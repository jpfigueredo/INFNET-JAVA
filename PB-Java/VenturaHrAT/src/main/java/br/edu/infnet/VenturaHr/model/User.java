package br.edu.infnet.VenturaHr.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	private Integer id;
	private String name;
	private String email;
	private String password;
	private String type;
	private String cnpj;

	@ManyToMany()
	@JoinTable(name = "idVacancy")
	private List<Vacancy> vacancies;
	
	@OneToMany()
	@JoinColumn(name = "idApplicant")
	private List<Applicant> applicants;
	
	@OneToMany()
	@JoinColumn(name = "idVacancyApplicant")
	private List<VacancyApplicant> vacancyApplicant;

	public User() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<VacancyApplicant> getVacancyApplicant() {
		return vacancyApplicant;
	}

	public void setVacancyApplicant(List<VacancyApplicant> vacancyApplicant) {
		this.vacancyApplicant = vacancyApplicant;
	}

	public List<Applicant> getApplicants() {
		return applicants;
	}

	public void setApplicants(List<Applicant> applicants) {
		this.applicants = applicants;
	}

	public List<Vacancy> getVacancies() {
		return vacancies;
	}

	public void setVacancies(List<Vacancy> vacancies) {
		this.vacancies = vacancies;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", name='" + name + '\'' +
				", email='" + email + '\'' +
				", password='" + password + '\'' +
				", type='" + type + '\'' +
				", cnpj='" + cnpj + '\'' +
				", vacancies=" + vacancies +
				", applicants=" + applicants +
				", vacancyApplicant=" + vacancyApplicant +
				'}';
	}
}
