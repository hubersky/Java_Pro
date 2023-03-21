package home_works.home_work5.task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("BMW");
        cars.add("MERCEDES");
        cars.add("AUDI");
        cars.add("BMW");
        cars.add("FERRARI");
        cars.add("GOLF");
        Counter counter = new Counter();
        counter.countOccurrence(cars,"GOLF");
    }
}
