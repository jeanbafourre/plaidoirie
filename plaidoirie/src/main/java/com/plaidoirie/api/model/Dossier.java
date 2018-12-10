package com.plaidoirie.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name="dossier")
public class Dossier {
	@Column(unique=true)
	Long numeroRG;

	public Long getNumeroRG() {
		return numeroRG;
	}

	public void setNumeroRG(Long numeroRG) {
		this.numeroRG = numeroRG;
	}


	
	

}
