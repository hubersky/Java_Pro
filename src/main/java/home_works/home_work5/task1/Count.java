package home_works.home_work5.task1;

import java.util.ArrayList;

public class Count {

    public void countOccurrence(ArrayList<String> list, String word){
        int result = 0;
        for (String value: list) {
            if (value.equals(word)){
                result += 1;
            }
        }
        System.out.println("The word " + word + " occurrence:" + result + " times");
    }
}
