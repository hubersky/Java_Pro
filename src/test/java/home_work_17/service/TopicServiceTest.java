package home_work_17.service;

import home_works.home_work_17.model.Topic;
import home_works.home_work_17.service.TopicService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TopicServiceTest {

    private TopicServiceMock topicServiceMock;
    private TopicService topicService;
    private final Topic testTopic = Topic.builder().id(0).name("Test").build();

    @Before
    public void init() {
        topicServiceMock = new TopicServiceMock();
        topicService = new TopicService(topicServiceMock);
    }

    @Test
    public void getAllTopicTest() {
        Assert.assertTrue(topicService.getAllTopic().size() > 0);
    }

    @Test
    public void getTopicByIdTest() {
        Topic result = topicService.getTopicById(testTopic.getId());
        Assert.assertEquals(result.getId(), testTopic.getId());
    }

    @Test
    public void addTopicTest() {
        Assert.assertTrue(topicService.addTopic(testTopic));
    }

    @Test
    public void removeTopicTest() {
        Assert.assertTrue(topicService.removeTopic(testTopic.getId()));
    }

    @Test
    public void updateTopicTest() {
        int result = topicService.updateTopic(testTopic);
        Assert.assertEquals(result, 1);
    }
}
