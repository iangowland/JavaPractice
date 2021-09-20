import java.util.Scanner;

public class preLabThree {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
    
        // We've set up the ability to input data
        // but now we must enable the scanner to 
        // read the input and allow it to print

        System.out.print("\n" + "Type how many gallons of gas were used: " );

        double gallonsOfGasUsed = input.nextDouble();

        System.out.print("\n" + "Type how many miles were traveled: ");
    
        double milesTraveled = input.nextDouble();


        double milesPerGallon = ( milesTraveled / gallonsOfGasUsed );

        System.out.println( "\n" + "If you used " + gallonsOfGasUsed + " gallons of gas and traveled " + milesTraveled + 
        " miles then your mileage per gallon is " + milesPerGallon + " mpg.\n");

        // put spaces in your String values so that the output will be spaced properly and
        // not having Strings and numbers squeezed together 6
        // don't confuse the variable names with the output of Strings that users will see 


        // nice 
    

    }
}
