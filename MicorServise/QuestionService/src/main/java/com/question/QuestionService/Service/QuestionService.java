package com.question.QuestionService.Service;

import com.question.QuestionService.Entityes.Question;

import java.util.List;

public interface QuestionService {

    Question create(Question  quest);

    List<Question> getAll();

    Question getById(long id);

    List<Question> getQuestionQuiz(Long id);

}
