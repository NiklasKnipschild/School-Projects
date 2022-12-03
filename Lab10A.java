import java.util.Scanner;

/*
Class:      1321L
Section:    Wj1
Term:       Fall Semster 2022
Instructor: Surya Praveen Adivi
Name:       Niklas Knipschild
Lab#:       Assignment4A
min/max/avg*/
public class Lab10A {
    public static int min(int n1, int n2)
    {
    if (n1 < n2)
        {
            return n1;
        }
    return n2;
    }
    public static int max(int n1, int n2)
    {
        if (n1 > n2)
        {
            return n1;
        }
        return n2;
    }
    public static double avg(double n1, double n2)
    {
        return ((double)n1+(double)n2) / 2;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = scan.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = scan.nextInt();
        System.out.println("Min is " + min(num1, num2));
        System.out.println("Max is " + max(num1, num2));
        System.out.println("Average is " + avg(num1, num2));
    }
}
