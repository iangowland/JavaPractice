import java.util.Scanner;

public class Sentences{

    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);

        System.out.print("\nType a sentence with punctuation at the end such as a period, question mark, etc: ");

        String usersSentence = kb.nextLine();

        int sentenceLength = usersSentence.length();

        int indexOfLastChar = sentenceLength - 1;

        char lastChar = usersSentence.charAt(indexOfLastChar);

        // Test: System.out.println("Last character of this sentence: " + lastChar + "\n");

        switch (lastChar)
        {
            case '?':
            System.out.println("This type of sentence is interrogative.");
            break;

            case '.':
            System.out.println("This type of sentence is declarative.");
            break;

            case '!':
            System.out.println("This type of sentence is exclamatory.");
            break;

            default:
            System.out.println("This is an uncategorized sentence.");
            break;

        }

        System.out.println();

    }
    
}
