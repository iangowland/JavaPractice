import java.util.Scanner;

public class Average 
{
    public static void main(String[] args)
    {
        double total = 0;

        double num = 0;

        int count = 0;

        final int SENTINEL = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number of an average calculation, " +
        "\nwhen finished with average values, enter 0 to close program: ");

        num = input.nextDouble();

        while (num != SENTINEL)
        {
            total += num;
            count++;

            System.out.print("Enter the next number of an average calculation, " +
            "\nwhen finished with average values, enter 0 to close program: ");

            num = input.nextDouble();
        }

        double average = total/count;

        System.out.println("The average of " + count + " numbers totaling " +
        total + " equals " + average);

        input.close();

    }
}
