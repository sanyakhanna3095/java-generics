package com.bridgelabz.onlineMarketplace;

import java.util.ArrayList;
import java.util.List;

public class ProductCatalog<T> {
    private List<Product<T>> products = new ArrayList<>();

    // Method to add a product
    public void addProduct(Product<T> product) {
        products.add(product);
    }

    // Method to display all products
    public void displayCatalog() {
        System.out.println("\nProduct Catalog:");
        for(int i = 0; i < products.size(); i++) {
            products.get(i).displayProduct();
        }
    }
}

