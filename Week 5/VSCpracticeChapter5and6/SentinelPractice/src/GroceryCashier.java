import java.util.Scanner;

import java.text.DecimalFormat;

public class GroceryCashier 
{
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        DecimalFormat dollars = new DecimalFormat("$#,##0.00");

        double total = 0;

        double itemPrice = 0;

        int numItems = 0;

        final int SENTINEL = -1;

        final double SALES_TAX = 0.0725;

        double overHundredDiscount = 0.05;

        System.out.print("Enter the price of the first item " +
        "\nor enter -1 to exit the transaction: ");

        itemPrice = input.nextDouble();

        while(itemPrice != SENTINEL)
        {
            total += itemPrice;

            if (itemPrice > 0)
            {
                numItems++;
            }
            
            System.out.print("Enter the price of the next item " +
            "\nor enter -1 to exit the transaction: ");
            itemPrice = input.nextDouble();
        }

        if (total >= 100)
        {
            total = total - (total * overHundredDiscount);
        }

        total = total + (total * SALES_TAX);

        if (numItems >= 1)
        {
            System.out.println("Number of items purchased: " + numItems + "\nTotal: " 
            + dollars.format(total));  
        }
        else
        {
            System.out.println("Void transaction.");
        }

    }
    
}
