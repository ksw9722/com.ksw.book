package com.kswtest.admin.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<kuser,Long> {

    Optional<kuser> findByEmail(String email);
}
