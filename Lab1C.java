import java.util.Scanner;
/*
Class:      1321L
Section:    Wj1
Term:       Fall Semster 2022
Instructor: Surya Praveen Adivi
Name:       Niklas Knipschild
Lab#:       Lab1C
demostrate the reading of a string from a user
 */
public class Lab1C {
    public static void main (String[] args){
        int miles;
        double gallons, mpg;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of miles: ");
        miles = scan.nextInt();
        System.out.print("Enter the gallons of fuel used: ");
        gallons = scan.nextDouble();
        mpg = miles / gallons; //this was the logic error :)
        System.out.println("Miles Per Gallon: " + mpg);
    }
}