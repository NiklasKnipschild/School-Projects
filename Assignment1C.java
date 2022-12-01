import java.util.Scanner;
/*
Class:      1321L
Section:    Wj1
Term:       Fall Semster 2022
Instructor: Surya Praveen Adivi
Name:       Niklas Knipschild
Lab#:       Assignment 1C
produces next three letters
 */
public class Assignment1C {
    public static void main(String[] args){
        //scanner
        Scanner scan = new Scanner(System.in);
        System.out.println("[And the next letter is]");
        //collects the letter
        System.out.print("Please enter a letter: ");
        char charcter = scan.next().charAt(0);
        //prints the next three letters
        System.out.print("The next letters after " + charcter + " are " + ((char) (charcter + 1)) + ", " + ((char) (charcter + 2)) + ", " + ((char) (charcter + 3)) + "!");
        //I used this guide here: https://stackoverflow.com/questions/2899301/how-do-i-increment-a-variable-to-the-next-or-previous-letter-in-the-alphabet to understand the assignment
    }
}