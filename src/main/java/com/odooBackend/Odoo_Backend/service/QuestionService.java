package com.odooBackend.Odoo_Backend.service;

import com.odooBackend.Odoo_Backend.model.Question;
import com.odooBackend.Odoo_Backend.repo.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    public List<Question> getAllQuestions() {
        return questionRepository.findAll();
    }
    public Question createQuestion(Question question) {
        return questionRepository.save(question);
    }

}
