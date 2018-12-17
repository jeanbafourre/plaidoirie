package com.plaidoirie.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table (name="piece")
public class Piece {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@NotBlank
	@Column(name = "idPiece")
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
