import java.util.Scanner;
/*
Class:      1321L
Section:    Wj1
Term:       Fall Semster 2022
Instructor: Surya Praveen Adivi
Name:       Niklas Knipschild
Lab#:       Lab4A
Sensible Division
 */
class Lab5B
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in); // scanne
        System.out.print("Enter an integer: ");
        int number = scan.nextInt();
        // program
        if (number%2==0){System.out.println("This number is divisible by 2");}
        else if (number%3==0){System.out.println("This number is divisible by 3");}
        else if (number%5==0){System.out.println("This number is divisible by 5");}
        else {System.out.println("This number is undetermined");}
    }
}