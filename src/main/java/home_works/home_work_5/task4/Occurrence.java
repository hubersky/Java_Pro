package home_works.home_work_5.task4;

import java.util.*;

public class Occurrence {

    private String brand;
    private int occurrence;

    public Occurrence(String brand, int occurrence) {
        this.brand = brand;
        this.occurrence = occurrence;
    }

    public Occurrence() {
    }

    public void calcOccurrence(List<String> cars) {
        List<String> result = new LinkedList<>();
        int counter = 0;
        for (int i = 0; i < cars.size(); i++) {
            for (String word : cars) {
                if (cars.get(i).equals(word)) {
                    counter += 1;
                }
            }
            result.add("The word " + cars.get(i) + " occurrence:" + counter + " times");
            counter = 0;
        }
        for (int i = 0; i < result.size(); i++) {
            counter = 0;
            for (int k = 0; k < result.size(); k++) {
                if (result.get(i).equals(result.get(k))) {
                    counter += 1;
                    if (counter > 1) {
                        result.remove(i);
                    }
                }
            }
        }
        for (String word : result) {
            System.out.println(word);
        }
    }

    public List<Occurrence> findOccurrence(List<String> cars) {
        List<Occurrence> result = new LinkedList<>();
        int counter = 0;
        for (String check : cars) {
            for (String word : cars) {
                if (check.equals(word)) {
                    counter += 1;
                }
            }
            result.add(new Occurrence(check, counter));
            counter = 0;
        }
        for (int i = 0; i < result.size(); i++) {
            counter = 0;
            for (int k = 0; k < result.size(); k++) {
                if (result.get(i).brand.equals(result.get(k).brand)) {
                    counter += 1;
                    if (counter > 1) {
                        result.remove(i);
                    }
                }
            }
        }
        return result;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getOccurrence() {
        return occurrence;
    }

    public void setOccurrence(int occurrence) {
        this.occurrence = occurrence;
    }

    @Override
    public String toString() {
        return "Occurrence{" +
                "brand='" + brand + '\'' +
                ", occurrence='" + occurrence + '\'' +
                '}';
    }
}
