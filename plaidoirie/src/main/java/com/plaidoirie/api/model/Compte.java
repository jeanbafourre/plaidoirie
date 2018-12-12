package com.plaidoirie.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="compte")
public class Compte {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idCompte")
	private Long idCompte;
	@Column (unique=true)
	private String login;
	private String password;
	
	
	public Compte() {}
	
	
	public Compte(Long idCompte, String login, String password) {
		this.idCompte = idCompte;
		this.login = login;
		this.password = password;
	}


	public Long getIdCompte() {
		return idCompte;
	}
	
	public void setIdCompte(Long idCompte) {
		this.idCompte = idCompte;
	}
	
	public String getLogin() {
		return login;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}


}
