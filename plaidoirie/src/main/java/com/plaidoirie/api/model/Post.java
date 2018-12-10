package com.plaidoirie.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="post")
public class Post {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Long idpost;
	String titre;
	String contenu;
	// Date Date;
	public Long getIdpost() {
		return idpost;
	}
	public void setIdpost(Long idpost) {
		this.idpost = idpost;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getContenu() {
		return contenu;
	}
	public void setContenu(String contenu) {
		this.contenu = contenu;
	}
	
	

}
