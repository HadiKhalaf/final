package com.example.FinalProjectHadi.Service;

import com.example.FinalProjectHadi.Entity.Question;
import com.example.FinalProjectHadi.dto.AllQuestion;

import java.util.List;

public interface Question_Service {
    List<Question> getEmployee(int pageNumber, int pageSize);
    List<AllQuestion> qss(int pageNumber, int pageSize);
}
