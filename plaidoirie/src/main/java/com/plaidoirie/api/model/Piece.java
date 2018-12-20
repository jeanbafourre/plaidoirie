package com.plaidoirie.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name="piece")
public class Piece {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	@ManyToOne 
	@JoinColumn(name="piece_id")
	private Justiciable justiciable;
	
	public Piece() {}

	
	public Piece(Long idPiece) {
		this.id = idPiece;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long idPiece) {
		this.id = idPiece;
	}


	public Justiciable getJusticiable() {
		return justiciable;
	}


	public void setJusticiable(Justiciable justiciable) {
		this.justiciable = justiciable;
	}
	
	


	
	

}
