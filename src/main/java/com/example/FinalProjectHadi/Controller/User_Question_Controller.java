package com.example.FinalProjectHadi.Controller;

import com.example.FinalProjectHadi.Entity.Question_Type;
import com.example.FinalProjectHadi.Entity.UserEntity;
import com.example.FinalProjectHadi.Entity.User_Question;
import com.example.FinalProjectHadi.Service.ServiceImpl.User_Question_ServiceImpl;
import com.example.FinalProjectHadi.Service.User_Question_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "*")
@RestController
public class User_Question_Controller {
    @Autowired
    private User_Question_Service user_question_service;

   /*@PostMapping("/User_Question")
    public ResponseEntity<List<User_Question>> insert(@RequestBody List<User_Question> user_question){

            return new ResponseEntity<List<User_Question>>((List<User_Question>) user_question_service.insertGrades(user_question), HttpStatus.CREATED);

    }*/

   @GetMapping("/User_Question")
   public ResponseEntity<HttpStatus> saveGrade(@RequestParam Long Grade, @RequestParam String pp){
       user_question_service.saveGrade(Grade,pp);
       return new ResponseEntity<>(HttpStatus.CREATED);

   }
}
