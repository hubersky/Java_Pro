package home_works.home_work_17.repository.dao;

import home_works.home_work_17.model.Topic;
import java.util.List;

public interface TopicRepository {

    List<Topic> getAll();

    boolean add(Topic topic);

    Topic get(int id);

    boolean remove(int id);

    int update(Topic topic);

}
