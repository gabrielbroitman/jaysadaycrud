package com.weedem.jsaday.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name = "AssociacaoCategoriaDroga")
@Table(name = "rl_categoria_droga")
public class AssociacaoCategoriaDroga {

	@Id
	@GeneratedValue
	private Long id;

	@ManyToOne
	@JoinColumn(name = "id_categoria")
	private Categoria categoria;

	@ManyToOne
	@JoinColumn(name = "id_droga")
	private Droga droga;

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Droga getDroga() {
		return droga;
	}

	public void setDroga(Droga droga) {
		this.droga = droga;
	}

}