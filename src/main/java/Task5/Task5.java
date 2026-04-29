package Task5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task5 {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("iPhone", "Electronics", 120000),
                new Product("MacBook", "Electronics", 210000),
                new Product("Chair", "Furniture", 15000),
                new Product("Table", "Furniture", 22000),
                new Product("Pen", "Office", 100)
        );

        Map<String,Product> result = FilterProduct(products);
        System.out.println(result);

    }

    public static Map<String, Product> FilterProduct(List<Product> products ){
        return products.stream()
                .collect(Collectors.groupingBy(
                        product -> product.category,
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparingInt(product -> product.price)),
                                optional->optional.orElseThrow(()-> new RuntimeException("Продукт не найден"))
                        )
                ));
    }
}
