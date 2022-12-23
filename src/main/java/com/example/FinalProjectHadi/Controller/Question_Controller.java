package com.example.FinalProjectHadi.Controller;

import com.example.FinalProjectHadi.Entity.Question;
import com.example.FinalProjectHadi.Entity.Shuffle_Question;
import com.example.FinalProjectHadi.Service.Question_Service;
import com.example.FinalProjectHadi.dto.AllQuestion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/Question")
public class Question_Controller {
    @Autowired
    private Question_Service question_service;
    @GetMapping
    public ResponseEntity<List<Question>> getAllQuestions(@RequestParam Integer pageNumber, @RequestParam Integer pageSize){
        return new ResponseEntity<List<Question>>(question_service.getEmployee(pageNumber,pageSize), HttpStatus.OK);
    }
    @GetMapping("/sff")
    public ResponseEntity<List<AllQuestion>> qss(@RequestParam Integer pageNumber, @RequestParam Integer pageSize){
        return new ResponseEntity<List<AllQuestion>>(question_service.qss(pageNumber,pageSize), HttpStatus.OK);
    }
}
