public class StringPractice {

    public static void main(String[] args){

        String fullName = " IAN GOWLAND ";

        String fullNameToLowerCase = fullName.toLowerCase();

        System.out.println("\n" + "Full name in lower case:" + fullNameToLowerCase + "\n" );

        // This works ^

        String firstName = fullName.substring(0,4);

        System.out.println("\n" + "First name:" + firstName + "\n");

        // index zero is the space of in the first String full name
        // (space) IAN GOWLAND
        // N is the fourth index

        // This code works too though ^ 

        String trimmedName = fullName.trim();

        System.out.println("\n" + "Full name 'trimmed' :" + trimmedName + "\n");

        // Yep, checks out

        String lowerCaseA = fullName.replace('A' , 'a');

        // the char variables MUST be within single quotes
        //  'A' and 'a'
        // YOU KNOW WHAT IM SAYIN?

        System.out.println("\n" + "Full name with lower case A's: " + lowerCaseA + "\n");

        // YES !


        String normaJeaneMortensen = "marilyn monroe";

        String normaProper = normaJeaneMortensen.replace('m', 'M');

        System.out.println("\n" + normaProper + "\n");

        





    }
    
}
