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
	private Long idpost;
	private String titre;
	private String contenu;
	// Date Date;
	
	
	public Post() {}
	
	
	public Post(Long idpost, String titre, String contenu) {
		this.idpost = idpost;
		this.titre = titre;
		this.contenu = contenu;
	}
	
	
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
