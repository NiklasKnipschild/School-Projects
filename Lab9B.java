import java.util.Scanner;
/*
Class:      1321L
Section:    Wj1
Term:       Fall Semster 2022
Instructor: Surya Praveen Adivi
Name:       Niklas Knipschild
Lab#:       Assignment4A
liner search*/
public class Lab9B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = new int [11];
        System.out.println("Please enter 11 numbers: ");
        //asks for input
        for (int i=1;i<12;i++)
        {
            System.out.print("Integer " + i + ": ");
            numbers[i-1] =scan.nextInt();
        }
        System.out.println();
        // what is target value?
        System.out.print("What is the target number: ");
        int target = scan.nextInt();
        //sort for unsorted arrays
        for (int i=0;i< numbers.length -1;i++)
        {
            for (int j=0;j<numbers.length - i - 1; j++)
            {
                if (numbers[j] >numbers[j+1])
                {
                    int temp = numbers[j];
                    numbers[j]=numbers[j+1];
                    numbers[j+1]=temp;
                }
            }
        }
        //print array
        System.out.print("\nThe sorted set is: ");
        for (int i=0; i<11;i++)
        {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\n");
        //search
        boolean found = false;
        int low = 0, high = numbers.length - 1;
        while (low <= high)
        {
            int mid = (low + high) / 2;
            System.out.println("\nLow is " + low);
            System.out.println("\nHigh is " + high);
            System.out.println("\nMid is " + mid);
            System.out.println("\n Searching");
            if (numbers[mid] == target)
            {
                found = true;
                break;
            }
            else if (target > numbers[mid])
        {
            low = mid + 1;
        }
            else
        {
            high = mid - 1;
        }
        }
        if (found)
        {
            System.out.println("\nThe target is in the set.");
        }
        else
        {
            System.out.println("\nThe target is not in the set.");
        }
    }
}