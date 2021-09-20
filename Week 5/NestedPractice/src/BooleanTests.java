public class BooleanTests {

    public static void main(String[] args)
    {
        int age = 24;

        System.out.println("\n" + (age <= 25) );

        // Output: true

        System.out.println("\n" + (age <= 25 || age > 35));

        // Output: should be true because the first operand evaulates to true
        // and the second one is false, but we afe using the OR operator.

        System.out.println("\n" + (age <= 25 && age > 35));

        // Output: false, both must be true for an AND (&&) operator

        System.out.println("\n" + !(age <= 25 && age > 35));

        // Output: true, the case in which the condition does not evaluate
        // to false must be true.

        System.out.println("\n" + (age <= 25 || age > 35 && false));

        // Output: TRUE. WHY THOUGH?
        // Because AND has a higher precedence than OR.
        // age > 35 && false will evaluate to false.
        // BUT then, we have the operation of 
        // age <= 25 || false,
        // which will evaluate to true || false
        // Anytime at least one operand is true for an OR 
        // operation, it will evaluate to true.

        System.out.println("\n" + ((age <= 25 || age > 35) && false));

        // Output: false
        // Parentheses take precedence over &&

        


    }
    
}
