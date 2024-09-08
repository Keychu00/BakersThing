package edu.sdccd.cisc190;

import java.time.LocalDateTime;
import java.util.Scanner;

/**
 * Baker's Dozen Calculator is an application that
 * prompts the user to enter the number of bagels
 * the customer has ordered and computes the number
 * of baker's dozen (13 bagels) and the number of
 * a la carte / single bagels (remainder). It also
 * computes the total price for the order with the
 * given values:
 * 1. BAGEL_DOZEN_PRICE = $10.99
 * 2. BAGEL_SINGLE_PRICE = $1.99
 * 3. SALES_TAX_RATE = 10.1%
 *
 * @author Mahad Naveed
 */
public class BakersDozenCalculator {
    public static final double BAGEL_DOZEN_PRICE = 10.99;
    public static final double BAGEL_SINGLE_PRICE = 1.99;
    public static final double SALES_TAX_RATE = 0.101;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numBagels, numDozen, numSingle;
        double subtotal, tax, total;


        System.out.print("Please enter the number of bagels: ");
        numBagels = input.nextInt();
        numDozen = numBagels / 13;
       numSingle = numBagels % 13;

        subtotal = (numDozen * BAGEL_DOZEN_PRICE) +
                     (numSingle * BAGEL_SINGLE_PRICE);

        // compute the tax
        tax = subtotal * SALES_TAX_RATE;

        // compute the total with tax
        total = subtotal + tax;


        //  print the properly formatted receipt to console
        System.out.println();
        System.out.println("-----------------------------------");
        System.out.println();
        System.out.printf("Date: %s%n", LocalDateTime.now().toString());
        System.out.println();
        System.out.printf("Num Dozens: %d $%.2f%n", numDozen, BAGEL_DOZEN_PRICE);
        System.out.printf("Num Singles: %d @ $%.2f", numSingle, BAGEL_SINGLE_PRICE);
        System.out.println();
        System.out.printf("Subotal: $%.2f%n", subtotal);
        System.out.printf("Tax: $%.2f (%.2f%%)%n", tax, SALES_TAX_RATE * 100);
        System.out.printf("Total: $%.2f%n", total);
        System.out.println();
        System.out.println("-----------------------------------");
    }
}

//Num Dozens: 5 @ $10.99
//
//Num Singles: 4 @ $1.99
//
//Subtotal: $62.91
//
//Tax: $6.35 (10.10%)
//
//Total: $69.26
//
//        -----------------------------------