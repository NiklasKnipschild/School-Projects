import java.util.Scanner;

/*
Class:      1321L
Section:    Wj1
Term:       Fall Semster 2022
Instructor: Surya Praveen Adivi
Name:       Niklas Knipschild
Lab#:       Lab1B
demostrate the reading of a string from a user
 */
public class Lab1B {
    public static void main (String[] args){
        String message;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        message = scan.nextLine();
        System.out.println("You wrote '" + message + "'");
    }
}