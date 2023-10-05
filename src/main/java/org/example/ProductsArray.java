package org.example;

import java.util.Arrays;

public class ProductsArray {
    public static void main(String[] args) {
        String[] products = {
                "Leche",
                "Pan",
                "Huevos",
                "Arroz",
                "Frijoles",
                "Pasta",
                "Aceite",
                "Azúcar",
                "Sal",
                "Carne de res",
                "Pollo",
                "Pescado",
                "Verduras",
                "Frutas",
                "Yogur",
                "Queso",
                "Cereal",
                "Galletas",
                "Jabón",
                "Detergente"
        };

    showProducts(products, "a");
    printProductsInOrder(products);

    }
    public static void showProducts(String[] arr, String letter){

        System.out.println("\n productos que empiezan por la letra " + letter + ": \n ");

        for (String product : arr) {
            if (product.startsWith(letter.toUpperCase())) {
                System.out.println("* " + product);
            }
        }
    }

    public static void printProductsInOrder(String[] arr){
        Arrays.sort(arr);
        System.out.println("\n Productos organizados en orden alfabetico : \n");

        for (String product : arr){
            System.out.println(product);
        }
    }
}