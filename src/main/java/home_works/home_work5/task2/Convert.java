package home_works.home_work5.task2;

import java.util.ArrayList;
import java.util.List;

public class Convert {

    public List<Integer> toList(int[] array) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i: array) {
            list.add(i);
        }
        return list;
    }
}
