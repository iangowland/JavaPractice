/**
 * Created on 9/6/2021 
 * 
 * by Ian Gowland
 * 
 * ULID: igowlan
 * Class: IT 168
 * 
 * Programming Assignment #1 
 * UserSecretCode.java
 * 
 */

import java.util.Scanner;

// import Scanner class from the util package to receive input from keyboard.

import java.util.Random;

// import Random class from the util package to generate random numbers for the username and secret code.

/**
 * 
 * @author Ian Gowland
 * 
 * This is a program that generates a secret code based on an input of a name and a phone number.
 * 
 */

public class UserSecretCode{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        // Instatiation of a Scanner object named input.

        System.out.print("\n" + "Enter your first name: ");

        // Prompt for user's first name.

        String firstName = input.nextLine();

        // Read first name from the keyboard input.

        System.out.print("Enter your last name: ");


        String lastName = input.nextLine();

        Random random = new Random();

        int startRandomNumUsername = 10;

        int endRandomNumUsername = 99;

        int userNameRandomNum = random.nextInt(endRandomNumUsername - startRandomNumUsername + 1) 
        + startRandomNumUsername;

        // Set the inclusive argument list for the  "random" number to generate between 10 (start) to 99 (end)


        String username = (firstName.substring(0,1) + lastName.substring(0,5) + userNameRandomNum);

        // Use substring to get the first letter of the first name.

        String finalUsername = username.toLowerCase();

        System.out.print("Enter your phone number with dashes, "
        + "do not include 1 at the beginning (###-###-####): ");

        // Prompt user for a specific typing of their phone number.

        String phoneNumber = input.nextLine();

        // Index of the phone number String:
        // ### - ### - ##  #  #
        // 012 3 456 7 89(10)(11)

        String lastFourPhoneNum = phoneNumber.substring(8,12);

        /*

        Output test:

        System.out.println("Last digits of phone number: " + lastFourPhnNum);

        */

        int startSecCodeAppend = 100;

        int endSecCodeAppend = 999;

        int secCodeAppend = random.nextInt(endSecCodeAppend - startSecCodeAppend + 1) + startSecCodeAppend;

        // REMEMBER that when generating a random number inclusive,
        // we must add the start value outside of the parentheses.

        String areaCode = phoneNumber.substring(0,3);

        // Assign the areaCode String to the first three indices of the phoneNumber String
        // using the substring method.

        String secCodeUnedited = (lastFourPhoneNum + secCodeAppend + areaCode);


        String secCodeReplaceSix = secCodeUnedited.replace('6','@');

        // Replace all 6 chars with the char @

        String secCodeReplaceFive = secCodeReplaceSix.replace('5','S');


        String secCodeReplaceThree = secCodeReplaceFive.replace('3','E');


        String secCodeFinal = secCodeReplaceThree;


        System.out.println("Random number: " + userNameRandomNum);

        // Print the random number used for the username.

        System.out.println( "The username is: " + finalUsername);

        // Print the generated username.

        System.out.println("Random number: " + secCodeAppend);

        // Print the random number used for the secret code random number appendation.

        System.out.println("Your secret code is: " + secCodeFinal + "\n");

        // Print the secret code. 
        
    }

}