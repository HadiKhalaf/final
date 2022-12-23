package com.example.FinalProjectHadi.Controller;

import com.example.FinalProjectHadi.Entity.Question_Type;
import com.example.FinalProjectHadi.Service.Question_Type_Service;
import com.example.FinalProjectHadi.dto.FinalGrade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/Question_Type")
public class Question_Type_Controller {
    @Autowired
    private Question_Type_Service question_type_service;

    @GetMapping
    public ResponseEntity<List<Question_Type>> getQuestionType(){
        return new ResponseEntity<List<Question_Type>>(question_type_service.getAllQuestionType(), HttpStatus.OK);
    }
    @GetMapping("/final")
    public ResponseEntity<List<FinalGrade>> getFinalGrade(){
        return new ResponseEntity<List<FinalGrade>>(question_type_service.getFinalGrade(), HttpStatus.OK);
    }
}
