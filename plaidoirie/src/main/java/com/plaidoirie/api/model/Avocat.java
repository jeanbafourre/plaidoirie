package com.plaidoirie.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="Avocat")
public class Avocat {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idAvocat")
	Long idAvocat;
	@Column(unique=true)
	Long numeroDeToque;
	public Long getIdAvocat() {
		return idAvocat;
	}
	public void setIdAvocat(Long idAvocat) {
		this.idAvocat = idAvocat;
	}
	public Long getNumeroDeToque() {
		return numeroDeToque;
	}
	public void setNumeroDeToque(Long numeroDeToque) {
		this.numeroDeToque = numeroDeToque;
	}
	
	
}
