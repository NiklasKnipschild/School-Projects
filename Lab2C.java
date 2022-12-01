import java.util.Scanner;
/*
Class:      1321L
Section:    Wj1
Term:       Fall Semster 2022
Instructor: Surya Praveen Adivi
Name:       Niklas Knipschild
Lab#:       Lab2C
calculate area and perimeter
 */
public class Lab2C {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        //collect data
        System.out.print("Enter a width: ");
        Integer width = scan.nextInt();
        System.out.print("Enter a height: ");
        Integer height = scan.nextInt();
        //formulas
        Integer area = width * height;
        Integer perimeter = 2*(height + width);
        //output
        System.out.println("The area is " + area);
        System.out.println("The perimeter is " + perimeter);
    }
}