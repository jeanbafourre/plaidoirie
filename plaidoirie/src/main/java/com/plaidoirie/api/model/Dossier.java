package com.plaidoirie.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name="dossier")
public class Dossier {
	
	@Id
	@Column(unique=true)
	private Long numeroRG;
		
	@ManyToOne 
	@JoinColumn(name="dossier_id")
	private Justiciable justiciable;
	
	@ManyToOne 
	@JoinColumn(name="dossier_id")
	private Avocat avocat;
	
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


	public Justiciable getJusticiable() {
		return justiciable;
	}


	public void setJusticiable(Justiciable justiciable) {
		this.justiciable = justiciable;
	}


	public Avocat getAvocat() {
		return avocat;
	}


	public void setAvocat(Avocat avocat) {
		this.avocat = avocat;
	}


}
