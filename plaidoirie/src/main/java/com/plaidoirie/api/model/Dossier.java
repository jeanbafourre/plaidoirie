package com.plaidoirie.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="dossier")
public class Dossier {
	
	@Id
	@Column(unique=true)
	private Long numeroRG;
		

	public Dossier() {}
	

	public Dossier(Long numeroRG) {
		this.numeroRG = numeroRG;
	}


	public Long getNumeroRG() {
		return numeroRG;
	}

	public void setNumeroRG(Long numeroRG) {
		this.numeroRG = numeroRG;
	}


	
	

}
