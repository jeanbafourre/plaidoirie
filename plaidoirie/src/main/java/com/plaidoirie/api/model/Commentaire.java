package com.plaidoirie.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="commentaire")
public class Commentaire {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idCommentaire;
	
	public Commentaire() {}
	
	

	public Commentaire(Long idCommentaire) {
		this.idCommentaire = idCommentaire;
	}



	public Long getIdCommentaire() {
		return idCommentaire;
	}

	public void setIdCommentaire(Long idCommentaire) {
		this.idCommentaire = idCommentaire;
	}
	
}
