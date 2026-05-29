// Problem: Design Online Shopping System
// Concept: Composition and Object Collaboration
// Time Complexity: O(n)
// Space Complexity: O(n)

import java.util.ArrayList;

class Product {

    private String name;
    private double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    double getPrice() {
        return price;
    }

    void displayProduct() {
        System.out.println(name + " - ₹" + price);
    }
}

class ShoppingCart {

    private ArrayList<Product> products;

    ShoppingCart() {
        products = new ArrayList<>();
    }

    void addProduct(Product product) {
        products.add(product);
    }

    double calculateTotal() {

        double total = 0;

        for (Product product : products) {
            total += product.getPrice();
        }

        return total;
    }

    void displayCart() {

        for (Product product : products) {
            product.displayProduct();
        }

        System.out.println("Total: ₹" + calculateTotal());
    }
}

public class Solution {

    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

        cart.addProduct(new Product("Laptop", 50000));
        cart.addProduct(new Product("Mouse", 1000));

        cart.displayCart();
    }
}