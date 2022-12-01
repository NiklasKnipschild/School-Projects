import java.util.Scanner;
/*
Class:      1321L
Section:    Wj1
Term:       Fall Semster 2022
Instructor: Surya Praveen Adivi
Name:       Niklas Knipschild
Lab#:       Lab5A
Driving me crazy
 */
class Lab5A {
    public static void main(String[] args) {
        // scanne section
        Scanner scan = new Scanner(System.in);
        // collect user input
        System.out.print("Do you have a driving permit (Y/N)? ");
        char answer = scan.next().charAt(0);
        // nested if statement
        if (answer == 'Y' || answer == 'y'){System.out.print("Do you have a commercial driving license (Y/N)? ");}
        else if (answer == 'n' || answer == 'N'){System.out.println("Driving permit is a prerequisite to purchase a vehicle!");
        System.exit(0);}
        char answer2 = scan.next().charAt(0);
        if (answer2 == 'y' || answer2 == 'Y'){System.out.println("Congratulations! You can purchase a vehicle, let's start talking options!");}
        else if (answer2 == 'n' || answer2 == 'N'){System.out.println("Commercial driving license is a prerequisite to purchase a vehicle!");}

    }
}