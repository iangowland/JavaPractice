import java.util.Scanner;

public class SquareArea 
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);

        System.out.print("\nEnter a side length of the quadrilateral: ");

        double sideLength1 = kb.nextDouble();

        System.out.print("\nEnter the other side length of the quadrilateral: ");

        double sideLength2 = kb.nextDouble();

        double area = sideLength1 * sideLength2;

        System.out.println("A quadrilateral with a side length of " + sideLength1 + " and another side length of " +
        sideLength2 + " has an area of " + area + "\n");

    }
    
}
