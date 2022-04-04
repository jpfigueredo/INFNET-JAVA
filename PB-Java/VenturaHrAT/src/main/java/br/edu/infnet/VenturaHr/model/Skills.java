package br.edu.infnet.VenturaHr.model;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="skills")
public class Skills{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(nullable = false)
	private Integer id;

	@Basic(optional = false)
	@Column(nullable = false, length = 45)
	private String description;

	@Basic(optional = false)
	@Column(nullable = false)
	private int profile;

	@Basic(optional = false)
	@Column(nullable = false)
	private int weight;

	@JsonIgnore
	@JoinColumn(name = "idVacancy", referencedColumnName = "id", nullable = false)
	@ManyToOne(optional = false)
	private Vacancy vacancy;
	
	@OneToMany(mappedBy = "skill")
	private Collection<SkillsAnswer> skillsAnswer;

	public Skills() {
	}

	public Skills(Integer id, String description, int profile, int weight, Vacancy vacancy, Collection<SkillsAnswer> skillsAnswer) {
		this.id = id;
		this.description = description;
		this.profile = profile;
		this.weight = weight;
		this.vacancy = vacancy;
		this.skillsAnswer = skillsAnswer;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getProfile() {
		return profile;
	}

	public void setProfile(int profile) {
		this.profile = profile;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public Vacancy getVacancy() {
		return vacancy;
	}

	public void setVacancy(Vacancy vacancy) {
		this.vacancy = vacancy;
	}

	public Collection<SkillsAnswer> getSkillsAnswer() {
		return skillsAnswer;
	}

	public void setSkillsAnswer(Collection<SkillsAnswer> skillsAnswer) {
		this.skillsAnswer = skillsAnswer;
	}

	@Override
	public String toString() {
		return "Skills{" +
				"id=" + id +
				", description='" + description + '\'' +
				", profile=" + profile +
				", weight=" + weight +
				", vacancy=" + vacancy +
				", skillsAnswer=" + skillsAnswer +
				'}';
	}
}