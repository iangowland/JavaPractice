import java.util.Scanner;

public class IfPractice{

    public static void main(String[] args){


        Scanner input = new Scanner(System.in);

        System.out.print("Enter round points total: ");

        int roundPoints = input.nextInt();

        int score = 0;

        // Are out points a multiple of 5 or not?

        if (roundPoints % 5 == 0)
        {
            if (roundPoints >= 20 && roundPoints % 10 == 0)
            {
                score = 7;
            }
            else
            {
                score = 5;
            }

        }
        else
        {
            int digit = roundPoints % 10;
            if (digit < 5)
            {
                score = 1;
            }
            else
            {
                score = 3;
            }
        }

        System.out.println("Score: " + score);

    }


}