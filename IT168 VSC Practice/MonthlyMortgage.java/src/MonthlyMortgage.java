import java.text.DecimalFormat;
import java.util.Scanner;

public class MonthlyMortgage 
{

    public static void main(String[] args)
    {

    Scanner input = new Scanner(System.in);

    System.out.print("\n" + "Enter annual interest rate in decimal format: ");
    double annualIntRate = input.nextDouble();

    System.out.println();

    System.out.print("Enter number of years the mortgage will be held: ");
    double mortgageYears = input.nextDouble();

    System.out.println();

    System.out.print("Enter initial mortgage loan amount: ");
    double mortgageLoan = input.nextDouble();

    System.out.println();

    double mIR = annualIntRate/(double)12;

    double nOY = mortgageYears;

    double M = mortgageLoan;

    DecimalFormat dollars = new DecimalFormat("$#,###.00");

    double monthlyPayment = (mIR * M) / (1-((double)1/(Math.pow(1 + mIR, 12*nOY))));

    DecimalFormat intRateFormat = new DecimalFormat("%#.00");

    double totalPaid = (monthlyPayment * 12) * mortgageYears;

    double paidOver = ((monthlyPayment * 12) * mortgageYears) - mortgageLoan;

    double paidOverAsPercent = paidOver/totalPaid;

    System.out.println("Annual interest rate: " + intRateFormat.format(annualIntRate) + "\n" + 
    "Mortage amount: " + dollars.format(mortgageLoan) + "\n" + "Monthly payment: " + 
    dollars.format(monthlyPayment) + "\nTotal paid over the mortgage lifetime: " + dollars.format(totalPaid) +
    "\nTotal interest paid over loan amount over the lifetime of the mortgage: " + dollars.format(paidOver) +
    "\nPercentage paid over total loan: " + intRateFormat.format(paidOverAsPercent)+ "\n");

    }
}
