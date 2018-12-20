package com.plaidoirie.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name="compte")
public class Compte {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column (unique=true)
	private String login;
	
	private String password;

	@OneToOne
	@JoinColumn(name="compte_id")
	private User user;
	
	public Compte() {}
	
	
	public Compte(Long idCompte, String login, String password) {
		this.id = idCompte;
		this.login = login;
		this.password = password;
	}


	public Long getId() {
		return id;
	}
	
	public void setId(Long idCompte) {
		this.id = idCompte;
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

	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}
}
