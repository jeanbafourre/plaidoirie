package com.plaidoirie.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="piece")
public class Piece {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idPiece;

	
	public Piece() {}

	
	public Piece(Long idPiece) {
		this.idPiece = idPiece;
	}


	public Long getIdPiece() {
		return idPiece;
	}

	public void setIdPiece(Long idPiece) {
		this.idPiece = idPiece;
	}
	
	


	
	

}
