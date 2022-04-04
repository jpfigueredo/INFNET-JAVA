package br.edu.infnet.EmpresaACME.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "produtos")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_produto")
	private int id;

	private String nome;

//	@OneToMany()
//	@JoinColumn(name = "id_cotacao")
//	private Cotacao cotacao;

//	@ManyToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "id_fornecedor")
//	private List<Fornecedor> fornecedores;

	public Produto() {
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

//	public Cotacao getCotacao() {
//		return cotacao;
//	}
//
//	public List<Fornecedor> getFornecedores() {
//		return fornecedores;
//	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

//	public void setCotacao(Cotacao cotacao) {
//		this.cotacao = cotacao;
//	}
//
//	public void setFornecedores(List<Fornecedor> fornecedores) {
//		this.fornecedores = fornecedores;
//	}

//	@Override
//	public String toString() {
//		return "Produto [id=" + id + ", nome=" + nome + ", cotacao=" + cotacao + ", fornecedores=" + fornecedores + "]";
//	}

}
