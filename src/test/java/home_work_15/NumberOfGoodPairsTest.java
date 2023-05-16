package home_work_15;

import home_works.home_work_15.NumberOfGoodPairs;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NumberOfGoodPairsTest {
    NumberOfGoodPairs numberOfGoodPairs;

    @Before
    public void before() {
        numberOfGoodPairs = new NumberOfGoodPairs();
    }

    @Test
    public void firstTest() {
        int[] nums = {1, 2, 3, 1, 1, 3};
        int actually = numberOfGoodPairs.numIdenticalPairs(nums);
        int expected = 4;
        Assert.assertEquals(expected, actually);
    }

    @Test
    public void secondTest() {
        int[] nums = {1, 1, 1, 1};
        int actually = numberOfGoodPairs.numIdenticalPairs(nums);
        int expected = 6;
        Assert.assertEquals(expected, actually);
    }

    @Test
    public void thirdTest() {
        int[] nums = {1, 2, 3};
        int actually = numberOfGoodPairs.numIdenticalPairs(nums);
        int expected = 0;
        Assert.assertEquals(expected, actually);
    }
}
