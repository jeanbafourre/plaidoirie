package com.plaidoirie.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="justiciable")
public class Justiciable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idJusticiable")
	Long idJusticiable;

	public Long getIdJusticiable() {
		return idJusticiable;
	}

	public void setIdJusticiable(Long idJusticiable) {
		this.idJusticiable = idJusticiable;
	}
	
}
