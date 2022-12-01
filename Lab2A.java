import java.util.Scanner;
/*
Class:      1321L
Section:    Wj1
Term:       Fall Semster 2022
Instructor: Surya Praveen Adivi
Name:       Niklas Knipschild
Lab#:       Lab2A
Madlib
 */
public class Lab2A {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String name = scan.nextLine();
        System.out.print("Enter another name: ");
        String anothername = scan.nextLine();
        System.out.print("Enter a verb: ");
        String verb = scan.nextLine();
        System.out.print("Enter an adverb: ");
        String adverb = scan.nextLine();
        System.out.print("Once upon a time, there was a person named " + name + " who had a child named " + anothername + ". This child would " + verb +" " + adverb + " while singing to strangers.");
    }
}