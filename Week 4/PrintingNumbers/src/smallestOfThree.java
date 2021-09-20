import java.util.Scanner;

public class smallestOfThree {

    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        int num1 = 0;

        int num2 = 0;

        int num3 = 0;

        int smallest = 0;

        System.out.print("\nEnter your first integer: ");

        num1 = input.nextInt();

        System.out.println();

        System.out.print("Enter your second integer: ");

        num2 = input.nextInt();

        System.out.println();

        System.out.print("Enter your third integer: ");

        num3 = input.nextInt();

        if (num1 < num2)
        {
            smallest = num1;
        }
        else 
        {
            smallest = num2;
        }

        if (num3 < smallest)
        {
            smallest = num3;
        }

        System.out.println("\n" + smallest + " is the smallest integer of the three.\n");







        



    }
    
}
