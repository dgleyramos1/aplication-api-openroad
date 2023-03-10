package com.openroad.api.user.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.openroad.api.user.model.User;

/**
 * Repositório da classe usuário
 */
@Repository
public interface UserRepository extends JpaRepository<User, String> {

    User findUserByUsername(String username);

    Optional<User> findByUsername(String username);

}
