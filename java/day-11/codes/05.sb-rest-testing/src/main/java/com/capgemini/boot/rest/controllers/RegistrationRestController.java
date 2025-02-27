package com.capgemini.boot.rest.controllers;

import java.util.Base64;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ServerErrorException;

import com.capgemini.boot.rest.entities.User;
import com.capgemini.boot.rest.repository.UserRepository;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class RegistrationRestController {
	
    private UserRepository userRepo;
	
    @PostMapping("/register/user")
    public User createUser(@RequestBody User user) {
    	Base64.Encoder encoder = Base64.getEncoder();    
    	String encodedPassword = encoder.encodeToString(user.getPassword().getBytes());
        
    	user.setPassword(encodedPassword);
    	
    	return userRepo.save(user);
    }

    @ExceptionHandler(value = NullPointerException.class)
    public ResponseEntity<?> handleException(Exception exp){
    	return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
    			     .body(new ServerErrorException("NPE", exp));
    }
    
}
