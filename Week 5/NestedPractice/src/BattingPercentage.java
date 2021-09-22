import java.util.Scanner;

public class BattingPercentage
{

    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        System.out.print("\nEnter the number of hits: ");

        int numberOfHits = input.nextInt();

        System.out.print("\nEnter the number of at-bats: ");

        int atBats = input.nextInt();

        System.out.println();
        
        double hitPercent = (double) numberOfHits/atBats;

        if (hitPercent > .300)
        {
            System.out.println("\nYou are eligible for the All-Stars! Congratulations!");
        }
        else 
        {
            System.out.println("\nYou swung and missed. Keep at it though, you'll make it next season.\n");
        }



    }
    
}
