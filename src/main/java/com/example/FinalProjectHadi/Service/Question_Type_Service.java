package com.example.FinalProjectHadi.Service;

import com.example.FinalProjectHadi.Entity.Question_Type;
import com.example.FinalProjectHadi.Repository.Question_Type_Repository;
import com.example.FinalProjectHadi.dto.FinalGrade;

import java.util.List;

public interface Question_Type_Service {
    List<Question_Type> getAllQuestionType();
    List<FinalGrade> getFinalGrade();
}
