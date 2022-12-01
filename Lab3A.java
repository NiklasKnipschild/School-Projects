import java.text.DecimalFormat;
import java.util.Scanner;

/*
Class:      1321L
Section:    Wj1
Term:       Fall Semster 2022
Instructor: Surya Praveen Adivi
Name:       Niklas Knipschild
Lab#:       Lab3A
Credit Card
 */
public class Lab3A {
    public static void main (String[] args){
        //this is the formatting of the numbers
        DecimalFormat money = new DecimalFormat("##.##");
        DecimalFormat apr = new DecimalFormat("#.###");
        //scanner
        Scanner scan = new Scanner(System.in);
        //input
        System.out.print("Amount owed: $");
        float owed = scan.nextFloat();
        System.out.print("APR: ");
        float interest = scan.nextFloat();
        //formula section
        float monthlyAPR = interest / 12;
        // a note on the below formula, when I used the formula provided in the Lab3A instructors
        // I got the incorrect output I resolved this by puttinng in the /100
        float minPayment = owed * interest / 12 / 100;
        //output section
        System.out.println("Monthly percentage rate: " + apr.format(monthlyAPR));
        System.out.println("Minimum payment: $" + money.format(minPayment));
    }
}