package com.pluralsight;

import java.util.*;
import java.util.Scanner;

public class ShopTwo {

    //Exercise 1

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        String size;
        double Price;
        int age;

        System.out.println("What size sandwich would you like? Regular or Large: ");
        size = myScanner.nextLine();
        if (size.equals("Regular")) {
            Price = 5.45;
        } else {
            Price = 8.95;
        }

        System.out.println("How old are you?: ");
        age = myScanner.nextInt();
        if (age <= 17) {
            Price = Price - (Price * .1);
        } else if (age >= 65) {
            Price = Price - (Price * .2);

        }
        System.out.printf("Your total is %.2f", Price);









    }
}
