package br.edu.infnet.VenturaHr.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "vagas")
public class Vaga implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(nullable = false)
	private Integer id;

	@Basic(optional = false)
	@Column(nullable = false, length = 45)
	private String cargo;

	@Basic(optional = false)
	@Column(nullable = false, length = 45)
	private String cidade;

	@Basic(optional = false)
	@Column(name = "forma_contratacao", nullable = false, length = 45)
	private String formaContratacao;

	@Column(name = "id_candidato", nullable = false)
	@JoinColumn(name = "id_candidato", referencedColumnName = "id", nullable = false)
	@OneToMany()
	private Candidato candidato;

	@Column(name = "id_criterio", nullable = false)
	@JoinColumn(name = "id_criterio", referencedColumnName = "id", nullable = false)
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "vaga")
	private List<Criterio> criterioList;

	public Vaga() {
	}

	public Integer getId() {
		return id;
	}

	public String getCargo() {
		return cargo;
	}

	public String getCidade() {
		return cidade;
	}

	public String getFormaContratacao() {
		return formaContratacao;
	}

	public Candidato getCandidato() {
		return candidato;
	}

	public List<Criterio> getCriterioList() {
		return criterioList;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public void setFormaContratacao(String formaContratacao) {
		this.formaContratacao = formaContratacao;
	}

	public void setCandidato(Candidato candidato) {
		this.candidato = candidato;
	}

	public void setCriterioList(List<Criterio> criterioList) {
		this.criterioList = criterioList;
	}

}