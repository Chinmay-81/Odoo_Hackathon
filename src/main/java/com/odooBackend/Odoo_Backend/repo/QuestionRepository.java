package com.odooBackend.Odoo_Backend.repo;


import com.odooBackend.Odoo_Backend.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Long> {
}