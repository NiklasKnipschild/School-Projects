import java.util.Scanner;

/*
Class:      1321L
Section:    Wj1
Term:       Fall Semster 2022
Instructor: Surya Praveen Adivi
Name:       Niklas Knipschild
Lab#:       Lab5A
X & Y Coordinates
 */
class Lab5C {
    public static void main(String[] args) {
        // scanne section
        Scanner scan = new Scanner(System.in);
        // collect user input
        System.out.print("Enter X: ");
        int X = scan.nextInt();
        System.out.print("Enter Y: ");
        int Y = scan.nextInt();
        // the program area
        if (X==0 & Y==0){System.out.println("This point is on the origin.");}
        else if (X==0){System.out.println("This point is on the y axis.");}
        else if (Y==0){System.out.println("This point is on the x axis.");}
        else if (X>0 & Y>0) {System.out.println("This point is in the first quadrant.");}
        else if (X<0 & Y>0){System.out.println("This point is in the second quadrant.");}
        else if (X<0 & Y<0){System.out.println("This point is in the third quadrant.");}
        else if (X>0 & Y<0){System.out.println("This point is in the fourth quadrant.");}
    }
}