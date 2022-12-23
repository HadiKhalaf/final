package com.example.FinalProjectHadi.Repository;
import com.example.FinalProjectHadi.Entity.Question;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.FinalProjectHadi.dto.AllQuestion;
import java.util.List;
@Repository
public interface Question_Repository extends JpaRepository<Question, Long> {

    @Query("select new com.example.FinalProjectHadi.dto.AllQuestion(sq.id,q.id,q.question) from Question q" +
            " join q.shuffle_questions sq where sq.userid in (select u.id from UserEntity u) " +
            "order by sq.id")
    List<AllQuestion> qss(Pageable pages);



}
