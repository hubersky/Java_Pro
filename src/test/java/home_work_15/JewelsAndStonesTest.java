package home_work_15;

import home_works.home_work_15.JewelsAndStones;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class JewelsAndStonesTest {
    JewelsAndStones jewelsAndStones;

    @Before
    public void before() {
        jewelsAndStones = new JewelsAndStones();
    }

    @Test
    public void firstTest() {
        String jewels = "aA";
        String stones = "aAAbbbb";
        int actually = jewelsAndStones.numJewelsInStones(jewels, stones);
        int expected = 3;
        Assert.assertEquals(expected, actually);
    }

    @Test
    public void secondTest() {
        String jewels = "z";
        String stones = "ZZ";
        int actually = jewelsAndStones.numJewelsInStones(jewels, stones);
        int expected = 0;
        Assert.assertEquals(expected, actually);
    }
}
