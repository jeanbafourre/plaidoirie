package com.plaidoirie.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.plaidoirie.api.model.Piece;

public interface PieceRepository extends JpaRepository<Piece, Long> {

}
