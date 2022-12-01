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
public class Lab3B {
    public static void main (String[] args){
        //scanner
        Scanner scan = new Scanner(System.in);
        //input
        System.out.print("Course 1 hours: ");
        float course1 = scan.nextFloat();
        System.out.print("Grade for course 1: ");
        float coursegrade1 = scan.nextFloat();
        //course grade 2
        System.out.print("Course 2 hours: ");
        float course2 = scan.nextFloat();
        System.out.print("Grade for course 2: ");
        float coursegrade2 = scan.nextFloat();
        //course grade 3
        System.out.print("Course 3 hours: ");
        float course3 = scan.nextFloat();
        System.out.print("Grade for course 3: ");
        float coursegrade3 = scan.nextFloat();
        //course grade 4
        System.out.print("Course 4 hours: ");
        float course4 = scan.nextFloat();
        System.out.print("Grade for course 4: ");
        float coursegrade4 = scan.nextFloat();
        //formulas
        float totalHours = course1 + course2 + course3 + course4;
        System.out.println("Total hours is: " + totalHours);
        float totalgrade = (coursegrade1 * course1) + (coursegrade2 * course2) + (coursegrade3 * course3) + (coursegrade4 * course4);
        System.out.println("Total quality points is: " + totalgrade);
        float GPA = totalgrade / totalHours;
        System.out.println("Your GPA for this semster is " + GPA);
    }
}