import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.function.IntToDoubleFunction;

/*
Class:      1321L
Section:    Wj1
Term:       Fall Semster 2022
Instructor: Surya Praveen Adivi
Name:       Niklas Knipschild
Lab#:       Assignment2A
Bisonica currency conversion
 */
public class Assignment2C {
    public static void main (String[] args){
        final double BisonDollarToGBP = 5;
        final double USDtoGBP = 0.85;
        System.out.println("[Bisonica Currency Exchange]");
        System.out.println("General Bison welcomes you to Pax Bisonica!");
        Scanner scan = new Scanner(System.in);
        System.out.print("How many US dollars do you have? ");
        int USD = scan.nextInt();
        //formula for USD to GBP
        double ConvertUSDtoGBP = USD * USDtoGBP;
        //Formula for GBP to BisonDollar
        double ConvertGBPtoBisonDollar = ConvertUSDtoGBP / BisonDollarToGBP;
        //rouinding to two decimal
        DecimalFormat df = new DecimalFormat("###.####");
        //output
        System.out.println(USD + " US Dollar(s) is " + df.format(ConvertUSDtoGBP) + " British Pound(s), which is worth " + df.format(ConvertGBPtoBisonDollar) + " Bison Dollars(s)!");
    }
}
