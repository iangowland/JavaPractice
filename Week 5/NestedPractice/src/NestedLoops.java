public class NestedLoops
{

    public static void main(String[] args)
    {

        for (int rowNum = 1; rowNum < 5; rowNum++)
        {
            System.out.print(rowNum);
            System.out.print(" : ");

            for (int colNum = 1; colNum< 5; colNum++)
            {
                System.out.print(colNum);
                System.out.print("  ");
            }
            System.out.println();
        }


    }

}