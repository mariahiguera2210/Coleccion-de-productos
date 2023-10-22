package org.example;

public class Main {
    public static void main(String[] args) {
        ProductsArray productsArray = new ProductsArray();
        ProductsArray.showListOfProducts(productsArray.products);
        ProductsArray.showProductsStartWith(productsArray.products, "a");
        ProductsArray.printProductsInOrder(productsArray.products);

    }

}
