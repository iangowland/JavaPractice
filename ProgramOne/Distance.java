/**
 * Created on 9/6/2021 
 * 
 * by Ian Gowland
 * 
 * ULID: igowlan
 * Class: IT 168
 * 
 * Programming Assignment #1 
 * Distance.java
 * 
 * Hi From Shawn
 */

import java.util.Scanner;

// Import the Scanner class from the util package to read input from the keyboard.

import java.text.DecimalFormat;

// Import the DecimalFormat class from the text package to format the distance value.

/**
 * 
 * @author Ian Gowland
 * 
 * This is a program to calculate distance between two coordinates.
 * 
 */

public class Distance {

    public static void main(String[] args){

        // Instantiate a scanner object.

        Scanner input = new Scanner(System.in);

        // Prompt the user to enter their first x value.

        System.out.print("\n"+ "Enter the first x value integer: ");

        // Read the input from the keyboard and assign it to a
        // double variable named firstX.

        int firstX = input.nextInt();

        // Prompt the user for to enter their first y value.

        System.out.print("Enter the first y value integer: ");

        int firstY = input.nextInt();

        System.out.print("Enter the second x value integer: ");

        int secondX = input.nextInt();

        System.out.print("Enter the second y value integer: ");

        int secondY = input.nextInt();

        // Set a constant to SQUARED_EXPO that can be used to
        // calculate the squared value of numbers.

        int SQUARED_EXPO = 2;

         // This first part will calculate the difference 
         // of the second x value and the first x value.

        int diffXs = (secondX - firstX);

        // The next will calculate the difference between the
        // second y value and the first y value.

        int diffYs = (secondY - firstY);

        // Then we will square the result of the difference of the x values
        // which will be named xsSqrd.

        double xsSqrd = Math.pow(diffXs, SQUARED_EXPO);

        // And square the result of the difference of the y values
        // which will be named ysSqrd.

        double ysSqrd = Math.pow(diffYs, SQUARED_EXPO);

        // Now we can calculate the square root of
        // the addition of xSqrd and ySqrd.

        double distance = Math.sqrt(xsSqrd + ysSqrd);

        // We'll set up the first set and second set of coordinates
        // as Strings that we can use in our final output.

        String firstCoord = ("("+ firstX + "," + firstY + ") ");

        String secondCoord = ("(" + secondX + "," + secondY + ") ");

        // Instantiate a DecimalFormat object named distanceFormat 
        // so that distance can be formatted to only include decimals
        // to the hundredths place.

        DecimalFormat distanceFormat = new DecimalFormat("#.##");

        // We will use the distanceFormat object, called the format method,
        // and apply it to the distance variable.

        String distanceOutput = new String("The distance of " + firstCoord
        + "and " + secondCoord + "is " + distanceFormat.format(distance));

        // Print the String distanceOutput that will list the x values, y values, 
        // and their formatted distance. 
        
        System.out.println(distanceOutput + ".\n");
    }
    
}
