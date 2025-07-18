package com.odooBackend.Odoo_Backend.controller;


import com.odooBackend.Odoo_Backend.model.User;
import com.odooBackend.Odoo_Backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public User registerUser (@RequestBody User user) {
        return userService.registerUser (user);
    }
}
