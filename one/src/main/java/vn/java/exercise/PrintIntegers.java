package vn.java.exercise;

public class PrintIntegers {
    private String strDividedThree = "Visual";
    private String strDividedFive = "Nuts";
    private String strDividedBoth = "Visual Nuts";

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
