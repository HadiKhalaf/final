package com.example.FinalProjectHadi.Controller;

import com.example.FinalProjectHadi.Entity.UserEntity;
import com.example.FinalProjectHadi.Service.ServiceImpl.User_ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@CrossOrigin(origins = "*")
@RestController
public class User_Controller {
    @Autowired
    User_ServiceImpl user_service;
    @PostMapping("/addUser")
    public ResponseEntity<HttpStatus> addUser(@RequestBody UserEntity userEntity){
        user_service.saveUser(userEntity);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
