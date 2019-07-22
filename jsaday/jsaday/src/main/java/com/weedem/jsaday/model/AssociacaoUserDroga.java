package com.weedem.jsaday.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name = "AssociacaoUserDroga")
@Table(name = "rl_user_droga")
public class AssociacaoUserDroga {
	
    @Id
    @GeneratedValue
    private Long id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_user")
	private User user;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_droga")
	private Droga droga;

	private String motivacao;

	private Float qtd;

	public String getMotivacao() {
		return motivacao;
	}

	public void setMotivacao(String motivacao) {
		this.motivacao = motivacao;
	}

	public Float getQtd() {
		return qtd;
	}

	public void setQtd(Float qtd) {
		this.qtd = qtd;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Droga getDroga() {
		return droga;
	}

	public void setDroga(Droga droga) {
		this.droga = droga;
	}
}
