package br.edu.infnet.VenturaHr.model;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "usuarios", catalog = "sdi_m_2021", schema = "", uniqueConstraints = {
		@UniqueConstraint(columnNames = { "cpf" }), @UniqueConstraint(columnNames = { "email" }) })
@NamedQueries({ @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u"),
		@NamedQuery(name = "Usuario.findById", query = "SELECT u FROM Usuario u WHERE u.id = :id"),
		@NamedQuery(name = "Usuario.findByNome", query = "SELECT u FROM Usuario u WHERE u.nome = :nome"),
		@NamedQuery(name = "Usuario.findByEndereco", query = "SELECT u FROM Usuario u WHERE u.endereco = :endere�o"),
		@NamedQuery(name = "Usuario.findByTelefone", query = "SELECT u FROM Usuario u WHERE u. telefone = :telefone"),
		@NamedQuery(name = "Usuario.findByEmail", query = "SELECT u FROM Usuario u WHERE u.email = :email"),
		@NamedQuery(name = "Usuario.findBySenha", query = "SELECT u FROM Usuario u WHERE u.senha = :senha"),
		@NamedQuery(name = "Usuario.findByCpf", query = "SELECT u FROM Usuario u WHERE u.cpf = :cpf"),
		@NamedQuery(name = "Usuario.findByRazaoSocial", query = "SELECT u FROM Usuario u WHERE u.razaoSocial"),
		@NamedQuery(name = "Usuario.findByCnpj", query = "SELECT u FROM Usuario u WHERE u.cnpj = :cnpj "),
		@NamedQuery(name = "Usuario.findByTipo", query = "SELECT u FROM Usuario u WHERE u.tipo = :tipo") })

public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	private Integer id;	
	
	private String nome;
	private String endereco;
	private String telefone;
	private String email;
	private String senha;
	private boolean isAdmin;
	
	
	public Usuario() {}
	
	public Usuario(String nome, String senha) {}
	
	
	public boolean isAdmin() {
		return isAdmin;
	}

	public void setEmpresa(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	

}
