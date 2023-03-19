package home_works.home_work5.task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 10));
        }
        Unique unique = new Unique();
        System.out.println(unique.findUnique(list));
    }
}
