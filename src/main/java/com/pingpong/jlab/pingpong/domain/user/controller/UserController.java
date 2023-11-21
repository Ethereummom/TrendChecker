package com.pingpong.jlab.pingpong.domain.user.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @GetMapping(value = "")
    public ResponseEntity getUserList(){
        return null;
    }

    @PostMapping(value = "")
    public ResponseEntity addUser(){
        return null;
    }

    @DeleteMapping(value = "")
    public ResponseEntity deleteUser(){
        return null;
    } 

    @PutMapping(value = "")
    public ResponseEntity updateUser(){
        return null;
    }

    @GetMapping(value = "/{user_seq}")
    public ResponseEntity getUserDetails(@PathVariable Long user_seq){
        return null;
    }

    
}