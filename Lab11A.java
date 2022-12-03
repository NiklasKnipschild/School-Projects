import java.util.Scanner;

/*
Class:      1321L
Section:    Wj1
Term:       Fall Semster 2022
Instructor: Surya Praveen Adivi
Name:       Niklas Knipschild
Lab#:       Assignment4A
min/max/avg*/
public class Lab11A
{
    public static void main(String[] args)
    {
    Scanner scan = new Scanner(System.in);
    while (true)
    {
        System.out.println("Menu");
        System.out.println("0) Hello World");
        System.out.println("1) Goodbye Moon");
        System.out.println("2) Walking on Sunshine");
        System.out.println();
        System.out.print("What would you like to do: ");
        int choice = scan.nextInt();
        System.out.println();
        if (choice == 0)
        {
            System.out.println("Hello!");
        }
        else if (choice == 1)
        {
            System.out.println("Ok, bye.");
        }
        else if (choice == 2)
        {
            System.out.println("WHOA!");
        }
        else
        {
            System.out.println("Invalid option!");
        }
        System.out.println("\nType yes to rerun. ");
        scan.nextLine();
        String input = scan.nextLine();
        if(!input.toLowerCase().equals("yes"))
        {
            System.out.println("\nProgram ends");
            break;
        }
    }
    }
}
