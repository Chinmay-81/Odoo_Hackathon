package com.odooBackend.Odoo_Backend.service;


import com.odooBackend.Odoo_Backend.model.User;
import com.odooBackend.Odoo_Backend.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    public User registerUser (User user) {
        return userRepository.save(user);
    }
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
