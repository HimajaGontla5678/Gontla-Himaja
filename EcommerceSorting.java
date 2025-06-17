import java.util.*;

class Product {
    String name;
    double price;
    double rating;

    public Product(String name, double price, double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                '}';
    }
}

public class EcommerceSorting {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 1200.00, 4.5));
        products.add(new Product("Smartphone", 800.00, 4.2));
        products.add(new Product("Tablet", 300.00, 4.8));
        products.add(new Product("Headphones", 100.00, 4.0));
        products.add(new Product("Charger", 25.00, 4.6));
        products.add(new Product("Smartwatch", 250.00, 4.9));

        // Sorting by Name
        products.sort(Comparator.comparing(product -> product.name));
        System.out.println("Sorted by Name:");
        products.forEach(System.out::println);

        // Sorting by Rating (Descending)
        products.sort(Comparator.comparing(product -> -product.rating));
        System.out.println("\nSorted by Rating (Descending):");
        products.forEach(System.out::println);

        // Sorting by Price (Ascending)
        products.sort(Comparator.comparing(product -> product.price));
        System.out.println("\nSorted by Price (Ascending):");
        products.forEach(System.out::println);

        // Sorting by Price (Descending)
        products.sort(Comparator.comparing(product -> -product.price));
        System.out.println("\nSorted by Price (Descending):");
        products.forEach(System.out::println);
    }
}