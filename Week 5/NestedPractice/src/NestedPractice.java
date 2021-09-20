import java.util.Scanner;

import java.util.Random;

public class NestedPractice 
{
    

    public static void main(String[] args)
    {

        Random rand = new Random();

        Scanner input = new Scanner(System.in);

        System.out.print("\nGuess an integer number between 1 and 10: ");

        // use print instead of println

        int guess = input.nextInt();

        int secretNum = rand.nextInt(10) + 1;

        if (guess < 1 || guess > 10)
        {
            System.out.println("Your guess is out of range.");
        }
        else   
        {   
            if (guess == secretNum)
                System.out.println("Congratulations, you guessed the secret number!");
            else 
            {
                System.out.println("Secret number: " + secretNum);

                if (Math.abs(guess - secretNum) > 3)
                    System.out.println("You missed it by a mile!");
                else 
                    System.out.println("You were close.");

                System.out.println("Better luck next time.");
            }
        }
    }
} 