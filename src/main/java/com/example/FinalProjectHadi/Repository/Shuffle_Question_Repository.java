package com.example.FinalProjectHadi.Repository;

import com.example.FinalProjectHadi.Entity.Shuffle_Question;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Shuffle_Question_Repository extends PagingAndSortingRepository<Shuffle_Question, Long> {

}
