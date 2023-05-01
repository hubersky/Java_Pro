package home_works.home_work_9;

import java.time.LocalDateTime;

public class Product {

    private final int id;
    private final String type;
    private int price;
    private final boolean discount;
    private final LocalDateTime date;

    public Product(int id, String type, int price, boolean discount, LocalDateTime dateOfAddition) {
        this.id = id;
        this.type = type;
        this.price = price;
        this.discount = discount;
        this.date = dateOfAddition;
    }

    public String getType() {
        return type;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public boolean getDiscount() {
        return discount;
    }

    public LocalDateTime getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                ", dateOfAddition='" + date + '\'' +
                '}';
    }
}
