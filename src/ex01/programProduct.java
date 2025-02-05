package ex01;

import java.util.Scanner;
import java.util.Locale;

public class programProduct {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Product product = new Product();

        System.out.println("Enter product data: ");

        System.out.println("Name: ");
        product.name = sc.next(); // Salvando o input do usuario diretamento no atibuto da classe product

        System.out.println("Price: ");
        product.price = sc.nextDouble();

        System.out.println("Quantity in stock: ");
        product.quantity = sc.nextInt();

        System.out.println("Product data: " + product);

        System.out.println("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println("Product data: " + product);

        System.out.println("Enter the number of products to remove from stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println("Updated data: " + product);

        sc.close();
    }
}
