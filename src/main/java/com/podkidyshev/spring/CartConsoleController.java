package com.podkidyshev.spring;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.util.Scanner;

@Controller
public class CartConsoleController {

    private Cart cart;

    private Scanner scanner = new Scanner(System.in);
    private boolean isComplete = false;

    public CartConsoleController(Cart cart) {
        this.cart = cart;
    }


    public void run() {
        showWelcomeMessage();
        while (!isComplete) {
            String s = scanner.nextLine();
            switch (s) {
                case "q":
                    isComplete = true;
                    break;
                case "start":
                    System.out.println("start");
                    break;
                case "1":
                    addProductToCart();
                    break;
                case "2":
                    removeProductFromCart();
                    break;
                case "3":
                    getProductsInCart();
                    break;
            }
        }
    }

    public void addProductToCart() {
        System.out.println("Please input the product id which you want to add: ");

        while (!scanner.hasNextInt()) {
            System.out.println("Incorrect input data. Please check your input value and try again");
            scanner.next();
        }

        int id = scanner.nextInt();
        cart.addProduct(id);
        System.out.println("Product " + id + " added to cart");
    }

    public void removeProductFromCart() {
        System.out.println("Please input the product id which you want to remove: ");
        int id = scanner.nextInt();
        cart.removeProduct(id);
        System.out.println("Product " + id + " removed from cart");
    }

    public void getProductsInCart() {
        System.out.println(cart.getProductIds().toString());
        System.out.println("\nChoose command which you want to execute: " +
                "\nWrite \"start\" to show list of commands");
    }

    private void writeAllCommands() {
        System.out.println("\nChoose command which you want to execute:");
        System.out.println("1 - Add product to card");
        System.out.println("2 - Remove product from card");
        System.out.println("3 - Show all older");
        System.out.println("\nPress \"q\" to exit.");
    }

    private void showWelcomeMessage() {
        System.out.println("Hi! This is product app. You can use it for adding  your products into your basket.");
        writeAllCommands();
    }
}
