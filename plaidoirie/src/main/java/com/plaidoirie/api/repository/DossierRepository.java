package com.plaidoirie.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.plaidoirie.api.model.Dossier;

public interface DossierRepository extends JpaRepository<Dossier, Long>{

}
