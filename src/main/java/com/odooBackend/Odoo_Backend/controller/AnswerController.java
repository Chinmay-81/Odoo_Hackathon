package com.odooBackend.Odoo_Backend.controller;

import com.odooBackend.Odoo_Backend.model.Answer;
import com.odooBackend.Odoo_Backend.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/answers")
public class AnswerController {

    @Autowired
    private AnswerService answerService;

    @GetMapping("/question/{questionId}")
    public List<Answer> getAnswersByQuestionId(@PathVariable Long questionId) {
        return answerService.getAnswersByQuestionId(questionId);
    }
    @PostMapping("/submit")
    public Answer createAnswer(@RequestBody Answer answer) {
        return answerService.createAnswer(answer);
    }
}
