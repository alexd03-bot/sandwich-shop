package com.pluralsight;

import java.util.*;
import java.util.Scanner;

public class ShopTwo {

    //Exercise 2

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        String size;
        double price;
        int age;
        String loaded;

        System.out.println("What size sandwich would you like? Regular or Large: ");
        size = myScanner.nextLine();
        if (size.equals("Regular")) {
            price = 5.45;
        } else {
            price = 8.95;
        }

        System.out.println("How old are you?: ");
        age = myScanner.nextInt();
        if (age <= 17) {
            price = price - (price * .1);
        } else if (age >= 65) {
            price = price - (price * .2);

        }
        myScanner.nextLine();
        System.out.println("Would you like your sandwich loaded? (yes/no): ");
        loaded = myScanner.nextLine();
        if (loaded.equals("yes") && size.equals("Regular")) {
             price = price + 1;
        } else if (loaded.equals("yes") && size.equals("Large")) {
            price = price + 1.75;
        }


        System.out.printf("Your total is %.2f", price);









    }
}
