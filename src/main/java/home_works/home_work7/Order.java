package home_works.home_work7;

import java.util.Objects;

public class Order {
    private final int number;
    private final String person;

    public Order(int number, String person) {
        this.number = number;
        this.person = person;
    }
    public int getNumber() {
        return number;
    }

    public String getPerson() {
        return person;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order1 = (Order) o;
        return Objects.equals(number, order1.number) && Objects.equals(person, order1.person);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, person);
    }

    @Override
    public String toString() {
        return "Order{" +
                "order=" + number +
                ", person='" + person + '\'' +
                '}';
    }
}
