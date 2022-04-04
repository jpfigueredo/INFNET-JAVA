package br.edu.infnet.EmpresaACME.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Cotacoes")
public class Cotacao {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_cotacao")
	private int id;

	private double preco;

//	@OneToOne()
//	@JoinColumn(name = "id_produto")
//	private Produto produto;

//	@ManyToMany()
//	@JoinColumn(name = "id_fornecedor")
//	private Fornecedor fornecedor;

	public Cotacao() {
	}

	public Cotacao(double preco) {
		this.preco = preco;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

}
