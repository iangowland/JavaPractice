import java.util.Scanner;

public class PasswordCheck 
{
    public static void main(String[] args)
    {

        Scanner kb = new Scanner(System.in);

        System.out.print("Enter your new password: ");

        String passwordCheckOne = kb.nextLine();

        System.out.print("Please reenter your new password: ");

        String passwordCheckTwo = kb.nextLine();

        if (passwordCheckOne.equals(passwordCheckTwo))
        {
            System.out.println("Welcome, you are now a registered user.");
        }
        else
        {
            System.out.println("Your passwords do not match. Carefully reenter your password.");
        }

    }
    
}
