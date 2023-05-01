package home_works.home_work_7;

import java.util.*;

public class CoffeeOrderBoard {

    private int counter;
    private final Queue<Order> orders = new LinkedList<>();

    public void add(Order order) {
        order.setNumber(++counter);
        orders.add(order);
    }

    public void deliver() {
        System.out.println("Order received by: " + orders.remove().getPerson());
        if (orders.isEmpty()) counter = 0;
    }

    public void deliver(int number) {
        for (Order order : orders) {
            if (order.getNumber() == number) {
                System.out.println("Order received by: " + order.getPerson());
                orders.remove(order);
            }
        }
        if (orders.isEmpty()) counter = 0;
    }

    public void draw() {
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}
