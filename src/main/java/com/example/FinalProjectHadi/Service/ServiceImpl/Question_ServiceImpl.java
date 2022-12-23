package com.example.FinalProjectHadi.Service.ServiceImpl;

import com.example.FinalProjectHadi.Entity.Question;
import com.example.FinalProjectHadi.Repository.Question_Repository;
import com.example.FinalProjectHadi.Service.Question_Service;
import com.example.FinalProjectHadi.dto.AllQuestion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Question_ServiceImpl implements Question_Service {
    @Autowired
    private Question_Repository question_repository;

    @Override
    public List<Question> getEmployee(int pageNumber, int pageSize) {
        Pageable pages= PageRequest.of(pageNumber,pageSize);
        return question_repository.findAll(pages).getContent();
    }

    @Override
    public List<AllQuestion> qss(int pageNumber, int pageSize) {
        Pageable pages= PageRequest.of(pageNumber,pageSize);
        return question_repository.qss(pages);
    }
}
