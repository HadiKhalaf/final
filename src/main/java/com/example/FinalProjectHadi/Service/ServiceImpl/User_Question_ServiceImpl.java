package com.example.FinalProjectHadi.Service.ServiceImpl;

import com.example.FinalProjectHadi.Entity.User_Question;
import com.example.FinalProjectHadi.Repository.User_Question_Repository;
import com.example.FinalProjectHadi.Service.User_Question_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;
import java.util.Date;
import java.util.List;

@Service
public class User_Question_ServiceImpl implements User_Question_Service {
    @Autowired
    private EntityManager em;
    @Autowired
    private User_Question_Repository user_question_repository;
  /*  @Override
    public List<User_Question> insertGrades(List<User_Question> user_question) {
        return (List<User_Question>) user_question_repository.saveAll(user_question);
    }*/

    @Override
    public void saveGrade(Long Grade, String pp) {
        StoredProcedureQuery query = em.createStoredProcedureQuery("SAVE_GRADES");
        query.registerStoredProcedureParameter("Grade", Long.class, ParameterMode.IN);
        query.registerStoredProcedureParameter("pp", String.class, ParameterMode.IN);
        query.setParameter("Grade",Grade);
        query.setParameter("pp",pp);

        query.execute();
    }
}
