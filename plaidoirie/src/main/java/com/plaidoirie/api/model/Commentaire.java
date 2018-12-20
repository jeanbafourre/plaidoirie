package com.plaidoirie.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name="commentaire")
public class Commentaire {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="avocat_id")
	private Avocat avocat;
	
	public Commentaire() {}
	

	public Commentaire(Long idCommentaire) {
		this.id = idCommentaire;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long idCommentaire) {
		this.id = idCommentaire;
	}

	public Avocat getAvocat() {
		return avocat;
	}

	public void setAvocat(Avocat avocat) {
		this.avocat = avocat;
	}
	
	
}
