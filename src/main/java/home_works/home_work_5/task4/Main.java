package home_works.home_work_5.task4;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> cars = List.of("BMW","PORSCHE","MERCEDES","FERRARI","FERRARI","MERCEDES","GOLF","AUDI","PORSCHE");
        Occurrence occurrence = new Occurrence();
        occurrence.calcOccurrence(cars);
        System.out.println();
        for (Occurrence brand:occurrence.findOccurrence(cars)) {
            System.out.println(brand);
        }
    }
}
