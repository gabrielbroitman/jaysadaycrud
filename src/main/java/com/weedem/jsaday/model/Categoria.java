package com.weedem.jsaday.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Categoria {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String nome;
	
	@OneToMany(mappedBy = "categoria", cascade = { CascadeType.PERSIST, CascadeType.MERGE }, orphanRemoval =true)
	List<AssociacaoCategoriaDroga> associacoesCategoriaDroga = new ArrayList<>();
	


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

	
}
