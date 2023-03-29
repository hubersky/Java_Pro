package home_works.home_work7;

import java.util.*;

public class CoffeeOrderBoard {

    private final Map<Integer, Order> orders = new TreeMap<>();

    public void add(int number, Order order) {
        orders.put(number, order);
    }

    public void deliver() {
        int firstOrder = 1;
        for (int number: orders.keySet()) {
            if (firstOrder > number) firstOrder = number;
        }
        System.out.println("Order received by: " + orders.remove(firstOrder).getPerson());
    }

    public void deliver(int number) {
        System.out.println("Order received by: " + orders.remove(number).getPerson());
    }

    public void draw() {
        for (Map.Entry <Integer, Order> order:orders.entrySet()){
            System.out.println(order.getKey() + " " + order.getValue());
        }
    }
}
