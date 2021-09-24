import java.util.Scanner;

public class SqrtOverTen
{
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        double num = 0;

        double squareRootNum = 0;

        int counter = 0;

        System.out.print("Enter a number greater than 10: ");

        num = input.nextInt();

        // The while condition that checks if the input is greater
        // than 10 must be greater than or equal to 10.

        while (num <= 10)
        {
            System.out.print("This is not a number less than 10, please re-enter the number: ");
            num = input.nextInt();
        }

        if (num > 10)
        {
            squareRootNum = Math.sqrt(num);
            counter++;

            // For the final condition that must evaluate a number of square root
            // operations to less than 1.01, we must assign the stored square root operation
            // back into the variable that keeps storing the output, in this case it is
            // called squareRootNum.
        
            while (squareRootNum >= 1.01)
            {
                squareRootNum = Math.sqrt(squareRootNum);
                counter++;
            }
        }
        
    
        System.out.println("The square root operation of " + num + " " + counter +
        " times is " + squareRootNum);

    }

}