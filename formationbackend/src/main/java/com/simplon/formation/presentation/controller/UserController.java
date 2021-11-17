package com.simplon.formation.presentation.controller;


import com.simplon.formation.business.services.implementations.UserService;
import com.simplon.formation.persistance.entities.UserCreateRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(value = "/api/user")
@RequiredArgsConstructor
public class UserController {
    
    @Autowired
    private  UserService userService;

    @PostMapping
    public ResponseEntity createUser(@RequestBody UserCreateRequest userCreateRequest) {
        userService.createUser(userCreateRequest);
        return ResponseEntity.ok().build();
    }
  
}
