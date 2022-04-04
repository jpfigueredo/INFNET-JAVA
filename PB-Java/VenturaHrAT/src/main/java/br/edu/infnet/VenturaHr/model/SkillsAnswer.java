package br.edu.infnet.VenturaHr.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "skills_answer")
public class SkillsAnswer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@JsonIgnore
	@JoinColumn(name = "idSkill", referencedColumnName = "id", nullable = false)
	@ManyToOne(optional = false)
	private Skills skill;

	public SkillsAnswer() {
	}

	public SkillsAnswer(Integer id, Skills skill) {
		this.id = id;
		this.skill = skill;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Skills getSkill() {
		return skill;
	}

	public void setSkill(Skills skill) {
		this.skill = skill;
	}

	@Override
	public String toString() {
		return "SkillsAnswer{" +
				"id=" + id +
				", skill=" + skill +
				'}';
	}
}
