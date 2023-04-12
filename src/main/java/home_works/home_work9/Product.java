package home_works.home_work9;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

public class Product {

    private int id;
    private String type;
    private int price;
    private boolean discount;
    private LocalDateTime date;

    public Product(int id, String type, int price, boolean discount, LocalDateTime dateOfAddition) {
        this.id = id;
        this.type = type;
        this.price = price;
        this.discount = discount;
        this.date = dateOfAddition;
    }

    public Product() {

    }

    public List<Product> getProductByType(List<Product> products, String type) {
        return products.stream()
                .filter(x -> x.getType().equals(type))
                .filter(x -> x.getPrice() > 250)
                .toList();
    }

    public List<Product> getProductByDiscount(List<Product> products, String type) {
        return products.stream()
                .filter(x -> x.getType().equals(type))
                .filter(Product::getDiscount)
                .peek(x -> x.setPrice(x.getPrice() - x.getPrice() / 10))
                .toList();
    }

    public void getProductByLowestPrice(List<Product> products, String type) {
        try {
            System.out.println(products.stream()
                    .filter(x -> x.getType().equals(type))
                    .min(Comparator.comparingInt(Product::getPrice))
                    .get());

        } catch (NoSuchElementException e) {
            System.out.println("Product [category:" + type + "] not found!");
        }
    }

    public List<Product> getLastThreeAddedProduct(List<Product> products) {
        return products.stream()
                .sorted(Comparator.comparing(Product::getDate).reversed())
                .limit(3)
                .toList();
    }

    public void getOverallCostOfProduct(List<Product> products, String type) {
        double result = products.stream()
                .filter(x -> x.getType().equals(type))
                .filter(x -> x.getDate().getYear() == 2023)
                .filter(x -> x.getPrice() <= 75)
                .mapToInt(Product::getPrice)
                .average()
                .getAsDouble();
        System.out.println("Overall price is: " + result);
    }

    public Map<String, List<Product>> getGroupProductByType(List<Product> products) {
        return products.stream().collect(Collectors.toMap(Product::getType, v -> {
            List<Product> productsToMap = new LinkedList<>();
            productsToMap.add(v);
            return productsToMap;
        }, (v, s) -> {
            s.addAll(v);
            return s;
        }));
    }

    public int getId() {
        return id;
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
