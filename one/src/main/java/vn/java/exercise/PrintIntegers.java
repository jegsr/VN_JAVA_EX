package vn.java.exercise;

/*
 * Class responsible for printing all Integer numbers.
 */
public class PrintIntegers {
    //Constants
    private String strDividedThree = "Visual";
    private String strDividedFive = "Nuts";
    private String strDividedBoth = "Visual Nuts";

    /*
     * Method responsible for printing all the Ingers from the @minNumber up to
     * the @maxNumber.
     * 
     * If the integer is divided by 3 the String @strDividedThree will be printed,
     * if divided by 5 the String @strDividedFive will be printed,
     * if divided by both 3 and 5 the String @strDividedBoth will be printed,
     * if none of the above then the Integer will be printed.
     */
    public void printAllIntegers(int minNumber, int maxNumber) {
        for (int i = minNumber; i <= maxNumber; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(strDividedBoth);
            } else if (i % 3 == 0) {
                System.out.println(strDividedThree);
            } else if (i % 5 == 0) {
                System.out.println(strDividedFive);
            } else {
                System.out.println(i);
            }
        }
    }

}
