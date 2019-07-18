package com.weedem.jsaday.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Droga {

	@Id
	@GeneratedValue
	@Column(name ="idDroga")
	private Long id;

	@Column(name = "nomeDroga")
	private String nome;
	
	@Column
	private String descricao;

	@OneToMany(mappedBy = "categoria", cascade = { CascadeType.PERSIST, CascadeType.MERGE }, orphanRemoval =true)
	private List<AssociacaoCategoriaDroga> categorias;
	
	
	private byte[] imagem;
	

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
