package com.question.QuestionService.Service.ServiceImpl;

import com.question.QuestionService.Entityes.Question;
import com.question.QuestionService.Service.QuestionService;
import com.question.QuestionService.repositary.questionRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceImpl implements QuestionService {
    @Autowired
    private questionRepositary questionRepositary;

    public ServiceImpl(com.question.QuestionService.repositary.questionRepositary questionRepositary) {
        this.questionRepositary = questionRepositary;
    }

    @Override
    public Question create(Question quest) {
        return questionRepositary.save(quest);
    }

    @Override
    public List<Question> getAll() {
        return questionRepositary.findAll();
    }

    @Override
    public Question getById(long id) {
        return questionRepositary.findById(id).orElseThrow(()->new RuntimeException("question Not found !!"));
    }

    @Override
    public List<Question> getQuestionQuiz(Long id) {
        return questionRepositary.findByQuizId(id);
    }
}
