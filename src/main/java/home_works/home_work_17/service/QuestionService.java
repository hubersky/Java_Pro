package home_works.home_work_17.service;

import home_works.home_work_17.repository.dao.QuestionRepository;

public class QuestionService {

    private QuestionRepository questionRepository;

    public QuestionService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }
}
