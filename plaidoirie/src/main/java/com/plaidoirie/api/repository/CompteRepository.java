package com.plaidoirie.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.plaidoirie.api.model.Compte;

public interface CompteRepository extends JpaRepository<Compte, Long>{

}
