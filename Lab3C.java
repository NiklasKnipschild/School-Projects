import java.text.DecimalFormat;
import java.util.Scanner;

/*
Class:      1321L
Section:    Wj1
Term:       Fall Semster 2022
Instructor: Surya Praveen Adivi
Name:       Niklas Knipschild
Lab#:       Lab3B
GPA Calc
 */
public class Lab3C {
    public static void main (String[] args){
        //scanner
        Scanner scan = new Scanner(System.in);
        //constant
        final int quarter = 25;
        final int dime = 10;
        final int nickel = 5;
        final int penny = 1;
        //formatting
        DecimalFormat centsformat = new DecimalFormat(".##");
        //input
        System.out.print("Enter the number of quarters: ");
        int quarters = scan.nextInt();
        System.out.print("Enter the number of dimes: ");
        int dimes = scan.nextInt();
        System.out.print("Enter the number of nickels: ");
        int nickels = scan.nextInt();
        System.out.print("Enter the number of quarters: ");
        int pennies = scan.nextInt();
        //inventory outputs
        System.out.println("You entered " + quarters + " quarters.");
        System.out.println("You entered " + dimes + " dimes.");
        System.out.println("You entered " + nickels + " nickels.");
        System.out.println("You entered " + pennies + " pennies.");
        //total formula
        int total = ((quarters * quarter) + (dimes * dime) + (nickels * nickel) + (pennies * penny));
        int dollars = total / 100;
        int cents = total % 100;
        System.out.println("Your total is " + dollars + " dollars and " + cents + " cents." );
    }
}
