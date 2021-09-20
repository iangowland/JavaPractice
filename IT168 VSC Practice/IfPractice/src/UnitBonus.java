
import java.util.Scanner;

import java.text.DecimalFormat;

public class UnitBonus {

    public static void main(String[] args){
    
        Scanner input = new Scanner(System.in);

        DecimalFormat bonusDollars = new DecimalFormat("$#.00");

        int bonus = 0;

        System.out.print("\nEnter number of units produced: ");

        int unitsProduced = input.nextInt();

        if (unitsProduced <= 1000)
        {
            bonus = 25;
        }

        //else if(unitsProduced >= 1001 && unitsProduced <= 3000)
        
        // This is what I had initially written, but we only need one condition.
        // If the unitsProduced were less than or equal to 1000,
        // the program would stop running. So we don't need to set a minimum value.

        else if(unitsProduced <= 3000)
        {
            bonus = 50;
        }
        else if( unitsProduced <= 6000)
        {
            bonus = 100;
        }
        else
        {
            bonus = 200;
        }

        // We only need to write else for the final case because beyond 
        // 6000 units produced, there is not other "if" scenario. 
        // a $200 bonus is the final condition.

        System.out.print( "\nIf " + unitsProduced + " units are produced means that means a bonus has been earned " +
        "in the amount of " + bonusDollars.format(bonus) + "\n");

        // objectOfDecimalFormat.format( data to be formatted )

    }
    
}
