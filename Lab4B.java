import java.util.Scanner;
/*
Class:      1321L
Section:    Wj1
Term:       Fall Semster 2022
Instructor: Surya Praveen Adivi
Name:       Niklas Knipschild
Lab#:       Lab4A
What is my grade
 */
class Lab4B 
{
  public static void main(String[] args) 
  {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the day: ");
    String day = scan.next();
    //switch statement
    switch (day.toLowerCase())
    {
      case "monday":
                System.out.println("I have class today!");
          break;
      case "wednesday":
        System.out.println("I have class today!");
          break;
      case "friday":
        System.out.println("It's Friday! Friday! Gotta get down on Friday!");
        break;
      default:
        System.out.println("I should use this time to do my homework.");
    } 
    }
}