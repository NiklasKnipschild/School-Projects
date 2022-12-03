import java.util.Scanner;

/*
Class:      1321L
Section:    Wj1
Term:       Fall Semster 2022
Instructor: Surya Praveen Adivi
Name:       Niklas Knipschild
Lab#:       Assignment4A
two different arrays */
public class Lab8A {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        //arrays
        int[] firstArray = new int[5];
        int[] secondArray = new int[5];
        int[] thirdArray = new int [5];
        System.out.println("Please enter 5 integers for the first array: ");
        //collect first array int
        for (int a=1; a <= 5; a++)
        {
            System.out.print("Integer " + a + ": ");
            firstArray[a-1] = scan.nextInt();
        }
        System.out.println("\nPlease enter 5 integers for the second array: ");
        //collect 2nd array int
        for (int a=1; a <= 5; a++)
        {
            System.out.print("Integer " + a + ": ");
            secondArray[a-1] = scan.nextInt();
        }
        //math
        for (int a=1; a <= 5; a++)
        {
            thirdArray[a-1] = firstArray[a-1] + secondArray[a-1];
        }
        System.out.print("\nThe resulting sums are ");
        //final output
        for (int a=1; a<=5; a++)
        {
            System.out.print(thirdArray[a-1] + "|");
        }
    }
    }
