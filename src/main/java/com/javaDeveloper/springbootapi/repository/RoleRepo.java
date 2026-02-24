package com.javaDeveloper.springbootapi.repository;

import com.javaDeveloper.springbootapi.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepo extends JpaRepository<Role, Long> {

    Optional<Role> findByRoleName(String roleName);
}
