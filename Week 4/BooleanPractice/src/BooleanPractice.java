
/**
 * 
 * Created by Ian Gowland
 * 
 * Date: 9/12/2021
 * 
 */

import java.util.Scanner;

 public class BooleanPractice
 {
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        char letterGrade = ' ';

        System.out.print("\nEnter grade percentage: ");

        int percentGrade = input.nextInt();

        System.out.println();

        /*

        nested if-else code for assigning a char letterGrade
        based on integer division that will give a percentage 0-100/10
        so that an integer is returned 6-10, so we don't have 
        to worry about a range. 

        if (percentGrade/10 == 9)
        {
            letterGrade = 'A';
        }
        else if(percentGrade/10 == 8)
        {
            letterGrade = 'B';
        }
        else if(percentGrade/10 == 7)
        {
            letterGrade = 'C';
        }
        else if(percentGrade/10 == 6)
        {
            letterGrade = 'D';
        }
        else
        {
            letterGrade = 'F';
        }

        System.out.println("Letter grade: " + letterGrade + "\n");

        */
       
       
        /*
        
        Now let's try a switch.

        Use colons after the case keyword.



        */

        switch (percentGrade/10)
        {
            case 10:
            case 9:
                letterGrade = 'A';
                break;

            case 8:
                letterGrade = 'B';
                break;

            case 7:
                letterGrade = 'C';
                break;

            case 6:
                letterGrade = 'D';
                break;
            
            default: 
                letterGrade = 'F';
                break;
        }

        System.out.print("Letter grade: " + letterGrade + "\n");
        


    }
 }





 
   