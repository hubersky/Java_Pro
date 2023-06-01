package home_works.home_work_17.repository.dao;

import home_works.home_work_17.model.Question;
import java.util.List;

public interface QuestionRepository {

    List<Question> getAll();

    boolean add(Question question);

    Question get(int id);

    boolean remove(int id);

    int update(Question question);

}
