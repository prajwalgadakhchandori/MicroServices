package com.question.QuestionService.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import com.question.QuestionService.Entityes.Question;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface questionRepositary extends JpaRepository<Question,Long> {

    List<Question> findByQuizId (Long id);

}
