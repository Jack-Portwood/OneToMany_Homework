package com.example.codeclan.filefolderuser.controllers;

import com.example.codeclan.filefolderuser.models.User;
import com.example.codeclan.filefolderuser.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping(value = "/{id}")
    public ResponseEntity<List<User>> getAllUsers(){
        return new ResponseEntity<>(userRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity createRaid(@RequestBody User user){
        userRepository.save(user);
        return new ResponseEntity(user, HttpStatus.CREATED);
    }
}
