public class ObjectPractice {

    public static void main(String[] args)

    {
        SavingsAccount acct1 = new SavingsAccount();

        // SavingsAccount() is a constructor. 

        SavingsAccount acct2 = new SavingsAccount(500);

        // For Account 2, we'll start it with an assignment of $500.00. 

        SavingsAccount acct3 = new SavingsAccount(1000, 0.02);

        /* 
        
        For Acccount 3, we'll assign $1000 initial value 

        and use the third constructor which gives

        the balance and the interest rate which we've assigned 2%.

        */

        double accountBalance = acct1.getBalance();

        System.out.println("\n" + "Account 1: $" + accountBalance + "\n");

        System.out.println("\n" + "Account 2: $" + acct2.getBalance() + "\n");

        System.out.println("\n" + "Account 3: $" + acct3.getBalance() + "\n");

        /*
        
        Instead of assigning acct.getBalance(); to accountBalance,

        We could also skip that step and write
        
        System.out.println("\n" + "Account 1: $" + acct.getBalance() + "\n");

        and still observe the same output. 

        When we use getBalance, we are calling a method. 

        */

        acct1.withdraw(10);
        acct2.withdraw(10);
        acct3.withdraw(10);

        System.out.println("\n" + "Account 1: $" + accountBalance + "\n");

        System.out.println("\n" + "Account 2: $" + acct2.getBalance() + "\n");

        System.out.println("\n" + "Account 3: $" + acct3.getBalance() + "\n");

        acct2.deposit(500);

        System.out.println("\n" + "Account 2: $" + acct2.getBalance() + "\n");

        System.out.println("\n" + "Account 3: $" + acct3.getBalance() + "\n");

        
        /* 
        
        Now Account 2 and Account 3 have the same balance: $990.

        For Account 3, we assigned an interest rate of 2%.

        There is a default interest rate of 1.25%

        So if we calculate interest for Accounts 2 and 3, 

        We will observe different results.

        SavingsAccount acct3 = new SavingsAccount(1000, 0.02)

        To calculate interest, we must use the 

        processEndOfMonth method.

        */

        acct2.processEndOfMonth();
        acct3.processEndOfMonth();

        /*

            In this case, we don't need to input any 

            parameters because there wasn't any information

            from outside the object that was needed.

            processEndOfMonth will compute the interest
        
            and add it to the account balance. 

        */

        System.out.println("\n" + "Account 2: $" + acct2.getBalance() + "\n");

        System.out.println("\n" + "Account 3: $" + acct3.getBalance() + "\n");

        // Different outputs due to different interest rates.

        acct2.deposit(600.53);

        System.out.println("Account 2 balance: $" + acct2.getBalance());

    }
    
}
