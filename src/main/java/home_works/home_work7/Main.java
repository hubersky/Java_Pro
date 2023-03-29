package home_works.home_work7;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Order> orders = List.of(
                new Order(1, "Valley King"),
                new Order(13, "Max Verstappen"),
                new Order(16, "Fernando Alonso"),
                new Order(23, "Lando Noris"),
                new Order(44, "Valentino Rossi"));

        CoffeeOrderBoard board = new CoffeeOrderBoard();

        for (Order order : orders) {
            board.add(order.getOrder(), order);
        }

        board.deliver();
        board.deliver(23);
        board.draw();
    }
}
