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
	Long IdAvocat;
	@Column(unique=true)
	Long NumeroDeToque;
	public Long getIdAvocat() {
		return IdAvocat;
	}
	public void setIdAvocat(Long idAvocat) {
		IdAvocat = idAvocat;
	}
	public Long getNumeroDeToque() {
		return NumeroDeToque;
	}
	public void setNumeroDeToque(Long numeroDeToque) {
		NumeroDeToque = numeroDeToque;
	}

}
