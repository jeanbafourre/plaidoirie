package com.plaidoirie.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table (name="commentaire")
public class Commentaire {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@NotBlank
	@Column(name="idCommentaire")
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
