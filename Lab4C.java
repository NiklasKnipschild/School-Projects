import java.util.Scanner;

/*
Class:      1321L
Section:    Wj1
Term:       Fall Semster 2022
Instructor: Surya Praveen Adivi
Name:       Niklas Knipschild
Lab#:       Lab4A
Menu In Put
 */
class Lab4C {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Welcome!");
    // variables
    int choice; // this will represent the user choice
    float formula; // this will represent the formula
    // collect number
    System.out.print("Please input a number: ");
    float num = scan.nextFloat(); // this is the number that will be plugged into the forumla
    // menu
    System.out.println("What would you like to do to this number:");
    System.out.println("0- Get the additive inverse of the number");
    System.out.println("1- Get the reciprocal of the number");
    System.out.println("2- Square the number");
    System.out.println("3- Cube the number");
    System.out.println("4- Exit the program");
    System.out.println(" "); // just to create spacing
    choice = scan.nextInt();
    // switch case statement
    switch (choice) {
      case 0:
        formula = num * -1;
        System.out.println(" ");
        System.out.print("The additive inverse of " + num + " is " + formula);
        break;
      case 1:
        formula = 1 / num;
        System.out.println(" ");
        System.out.print("The reciprocal of " + num + " is " + formula);
        break;
      case 2:
        formula = num * num;
        System.out.println(" ");
        System.out.print("The square of " + num + " is " + formula);
        break;
      case 3:
        formula = num * num * num;
        System.out.println(" ");
        System.out.print("the cube of " + num + " is " + formula);
        break;
      case 4:
        System.out.println(" ");
        System.out.print("Thank you, goodbye!");
        break;
      default:
        System.out.println(" ");
        System.out.print("Invalid input, please try again!");
    }
  }
}