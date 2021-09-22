/**
 * 
 * Created by Ian Gowland
 * 
 * Date: 9/18/21
 * 
 * ULID: igowlan
 * 
 * Course: IT 168
 * 
 */


import java.util.Scanner;

import java.text.DecimalFormat;

/**
 * 
 * This is a program that calculates the cost of an order at a bakery. 
 * The number of cupcakes ordered will determine the discount.
 * The program will ask the user for information, and a receipt
 * will be printed that formats the entered information and all of the
 * included costs.
 * 
 * @author Ian Gowland
 * 
 */

public class BakeryOrders
{
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        DecimalFormat dollars = new DecimalFormat("$0.00");

        DecimalFormat percent = new DecimalFormat("0.##%");


        // Initialize each type of cupcake

        int redVelvCakes = 0;

        int caramCakes = 0;

        int chocCakes = 0;


        // Constants

        double RED_VELV_PRICE = 2.00;

        double CARAM_PRICE = 2.50;

        double CHOC_PRICE = 3.00;

        double DOZEN_DISCOUNT = 0.1;

        double THREE_DOZEN_DISCOUNT = 0.15;

        double SALES_TAX = 0.0725;


        // Receipt variables 

        double totalCost = 0;

        double subtotal = 0;

        double discount = 0;

        double discountAmount = 0;

        double discountedSubtotal = 0;

        double tax = 0;


        // Welcome message

        System.out.println("\nWelcome to Pflugerville Bakery!" + 
        "\nWe're ready to take your cupcake order.\n");

        System.out.print("Please enter your name: ");

        String name = input.nextLine();


        // Input number of each type of cupcake from user

        System.out.print("Enter the number of Red Velvet cupcakes: ");

        redVelvCakes = input.nextInt();


        System.out.print("Enter the number of Caramel Surprise cupcakes: ");

        caramCakes = input.nextInt();


        System.out.print("Enter the number of Chocolate Delight cupcakes: ");

        chocCakes = input.nextInt();


        // Input day of pickup from user

        System.out.print("Enter the day of the week you will pick up your order: ");

        String pickupDay = input.next();

        System.out.println();


        // Calculations dependent on amount of cupcakes

        subtotal = (redVelvCakes * RED_VELV_PRICE + 
        caramCakes * CARAM_PRICE + chocCakes * CHOC_PRICE);


        // Accumulate: the total amount of cupcakes will determine the discount

        int totalCakes = (redVelvCakes + caramCakes + chocCakes);


        // Conditions of discounts

        if (totalCakes >= 36)
        {
            discount = THREE_DOZEN_DISCOUNT;
        }
        else if (totalCakes >= 12)
        {
            discount = DOZEN_DISCOUNT;
        }
        else
        {
            discount = 0;
        }


        /**
         * The remaining calculations are the same for all conditions
         * so it can be written outside the scope of the if else blocks.
         */


        discountAmount = subtotal * discount;
        discountedSubtotal = subtotal - discountAmount;
        tax = discountedSubtotal * SALES_TAX;
        totalCost = discountedSubtotal + tax;


        // Printing of receipt

        System.out.println("\n\tOrder Summary\n");

        
        // Print number of cupcakes (if ordered) and their cost

        if (redVelvCakes > 0)
        {
            System.out.println("Red Velvet cupcakes: " + redVelvCakes + " for "
            + dollars.format(RED_VELV_PRICE * redVelvCakes));
        }

        if(caramCakes > 0)
        {
            System.out.println("Caramel Surprise cupcakes: " + caramCakes + " for " 
            + dollars.format(CARAM_PRICE * caramCakes));
        }

        if(chocCakes > 0)
        {
            System.out.println("Chocolate Delight cupcakes: " + chocCakes + " for "
            + dollars.format(CHOC_PRICE * chocCakes));
        }


        System.out.println();


        // Subtotal

        System.out.println("Subtotal: \t\t" + dollars.format(subtotal));


        // Print discount information if order is over 12 cupcakes
        
        if (totalCakes >= 12)
        {
            System.out.println("Discount percentage: \t   " + percent.format(discount));
            System.out.println("Discount amount: \t" + dollars.format(discountAmount));
            System.out.println("Discounted subtotal: \t" + dollars.format(discountedSubtotal));
        }


        // Print the rest of the transaction information regardless of # of cupcakes

        System.out.println("Tax: \t\t\t" + dollars.format(tax));
        System.out.println("\nTotal cost: \t\t" + dollars.format(totalCost) + "\n");


        System.out.println("This order will be available for pickup " +
        "\nBy: " + name + "\nOn: " + pickupDay);
    }
}