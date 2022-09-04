package vn.java.exercise;

/*
 * Main Class responsible for the execution of the code.
 */
public class App {
    public static void main(String[] args) {
        int startNumber = 1, maxNumber = 100;

        //Printing all numbers from 1 to 100.
        PrintIntegers printClass = new PrintIntegers();
        printClass.printAllIntegers(startNumber, maxNumber);
    }
}
