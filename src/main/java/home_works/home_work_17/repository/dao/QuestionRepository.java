package home_works.home_work_17.repository.dao;

import home_works.home_work_17.model.Question;

public interface QuestionRepository {

    boolean save(Question question);

    Question get(int id);

    boolean remove(int id);

    int update(Question question);

}
