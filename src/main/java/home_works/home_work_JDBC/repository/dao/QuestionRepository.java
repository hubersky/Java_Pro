package home_works.home_work_JDBC.repository.dao;

import home_works.home_work_JDBC.exception.RemoveException;
import home_works.home_work_JDBC.model.Question;
import java.util.List;

public interface QuestionRepository {

    List<Question> getAll();

    boolean add(Question question);

    Question get(int id);

    boolean remove(int id) throws RemoveException;

    int update(Question question);

}
