// Prelab04 IT168 LAB

import java.util.Scanner;

public class NumOfSeconds{
    

    public static void main(String[] args){


        Scanner input = new Scanner(System.in);

         /*
        
        Number of hours is the largest value of time, so it can be a lot 
        But number of minutes is the next largest and every time we reach 60 minutes,
        it's value resets to add a marginal value to number of hours.
        So we must set a constraint in between zero and sixty for number of Hours
        and we must also set the same constraint for number of Seconds.

        Where do i use modulus ?

        */

        System.out.print("\n" + "Enter number of seconds: ");

        double numberOfSeconds = input.nextInt();

        double numberOfHours = numberOfSeconds / 3600;

        double numberOfMinutes = numberOfSeconds % 3600 * ((double)1/60);


        // When I print the numberOfMinutes, i'll cast it to an int variable
        // So when I subtract it from the next equation, I must cast it
        // to an int variable so I can use the remaining decimal
        // to calculate the number of seconds remaining

        double secondsRemaining = (((numberOfSeconds % 3600) * ((double)1/60)) 
        - ((int)numberOfMinutes)) * 60;

        // (numberOfSeconds % 3600) will give the number of minutes 
        // with the remainder (seconds remaining) as a decimal
        // We subtract this from the number of miuntes to get the decimal
        // that is equal to the seconds remaining when multiplied
        // by (1/60)

    
        System.out.print("\n" + "Enter number of seconds: " + (int)numberOfSeconds + "\n" +
         "Minutes: " + (int)numberOfMinutes + "\n" + "Hours: " + (int)numberOfHours + "\n" 
         + "Seconds: " + (int)secondsRemaining + "\n");


    }
}