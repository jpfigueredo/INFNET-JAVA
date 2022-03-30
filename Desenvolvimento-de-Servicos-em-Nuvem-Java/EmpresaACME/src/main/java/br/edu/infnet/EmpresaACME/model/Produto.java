package br.edu.infnet.EmpresaACME.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "produto")
public class Produto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_produto")
	private int id;

	private String nome;

	@OneToOne(cascade = { CascadeType.PERSIST, CascadeType.REMOVE }, orphanRemoval = true)
	@JoinColumn(name = "id_cotacao")
	private Cotacao cotacao;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_fornecedor")
	private List<Fornecedor> fornecedores;


	public Produto() {
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public Cotacao getCotacao() {
		return cotacao;
	}

	public List<Fornecedor> getFornecedores() {
		return fornecedores;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCotacao(Cotacao cotacao) {
		this.cotacao = cotacao;
	}

	public void setFornecedores(List<Fornecedor> fornecedores) {
		this.fornecedores = fornecedores;
	}
	
}
