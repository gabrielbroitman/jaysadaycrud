package com.weedem.jsaday.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity(name="Droga")
@Table(name="Drogas")
public class Droga {

	@Id
	@GeneratedValue
	@Column(name ="id_droga")
	private Long id;

	@NotNull
	@Column(name = "nome_droga")
	private String nome;
	
	@Column(name="descricao_droga")
	private String descricao;

	@OneToMany(mappedBy = "categoria", cascade = { CascadeType.PERSIST, CascadeType.MERGE }, orphanRemoval =true)
	private List<AssociacaoCategoriaDroga> categorias;
	
	@OneToMany(mappedBy = "user", cascade = { CascadeType.PERSIST, CascadeType.MERGE }, orphanRemoval =true)
	private List<AssociacaoUserDroga> users;
	
	@Column(name ="img_droga")
	private byte[] imagem;
	
	
	public void addCategoria(AssociacaoCategoriaDroga categoria) {
		this.categorias.add(categoria);
		categoria.setDroga(this);
	}
	
	public void removeCategoria(AssociacaoCategoriaDroga categoria) {
		this.categorias.remove(categoria); 
		categoria.setDroga(this);
	}
	
	
	public void addUser(AssociacaoUserDroga user) {
		this.users.add(user);
		user.setDroga(this);
	}
	
	public void removeUser(AssociacaoUserDroga user) {
		this.users.remove(user); 
		user.setDroga(this);
	}
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public byte[] getImagem() {
		return imagem;
	}

	public void setImagem(byte[] imagem) {
		this.imagem = imagem;
	}



}