import java.util.Scanner;
/*
Class:      1321L
Section:    Wj1
Term:       Fall Semster 2022
Instructor: Surya Praveen Adivi
Name:       Niklas Knipschild
Lab#:       Assignment4A
min/max/avg*/
public class Lab10B {
    public static boolean valid(double n1, double n2)
    {
        if ((n1 + n2) >=30)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static double area(double n1, double n2)
    {
        return (n1*n2);
    }
    public static double perimeter(double n1, double n2)
    {
        return (2 * (n1 + n2));
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        char choice = 'Y';
        while ((choice == 'Y' || choice == 'y'))
        {
            System.out.print("Enter width: ");
            double width = scan.nextDouble();
            System.out.print("Enter height: ");
            double height= scan.nextDouble();
            if (valid(width,height) == false)
            {
                System.out.println("This is an invalid rectangle");
            }
            else
            {
                System.out.println("This is a valid rectangle");
                System.out.println("The area is " + area(width, height));
                System.out.println("The perimeter is " + perimeter(width, height));
            }
            System.out.print("Do you want to enter another width and height (Y/N)? : ");
            choice = scan.next().charAt(0);
            if (choice == 'n' || choice == 'N')
            {
                System.out.println("\nProgram Ends");
                System.exit(0);
            }
        }
    }
}
