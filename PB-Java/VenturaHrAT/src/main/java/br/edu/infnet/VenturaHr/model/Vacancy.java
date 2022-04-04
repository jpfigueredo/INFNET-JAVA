package br.edu.infnet.VenturaHr.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;

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

@Entity
@Table(name = "vacancies")
public class Vacancy {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(nullable = false)
	private Integer id;

	@Basic(optional = false)
	@Column(nullable = false, length = 45)
	private String role;

	@Basic(optional = false)
	@Column(nullable = false, length = 45)
	private String city;

	@Basic(optional = false)
	@Column(name = "hiringModel", nullable = false, length = 45)
	private String hiringModel;

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
	@JoinColumn(name = "idUser", referencedColumnName = "id", nullable = false)
	@ManyToOne(optional = false)
	private User user;

	@Column(name = "idSkills", nullable = false)
	@JoinColumn(name = "idSkills", referencedColumnName = "id", nullable = false)
	@OneToMany()
	private List<Skills> skillsList;

	public Vacancy() {
	}

	public Vacancy(Integer id, String role, String city, String hiringModel, String description, int profile, int weight, User user, List<Skills> skillsList) {
		this.id = id;
		this.role = role;
		this.city = city;
		this.hiringModel = hiringModel;
		this.description = description;
		this.profile = profile;
		this.weight = weight;
		this.user = user;
		this.skillsList = skillsList;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getHiringModel() {
		return hiringModel;
	}

	public void setHiringModel(String hiringModel) {
		this.hiringModel = hiringModel;
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Skills> getSkillsList() {
		return skillsList;
	}

	public void setSkillsList(List<Skills> skillsList) {
		this.skillsList = skillsList;
	}

	@Override
	public String toString() {
		return "Vacancy{" +
				"id=" + id +
				", role='" + role + '\'' +
				", city='" + city + '\'' +
				", hiringModel='" + hiringModel + '\'' +
				", description='" + description + '\'' +
				", profile=" + profile +
				", weight=" + weight +
				", user=" + user +
				", skillsList=" + skillsList +
				'}';
	}
}