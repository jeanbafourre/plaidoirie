package com.plaidoirie.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name="post")
public class Post {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	
	private String titre;
	
	
	private String contenu;
	// Date Date;
	
	
	@ManyToOne 
	@JoinColumn(name="post_id")
	private Justiciable justiciable;
	
	public Post() {}
	
	
	public Post(Long idpost, String titre, String contenu) {
		this.id = idpost;
		this.titre = titre;
		this.contenu = contenu;
	}
	
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long idpost) {
		this.id = idpost;
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
