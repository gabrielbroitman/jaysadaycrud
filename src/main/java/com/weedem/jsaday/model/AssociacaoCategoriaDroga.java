package com.weedem.jsaday.model;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


public class AssociacaoCategoriaDroga {
	
	@ManyToOne
	@JoinColumn(name = "id_categoria")
	private Categoria categoria;
	
	@ManyToOne
	@JoinColumn(name = "id_droga")
	private Droga droga;
	

}
