package com.plaidoirie.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.plaidoirie.api.model.Justiciable;

public interface JusticiableRepository extends JpaRepository<Justiciable, Long> {

}
