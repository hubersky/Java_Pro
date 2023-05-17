package home_works.home_work_15;

public class JewelsAndStones {

    public int numJewelsInStones(String jewels, String stones) {
        char[] jewel = jewels.toCharArray();
        char[] stone = stones.toCharArray();
        int count = 0;
        for (char jewelType : jewel) {
            for (char stoneType : stone) {
                if (jewelType == stoneType) count++;
            }
        }
        return count;
    }
}
