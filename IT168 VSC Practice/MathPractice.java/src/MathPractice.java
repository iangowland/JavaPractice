public class MathPractice {

    public static void main(String[] args) {

        // We do not need to import the .Math method 
        // because it is a part og the java.lang package

        double goldenMean = 1.618;

        double pi = 3.14;

        double sqrtOfTwo = Math.sqrt(2);

        double sqrtofThree = Math.sqrt(3);

        double sqrtOfThreeDivdByTwo = sqrtofThree / 2.0;

        System.out.println("\n" + " Square root of three divided by two = " + sqrtOfThreeDivdByTwo + "\n");

        double oneHalf = 1.0 / 2.0;

        double sqrtOfTwoDivdByTwo = sqrtOfTwo / 2.0;

        double goldenMeanSqrd = goldenMean * goldenMean;

        double goldenMeanSixthPow = Math.pow(goldenMean, 6);

        System.out.println("\n" + "The Golden Mean to the sixth power equals " + goldenMeanSixthPow + "\n");

        double cbrtOfTwentySeven = Math.cbrt(27);

        System.out.println("\n" + "The cube root of twenty-seven is " + cbrtOfTwentySeven + "\n");

        // Output: 3.0
        // nice 

        // IAN
        // What you need to learn is to check the API and become familiar with it
        // before you try throwing things at the wall
        // you will only frustrate yourself
        // coding in this manner
        // don't give up 

        System.out.println("Euler's number times two equals " + Math.E * 2 + "\n");



    }
}