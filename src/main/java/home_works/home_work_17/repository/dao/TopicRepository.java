package home_works.home_work_17.repository.dao;

import home_works.home_work_17.model.Topic;

public interface TopicRepository {

    boolean save(Topic topic);

    Topic get(int id);

    boolean remove(int id);

    int update(Topic topic);

}
