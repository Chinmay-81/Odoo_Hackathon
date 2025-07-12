package com.odooBackend.Odoo_Backend.controller;

import com.odooBackend.Odoo_Backend.model.Question;
import com.odooBackend.Odoo_Backend.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/questions")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @GetMapping
    public List<Question> getAllQuestions() {
        return questionService.getAllQuestions();
    }

    @PostMapping("/create")
    public Question createQuestion(@RequestBody Question question) {
        return questionService.createQuestion(question);
    }
}
