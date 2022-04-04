package br.edu.infnet.VenturaHr.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "vacanciesApplicants")
public class VacancyApplicant {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@OneToOne()
	@JoinColumn(name = "idApplicant")
	private Applicant applicant;

	@ManyToMany()
	private List<Vacancy> vacancies;

	@JsonIgnore
	@JoinColumn(name = "idUser", referencedColumnName = "id", nullable = false)
	@ManyToOne(optional = false)
	private User user;
	
	public VacancyApplicant() {}

	public VacancyApplicant(Applicant applicant) {
		this.applicant = applicant;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Applicant getApplicant() {
		return applicant;
	}

	public void setApplicant(Applicant applicant) {
		this.applicant = applicant;
	}

	public List<Vacancy> getVacancies() {
		return vacancies;
	}

	public void setVacancies(List<Vacancy> vacancies) {
		this.vacancies = vacancies;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "VacancyApplicant{" +
				"id=" + id +
				", applicant=" + applicant +
				", vacancies=" + vacancies +
				", user=" + user +
				'}';
	}
}
