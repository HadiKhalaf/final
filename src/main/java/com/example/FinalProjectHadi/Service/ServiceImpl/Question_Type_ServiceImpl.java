package com.example.FinalProjectHadi.Service.ServiceImpl;

import com.example.FinalProjectHadi.Entity.Question_Type;
import com.example.FinalProjectHadi.Repository.Question_Type_Repository;
import com.example.FinalProjectHadi.Service.Question_Type_Service;
import com.example.FinalProjectHadi.dto.FinalGrade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Question_Type_ServiceImpl implements Question_Type_Service {
    @Autowired
    private Question_Type_Repository question_type_repository;

    @Override
    public List<Question_Type> getAllQuestionType() {
        return question_type_repository.findAll();
    }

    @Override
    public List<FinalGrade> getFinalGrade() {
        return question_type_repository.finalGrade();
    }
}
