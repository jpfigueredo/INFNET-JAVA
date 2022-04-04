package br.edu.infnet.EmpresaACME.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Fornecedores")
public class Fornecedor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_fornecedor")
	private int id;

	private String nome;

//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "id_produto")
//	private List<Produto> produtos;

//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "id_contato")
//	private List<Contato> contatos;

//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "id_cotacao")
//	private List<Cotacao> cotacoes;

	public Fornecedor() {
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}
//
//	public List<Produto> getProdutos() {
//		return produtos;
//	}

//	public List<Contato> getContatos() {
//		return contatos;
//	}

//	public List<Cotacao> getCotacoes() {
//		return cotacoes;
//	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

//	public void setProdutos(List<Produto> produtos) {
//		this.produtos = produtos;
//	}

//	public void setContatos(List<Contato> contatos) {
//		this.contatos = contatos;
//	}

//	public void setCotacoes(List<Cotacao> cotacoes) {
//		this.cotacoes = cotacoes;
//	}

}
