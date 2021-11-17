package com.simplon.formation.persistance.dao;

import java.util.Optional;

import com.simplon.formation.persistance.entities.ApiUser;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<ApiUser, Long> {
    Optional<ApiUser> findByUsername(String username);
}