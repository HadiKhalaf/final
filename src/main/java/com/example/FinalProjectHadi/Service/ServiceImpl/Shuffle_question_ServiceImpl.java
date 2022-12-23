package com.example.FinalProjectHadi.Service.ServiceImpl;

import com.example.FinalProjectHadi.Entity.Shuffle_Question;
import com.example.FinalProjectHadi.Repository.Shuffle_Question_Repository;
import com.example.FinalProjectHadi.Service.Shuffle_Question_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Shuffle_question_ServiceImpl implements Shuffle_Question_Service {
    @Autowired
    private Shuffle_Question_Repository shuffle_question_repository;


}
