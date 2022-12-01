import java.util.Scanner;

/*
Class:      1321L
Section:    Wj1
Term:       Fall Semster 2022
Instructor: Surya Praveen Adivi
Name:       Niklas Knipschild
Lab#:       Assignment2A
Whose left out
 */
public class Assignment2A {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("How many people are in your group? ");
        int numberOfPeople = scan.nextInt();
        System.out.print("How many groups do you want? ");
        int numberOfGroups = scan.nextInt();
        //formula area
        int remainingNumber = numberOfPeople % numberOfGroups;
        //the below code spits out the output
        System.out.println("If we divide " + numberOfPeople + " in " + numberOfGroups + " groups evenly, " + remainingNumber + " person/people will be left without a group.");
    }
}
