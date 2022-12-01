import java.util.Scanner;
/*
Class:      1321L
Section:    Wj1
Term:       Fall Semster 2022
Instructor: Surya Praveen Adivi
Name:       Niklas Knipschild
Lab#:       Lab7A
Box
 */
public class Lab7A {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a value for the size: ");
        int size = scan.nextInt();
        System.out.println("This is the requested " + size + "x" + size + " box:");
        for(int a = 0; a < size; a++) {
            for(int b=0; b < size; b++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
