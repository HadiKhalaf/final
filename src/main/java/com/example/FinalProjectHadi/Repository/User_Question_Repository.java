package com.example.FinalProjectHadi.Repository;

import com.example.FinalProjectHadi.Entity.User_Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface User_Question_Repository extends JpaRepository<User_Question,Long> {
}
