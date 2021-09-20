import java.text.DecimalFormat;

import java.text.NumberFormat;

public class DecimalFormatPractice {

    public static void main(String[] args){

        String patternString = "$#,##0.00";

        // the zeros after the decimal point mean that 
        // our pattern will require decimals to the hundredths place
        // AND the number directly before the decimal point
        // even if our decimal points are 0.00
        // the # symbols specify that any digits in the tens, hundreds,
        // or thousands+ place will be separated by a comma
        // but because it is a # instead of a zero,
        // there does NOT have to be a digit there if it is < 1

        // money

        DecimalFormat myFormat = new DecimalFormat(patternString);

        // anything that has the myFormat method invoked
        // will have it's value converted to a String
        // that matches patternString

        String money = myFormat.format(44.719);

        // .format is a method associated with DecimalFormat

        System.out.println(money);

        // If we input a very large number, the format will
        // place commas every three digits due to standard grouping
        // way to go, format

        // If we input a number with more than two digits 
        // after the decimal point, the .format method will 
        // round up the value to the hundrenth place digit

        DecimalFormat percFormat = new DecimalFormat("0.0%");

        // REMEMBER TO ENCLOSE PATTERNS WITH DOUBLE QUOTES

        System.out.println(percFormat.format(0.075));

        // Both zero and # round up
        // Zero will force a digit to express itself
        // # will allow a digit to express itself if its > 0

        NumberFormat currFormat = NumberFormat.getCurrencyInstance();

        // NumberFormat must also be imported from java.text

        // getCurrencyInstance is a static method

        NumberFormat percFormatNum = NumberFormat.getPercentInstance();

        System.out.println(currFormat.format(213873.197643));

        // cool

        System.out.println(percFormatNum.format(1298353.12396));














    }
    
}
