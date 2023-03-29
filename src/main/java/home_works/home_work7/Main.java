package home_works.home_work7;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Order> orders = List.of(
                new Order("Valley King"),
                new Order("Max Verstappen"),
                new Order("Fernando Alonso"),
                new Order("Lando Noris"),
                new Order("Valentino Rossi"));

        CoffeeOrderBoard board = new CoffeeOrderBoard();

        for (Order order : orders) {
            board.add(order);
        }

        board.deliver();
        board.deliver(4);
        board.draw();
    }
}
