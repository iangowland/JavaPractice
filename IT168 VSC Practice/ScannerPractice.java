import java.util.Scanner;

public class ScannerPractice {
    
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("\n" + "Please enter your question: " + "\n");

        // This is what I initially wrote 
        // String question = scan.next();
        // But then the output was: "An inquiry: How"
        // Instead of "An inquiry: How do I improve my programming skills?"
        // So what I think I need to do is write

        String question = scan.nextLine();

        //So that the entire line of the input is printed
        //Let's see

        System.out.println("\n" + "An inquiry: " + question + "\n");

        //YES!! 


    }
}
