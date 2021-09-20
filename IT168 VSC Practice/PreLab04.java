import java.util.Scanner;

public class PreLab04 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("\n" + "Enter number of seconds: ");

        // Prompt the user to type their number of seconds

        float numberOfSeconds = input.nextLong();

        // Read the number Of Seconds from the keyboard

        float numberOfHours = numberOfSeconds/(60*60);

        float minsRemain = ((numberOfSeconds % (60 * 60)) * ((float)1/60));

        float secondsRemain = (minsRemain - ((int)minsRemain)) * 60;

        System.out.println("Hours: " + (int)numberOfHours + "\n" + "Minutes: "
         + (int)minsRemain + "\n" + "Seconds: " + (int)secondsRemain);

        /*
        
        When we use (numberOfHours % (60*60))

        We


        */






    }
    
}
