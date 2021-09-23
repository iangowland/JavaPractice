import java.util.Scanner;

public class SeasonSelection

{
    public static void main(String[] args)
    {

        int temp = 0;

        String winter = "Winter";

        String spring = "Spring";

        String summer = "Summer";

        String fall = "Fall";

        
        Scanner input = new Scanner(System.in);

        System.out.print("Input a temperature: ");

        temp = input.nextInt();

        
        if (temp > 100 || temp < -5)
        {
            System.out.println("This temperature input outside of range.");
        }
        else if (temp >= 90)
        {
            System.out.println("The probable season is " + summer);
        }
        else if(temp >= 70)
        {
            System.out.println("The probable season is " + spring);
        }
        else if (temp >= 50)
        {
            System.out.println("The probable season is " + fall);
        }
        else if (temp < 50)
        {
            System.out.println("The probable season is " + winter);
        }
       

    }
}