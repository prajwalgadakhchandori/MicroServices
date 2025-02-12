package com.question.QuestionService.Controller;

import com.question.QuestionService.Entityes.Question;
import com.question.QuestionService.Service.QuestionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {

    private QuestionService  questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @PostMapping
    public Question postQuestion(@RequestBody Question question){
        return questionService.create(question);
    }

    @GetMapping
    public List<Question> getAll(){
        return questionService.getAll();
    }

    @GetMapping("/{id}")
    public Question question (@PathVariable("id") Long id){
        return questionService.getById(id);
    }

        @GetMapping("/quiz/{id}")
    public List<Question> getListBybQuiz(@PathVariable("id") long id){
        return questionService.getQuestionQuiz(id);

    }

}
