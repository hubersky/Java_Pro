package home_works.home_work_17.service;

import home_works.home_work_17.repository.dao.TopicRepository;

public class TopicService {

    private TopicRepository topicRepository;

    public TopicService(TopicRepository topicRepository) {
        this.topicRepository = topicRepository;
    }
}
