package com.example.FinalProjectHadi.Repository;

import com.example.FinalProjectHadi.Entity.Question_Type;
import com.example.FinalProjectHadi.dto.FinalGrade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Question_Type_Repository extends JpaRepository<Question_Type, Long> {
    @Modifying
    @Query("select new com.example.FinalProjectHadi.dto.FinalGrade(sum(uq.grade), qt.id, qt.name)" +
            " from Question_Type qt join qt.questions q join q.user_questions uq " +
            "where uq.user_id in (select max(id) from UserEntity) " +
            "group by qt.id,qt.name" +
            " order by qt.id")
    List<FinalGrade> finalGrade();
}
