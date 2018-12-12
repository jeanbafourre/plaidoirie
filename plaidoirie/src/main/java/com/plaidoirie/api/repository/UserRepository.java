package com.plaidoirie.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.plaidoirie.api.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
