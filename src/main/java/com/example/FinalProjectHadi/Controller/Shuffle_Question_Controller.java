package com.example.FinalProjectHadi.Controller;

import com.example.FinalProjectHadi.Entity.Question_Type;
import com.example.FinalProjectHadi.Entity.Shuffle_Question;
import com.example.FinalProjectHadi.Repository.Shuffle_Question_Repository;
import com.example.FinalProjectHadi.Service.Shuffle_Question_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin(origins = "*")
@RestController
public class Shuffle_Question_Controller {
    @Autowired
    private Shuffle_Question_Service shuffle_question_service;


}
