package com.plaidoirie.api.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name="avocat")
public class Avocat extends User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idAvocat;	
	
	@Column(unique = true)
	private Long numeroDeToque;
	
	@OneToMany(mappedBy = "avocat")
	private List<Commentaire> commentaires;
	
	@OneToMany(mappedBy = "avocat")
	private List<Dossier> dossiers;
	
	public Avocat() {}

	public Avocat(Long idAvocat, Long numeroDeToque) {
		this.idAvocat = idAvocat;
		this.numeroDeToque = numeroDeToque;
	}

	public Long getId() {
		return idAvocat;
	}
	
	public void setId(Long idAvocat) {
		this.idAvocat = idAvocat;
	}
	
	public Long getNumeroDeToque() {
		return numeroDeToque;
	}
	
	public void setNumeroDeToque(Long numeroDeToque) {
		this.numeroDeToque = numeroDeToque;
	}

	public Long getIdAvocat() {
		return idAvocat;
	}

	public void setIdAvocat(Long idAvocat) {
		this.idAvocat = idAvocat;
	}

	public List<Commentaire> getCommentaires() {
		return commentaires;
	}

	public void setCommentaires(List<Commentaire> commentaires) {
		this.commentaires = commentaires;
	}

	public List<Dossier> getDossiers() {
		return dossiers;
	}

	public void setDossiers(List<Dossier> dossiers) {
		this.dossiers = dossiers;
	}
	
	
	
	
}