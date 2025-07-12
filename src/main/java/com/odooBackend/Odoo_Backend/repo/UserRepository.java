package com.odooBackend.Odoo_Backend.repo;

import com.odooBackend.Odoo_Backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}