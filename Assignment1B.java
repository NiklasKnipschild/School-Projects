import java.util.Scanner;
/*
Class:      1321L
Section:    Wj1
Term:       Fall Semster 2022
Instructor: Surya Praveen Adivi
Name:       Niklas Knipschild
Lab#:       Assignment 1B
Calucate final grade
 */
public class Assignment1B {
    public static void main(String[] args) {
        /* Weighted Grading
        assignments 40%
        Lab 10%
        midterm 20%
        final 30%
         */
        //variables note
        float lab, assignment, midterm, finalexam, wlab, wassignment, wmidterm, wfinalexam, finalgrade; //w  means weighted
        //scanner
        Scanner scan = new Scanner(System.in);
        //collect the data
        System.out.println("[CSE 1321L Final Grade Calculator]");
        System.out.print("Enter your average lab grade: ");
        lab = scan.nextFloat();
        System.out.print("Enter your average assignment grade: ");
        assignment = scan.nextFloat();
        System.out.print("Enter your midterm exam grade: ");
        midterm = scan.nextFloat();
        System.out.print("Enter your final exam grade: ");
        finalexam = scan.nextFloat();
        //get weighted grade
        wlab = lab * .1f;
        wassignment = assignment * .4f;
        wmidterm = midterm * .2f;
        wfinalexam = finalexam * .3f;
        //output the data into weighted grades
        System.out.println("Your weighted lab average is " + wlab);
        System.out.println("Your weighted assignment average is " + wassignment);
        System.out.println("Your weighted midterm exam average is " + wmidterm);
        System.out.println("Your weighted final exam average is " + wfinalexam);
        //formula for final grade
        finalgrade = wlab + wassignment + wmidterm + wfinalexam;
        //Output of final grade
        System.out.println("Adding numbers...");
        System.out.print("Your final grade in CSE 1321L is " + finalgrade);

    }
}