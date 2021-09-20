public class StringAlphabet {

    public static void main(String[] args)
    {

        String alphabet = ("abcdefghijklmnopqrstuvwxyz");

        //Declaring and assigning a String of the alphabet

        char indexTen = alphabet.charAt(10);

        // Declaring a char variable indexTen
        // and then using a Java API method
        // with the declared and set alphabet String
        // to find the index at 10
        // which is K.
        // Assigning the alphabet String and the charAt method
        // to indexTen will improve the readability 
        // of the code.

        System.out.println("\n"+ "The tenth index of the alphabet is " + indexTen +
        ".\n");

        char indexTwentyFive = alphabet.charAt(25);

        System.out.println("\n"+ "The twenty-fifth index of the alphabet is " + indexTwentyFive +
        ".\n");

        char indexZero = alphabet.charAt(0);


        char indexEight = alphabet.charAt(8); 
        char indexThirteen = alphabet.charAt(13);


        System.out.println("\n"+ "Index zero of the alphabet is " + indexZero +
        ".\n");

        System.out.println( "\n" + indexEight + indexZero + indexThirteen + "!" + "\n");

        

    }
    
}
