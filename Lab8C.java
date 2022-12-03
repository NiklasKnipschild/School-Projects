import java.util.Scanner;

/*
Class:      1321L
Section:    Wj1
Term:       Fall Semster 2022
Instructor: Surya Praveen Adivi
Name:       Niklas Knipschild
Lab#:       Assignment4A
N BY N */
public class Lab8C {
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
        //this takes the above inputs and flattens the array into a 1d array
        System.out.println("\nThe " + rows + "x" + columns + " 2-D array flattened into a " + ArrayNXN + " cell 1-D array:");
        int[] array = new int[columns * rows];
        int count2 = 1;
        for (int a=0; a < array.length; a++)
        {
            System.out.print(count2 + "|");
            count2++;
        }
        System.out.println();
    }
}
