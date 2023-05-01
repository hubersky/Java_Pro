package home_works.home_work_9;

import java.util.*;
import java.util.stream.Collectors;

public class ProductService {

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

    public Product getProductByLowestPrice(List<Product> products, String type) {
        Product result = null;
        try {
            result = products.stream()
                    .filter(x -> x.getType().equals(type))
                    .min(Comparator.comparingInt(Product::getPrice))
                    .get();

        } catch (NoSuchElementException e) {
            System.out.println("Product [category:" + type + "] not found!");
        }
        return result;
    }

    public List<Product> getLastThreeAddedProduct(List<Product> products) {
        return products.stream()
                .sorted(Comparator.comparing(Product::getDate).reversed())
                .limit(3)
                .toList();
    }

    public double getOverallCostOfProduct(List<Product> products, String type) {
        return products.stream()
                .filter(x -> x.getType().equals(type))
                .filter(x -> x.getDate().getYear() == 2023)
                .filter(x -> x.getPrice() <= 75)
                .mapToInt(Product::getPrice)
                .average()
                .getAsDouble();
    }

    public Map<String, List<Product>> getGroupProductByType(List<Product> products) {
        return products.stream().collect(Collectors.toMap(Product::getType, v -> {
            List<Product> convertProducts = new LinkedList<>();
            convertProducts.add(v);
            return convertProducts;
        }, (v, s) -> {
            s.addAll(v);
            return s;
        }));
    }
}
