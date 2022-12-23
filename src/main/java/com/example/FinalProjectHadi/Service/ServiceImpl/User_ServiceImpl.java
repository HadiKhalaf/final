package com.example.FinalProjectHadi.Service.ServiceImpl;

import com.example.FinalProjectHadi.Entity.UserEntity;
import com.example.FinalProjectHadi.Repository.User_Repository;
import com.example.FinalProjectHadi.Service.User_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;
import java.util.Date;

@Service
public class User_ServiceImpl implements User_Service {
    @Autowired
    User_Repository user_repository;
    @Autowired
    private EntityManager em;
    @Override
    public UserEntity AddUser(UserEntity userEntity) {
        return user_repository.save(userEntity);
    }

    @Override
    public void saveUser(UserEntity userEntity) {
        StoredProcedureQuery query = em.createStoredProcedureQuery("PROCEDURE1");
        query.registerStoredProcedureParameter("dob", Date.class, ParameterMode.IN);
        query.registerStoredProcedureParameter("name", String.class, ParameterMode.IN);
        query.registerStoredProcedureParameter("email", String.class, ParameterMode.IN);
        query.registerStoredProcedureParameter("password", String.class, ParameterMode.IN);
        query.registerStoredProcedureParameter("school_name", String.class, ParameterMode.IN);
        query.setParameter("dob",userEntity.getDob());
        query.setParameter("name",userEntity.getName());
        query.setParameter("email",userEntity.getEmail());
        query.setParameter("password",userEntity.getPassword());
        query.setParameter("school_name",userEntity.getSchool());
        query.execute();

    }


}
