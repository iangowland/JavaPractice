import java.util.Scanner;

/**
 * 
 * Compute the sum of numbers from the keyboard
 *
 */

public class SentinelControlledAddition
{
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive value (-1 to stop): ");

        int num = input.nextInt();

        int sum = 0;

        while (num != -1)
        {
            sum = sum + num;
            System.out.print("Enter a positive value (-1 to stop): ");
            num = input.nextInt();
        }
        System.out.println("The sum is " + sum);
    }
}