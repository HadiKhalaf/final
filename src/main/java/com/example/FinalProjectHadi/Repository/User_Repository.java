package com.example.FinalProjectHadi.Repository;

import com.example.FinalProjectHadi.Entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import javax.persistence.EntityManager;
import java.util.Date;

@Repository
public interface User_Repository extends JpaRepository<UserEntity,Long> {

}
