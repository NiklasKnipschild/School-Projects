import java.util.Scanner;

/*
Class:      1321L
Section:    Wj1
Term:       Fall Semster 2022
Instructor: Surya Praveen Adivi
Name:       Niklas Knipschild
Lab#:       Lab4A
What is my grade
 */
class Lab4A {
  public static void main(String[] args) {
    //scanner section
    Scanner scan = new Scanner(System.in);
    //collect user input
    System.out.print("Enter the score of your exam: ");
    float grade = scan.nextFloat();
    //if and else/if statements + output
    if (grade >= 98)    {System.out.println("Letter grade is: A+");}
    else if (grade >= 95) {System.out.println("Letter grade is: A");}
    else if (grade >= 92) {System.out.println("Letter grade is: A-");}
    else if (grade >= 89) {System.out.println("Letter grade is: B+");}
    else if (grade >= 86) {System.out.println("Letter grade is: B");}
    else if (grade >= 83) {System.out.println("Letter grade is: B-");}
    else if (grade >= 80) {System.out.println("Letter grade is: C+");}
    else if (grade >= 77) {System.out.println("Letter grade is: C");}
    else if (grade >= 74) {System.out.println("Letter grade is: C-");}
    else if (grade >= 71) {System.out.println("Letter grade is: D+");}
    else if (grade >= 68) {System.out.println("Letter grade is: D");}
    else if (grade >= 65) {System.out.println("Letter grade is: D-");}
    else if (grade <= 64) {System.out.println("Letter grade is: F");}
  }
}