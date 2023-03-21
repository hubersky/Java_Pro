package home_works.home_work5.task1;

import java.util.ArrayList;

public class Counter {

    public void countOccurrence(ArrayList<String> cars, String brand){
        int result = 0;
        for (String value: cars) {
            if (value.equals(brand)){
                result += 1;
            }
        }
        System.out.println("The brand " + brand + " occurrence:" + result + " times");
    }
}
