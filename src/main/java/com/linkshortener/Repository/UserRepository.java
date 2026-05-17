package com.linkshortener.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

import com.linkshortener.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);

}