import java.util.Scanner;
/*
Class:      1321L
Section:    Wj1
Term:       Fall Semster 2022
Instructor: Surya Praveen Adivi
Name:       Niklas Knipschild
Lab#:       Lab12A
min/max/avg*/
public class Lab12A
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner (System.in);

        Chair c1 = c1 = new Chair();

        System.out.println("You are about to create a chair.");
        System.out.print("How many legs does your chair have: ");
        c1.numOfLegs = scan.nextInt();
        System.out.print("Is your chair rolling (true / false): ");
        c1.rolling = scan.nextBoolean();
        System.out.print("What is your chair made of: ");
        c1.material = scan.next();
        if (c1.rolling)
        {
            System.out.println("\nYour chair has " + c1.numOfLegs + " legs, is rolling, and is made of " + c1.material + ".");
        }
        else{
            System.out.println("\nYour chair has " + c1.numOfLegs + " legs, is not rolling, and is made of " + c1.material + ".");
        }

        System.out.println("\nThis program is going to change that.");
        c1.numOfLegs = 4;
        c1.rolling = false;
        c1.material = "wood";

        System.out.println("\nYour chair has " + c1.numOfLegs + " legs, is not rolling, and is made of " + c1.material + ".");
    }
}