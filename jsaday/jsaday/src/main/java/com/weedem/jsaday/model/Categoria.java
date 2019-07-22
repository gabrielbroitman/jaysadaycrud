package com.weedem.jsaday.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity(name="Categoria")
@Table(name="categorias")
public class Categoria {

	@Id
	@GeneratedValue
	private Long id;

	@NotNull
	private String nome;
	
	@OneToMany(mappedBy = "categoria", cascade = { CascadeType.PERSIST, CascadeType.MERGE }, orphanRemoval = true)
	List<AssociacaoCategoriaDroga> drogas = new ArrayList<>();

	public void addCategoria(AssociacaoCategoriaDroga droga) {
		this.drogas.add(droga);
		droga.setCategoria(this);
	}

	public void removeCategoria(AssociacaoCategoriaDroga droga) {
		this.drogas.remove(droga);
		droga.setCategoria(this);
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

}