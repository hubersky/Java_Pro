package home_work_15;


import home_works.home_work_15.MaximumNumberOfBalloons;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaximumNumberOfBalloonsTest {
    MaximumNumberOfBalloons maximumNumberOfBalloons;

    @Before
    public void before() {
        maximumNumberOfBalloons = new MaximumNumberOfBalloons();
    }

    @Test
    public void firstTest() {
        String text = "nlaebolko";
        int actually = maximumNumberOfBalloons.maxNumberOfBalloons(text);
        int expected = 1;
        Assert.assertEquals(expected, actually);
    }

    @Test
    public void secondTest() {
        String text = "loonbalxballpoon";
        int actually = maximumNumberOfBalloons.maxNumberOfBalloons(text);
        int expected = 2;
        Assert.assertEquals(expected, actually);
    }

    @Test
    public void thirdTest() {
        String text = "leetcode";
        int actually = maximumNumberOfBalloons.maxNumberOfBalloons(text);
        int expected = 0;
        Assert.assertEquals(expected, actually);
    }
}
