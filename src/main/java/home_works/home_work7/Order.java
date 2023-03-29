package home_works.home_work7;

import java.util.Objects;

public class Order {
    private final int order;
    private final String person;

    public Order(int order, String person) {
        this.order = order;
        this.person = person;
    }
    public int getOrder() {
        return order;
    }

    public String getPerson() {
        return person;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order1 = (Order) o;
        return Objects.equals(order, order1.order) && Objects.equals(person, order1.person);
    }

    @Override
    public int hashCode() {
        return Objects.hash(order, person);
    }

    @Override
    public String toString() {
        return "Order{" +
                "order=" + order +
                ", person='" + person + '\'' +
                '}';
    }
}
