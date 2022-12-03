import java.util.Scanner;

/*
Class:      1321L
Section:    Wj1
Term:       Fall Semster 2022
Instructor: Surya Praveen Adivi
Name:       Niklas Knipschild
Lab#:       Assignment4A
N BY N */
public class Lab8B {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        ///collect rows & columns
        System.out.print("Please enter the number of rows: ");
        int rows = scan.nextInt();
        System.out.print("Please enter the number of columns: ");
        int columns = scan.nextInt();
        //generate n by n
        int ArrayNXN = columns * rows;
        int[][] array = new int [rows][columns];
        int count = 1;
        System.out.println("\nI have " + rows + " rows and " + columns + " columns. I need to fill-up " + ArrayNXN + " spaces.\n");
        System.out.println("\nThe " + rows + "x" + columns + " array:");
        for (int a=0; a<rows; a++)
        {
            for (int b=0;b<columns;b++)
            {
                System.out.print(count+"|");
                count++;
            }
            System.out.println();
        }
    }
}
