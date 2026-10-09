class Product {
    int id;
    String name;
    double price;
    boolean inStock;
}

public class Main {
    public static void main(String[] args) {
        Product p = new Product();

        System.out.println("Product ID: " + p.id);         // default int -> 0
        System.out.println("Name: " + p.name);              // default String -> null
        System.out.println("Price: " + p.price);            // default double -> 0.0
        System.out.println("In Stock: " + p.inStock);       // default boolean -> false
    }
}
