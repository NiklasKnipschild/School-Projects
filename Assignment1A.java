import java.util.Scanner;
/*
Class:      1321L
Section:    Wj1
Term:       Fall Semster 2022
Instructor: Surya Praveen Adivi
Name:       Niklas Knipschild
Lab#:       Assignment 1A
Calucate print resolutions
 */
public class Assignment1A {
    public static void main (String[] args){
        //my variables
        float width;
        float height;
        int ppi;
        float widthinches;
        float heightinches;
        //scanner
        Scanner scan = new Scanner(System.in);
        System.out.println("[Print Resolution]");
        //collects width
        System.out.print("Enter the width (in pixels): ");
        width = scan.nextFloat();
        //collects height
        System.out.print("Enter the width (in pixels): ");
        height = scan.nextFloat();
        //collects PPI
        System.out.print("Enter the resolution (PPI): ");
        ppi = scan.nextInt();
        // formula
        widthinches = width / ppi;
        heightinches = height / ppi;
        //this is the output
        System.out.println("At " + ppi + " PPI, the image is " + widthinches + " by "  + heightinches + " high.");
    }
}
