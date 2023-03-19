package home_works.home_work5.task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("BMW");
        list.add("MERCEDES");
        list.add("AUDI");
        list.add("BMW");
        list.add("FERRARI");
        list.add("GOLF");
        Count count = new Count();
        count.countOccurrence(list,"GOLF");
    }
}
