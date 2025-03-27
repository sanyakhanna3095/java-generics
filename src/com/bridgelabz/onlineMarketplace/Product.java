package com.bridgelabz.onlineMarketplace;

// Generic Product class restricted to specific categories
public class Product<T> {
    private String name;
    private double price;
    private T category;

    // Constructor
    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    // Getters for name and price
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public T getCategory() {
        return category;
    }

    // Method to apply discount
    public void applyDiscount(double percentage) {
        if (percentage > 0 && percentage <= 100) {
            this.price -= (this.price * percentage / 100);
            System.out.println("Discount applied! New Price of " + name + ": Rs." + price);
        }
        else {
            System.out.println("Invalid discount!");
        }
    }

    // Display product details
    public void displayProduct() {
        System.out.println("Product: " + name + " || Category: " + category + " || Price: Rs." + price);
    }
}

