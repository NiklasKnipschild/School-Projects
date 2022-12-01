import java.util.Scanner;
/*
Class:      1321L
Section:    Wj1
Term:       Fall Semster 2022
Instructor: Surya Praveen Adivi
Name:       Niklas Knipschild
Lab#:       Lab7C
Triangle right
 */
public class Lab7C {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a value for the size: ");
        int size = scan.nextInt();
        System.out.println("This is the requested " + size + "x" + size + " right-triangle:");
        int left = size-1;
        for(int a = 0; a < size; a++)
        {
            for(int b=0; b < size; b++)
            {
                if (b>=left)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            left--;
            System.out.println();
        }
    }
}
