package com.weedem.jsaday.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity(name="User")
@Table(name="Users")
public class User {
	
	@Id
	@GeneratedValue
	@Column(name ="id_user")
	private Long id;

	@NotNull
	@Column(name ="nome_user")
	private String nome;
	
	@NotNull
	@Column(name ="idade_user")
	private Long idade;

	@NotNull
	@Column(name = "email_user")
	private String email;

	@NotNull
	@Column(name = "senha_user")
	private String senha;
	
	@Column(name ="img_user")
	private byte[] imagem;
	
	@OneToMany(mappedBy = "user", cascade = { CascadeType.PERSIST, CascadeType.MERGE }, orphanRemoval =true)
	private List<AssociacaoUserDroga> drogas = new ArrayList<>();
	
	public void addDroga(AssociacaoUserDroga droga) {
		drogas.add(droga);
		droga.setUser(this);
	}
	
	public void removeDroga(AssociacaoUserDroga droga) {
		drogas.remove(droga);
		droga.setUser(this);
	}
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getIdade() {
		return idade;
	}

	public void setIdade(Long idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

}