package home_works.home_work_9;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Product> products = new LinkedList<>();
        products.add(new Product(1, "Book", 75, false, LocalDateTime.of(2023, 11, 15, 2, 2)));
        products.add(new Product(2, "Book", 281, true, LocalDateTime.of(2021, 1, 5, 3, 20)));
        products.add(new Product(3, "Toy", 253, false, LocalDateTime.of(2022, 12, 1, 1, 2)));
        products.add(new Product(4, "Toy", 56, false, LocalDateTime.of(2023, 6, 25, 5, 32)));
        products.add(new Product(5, "Book", 187, true, LocalDateTime.of(2020, 11, 5, 2, 2)));
        products.add(new Product(6, "Book", 33, false, LocalDateTime.of(2023, 9, 16, 8, 8)));
        products.add(new Product(7, "Toy", 550, true, LocalDateTime.of(2023, 2, 19, 7, 7)));
        products.add(new Product(8, "Book", 222, true, LocalDateTime.of(2022, 4, 25, 6, 6)));
        products.add(new Product(9, "Toy", 84, false, LocalDateTime.of(2023, 7, 2, 22, 2)));
        products.add(new Product(10, "Book", 21, false, LocalDateTime.of(2023, 4, 5, 4, 4)));
        products.add(new Product(11, "Book", 338, true, LocalDateTime.of(2023, 12, 15, 4, 4)));

        ProductService productService = new ProductService();
        productService.getProductByType(products, "Book").forEach(System.out::println);
        System.out.println();
        productService.getProductByDiscount(products, "Book").forEach(System.out::println);
        System.out.println();
        System.out.println(productService.getProductByLowestPrice(products, "Book"));
        System.out.println();
        productService.getLastThreeAddedProduct(products).forEach(System.out::println);
        System.out.println();
        System.out.println("Overall price is: " + productService.getOverallCostOfProduct(products, "Book"));
        System.out.println();
        productService.getGroupProductByType(products).forEach((k, v) -> System.out.println(k + " " + v));
    }
}
