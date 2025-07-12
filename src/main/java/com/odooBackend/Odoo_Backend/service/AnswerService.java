package com.odooBackend.Odoo_Backend.service;

import com.odooBackend.Odoo_Backend.repo.AnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.odooBackend.Odoo_Backend.model.Answer;

import java.util.List;

@Service
public class AnswerService {
    @Autowired
    private AnswerRepository answerRepository;


    public List<Answer> getAnswersByQuestionId(Long questionId) {
        return answerRepository.findAll().stream()
                .filter(answer -> answer.getQuestion().getId().equals(questionId))
                .toList();
    }
    public Answer createAnswer(Answer answer) {
        return answerRepository.save(answer);
    }
}
