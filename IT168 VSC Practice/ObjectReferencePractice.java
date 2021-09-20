public class ObjectReferencePractice
{

    public static void main(String[] args)
    {

        SavingsAccount acct2 = new SavingsAccount(500);

        int numLives = 3;

        int myLives = numLives;

        SavingsAccount acct4 = acct2;

        System.out.println("numLives: " + numLives);
        System.out.println("myLives: " + myLives);
        System.out.println("Account 2 balance: " + acct2.getBalance());
        System.out.println("Account 4 balance: " + acct4.getBalance());

        //the getBalance method must be invoked

        myLives--;

        acct4.deposit(200);

        System.out.println("numLives: " + numLives);
        System.out.println("myLives: " + myLives);
        System.out.println("Account 2 balance: " + acct2.getBalance());
        System.out.println("Account 4 balance: " + acct4.getBalance());

        /**
         * We're going to print all 4 of these. 
         * A primitive data type (myLives) has 
         * been assigned the value of another variable 
         * of the same type (numLives).
         * They're now the same value, but if I change one of the variables,
         * in this instance, myLives--;
         * It will only affect myLives and not numLives.
         * 
         * But for the object references, in this instance
         * acct2 and acct4, if I assign these equal, their
         * memory address will be the same and a deposit
         * into one will affect both.
         * 
         */


    }

}