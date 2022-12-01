import java.util.Scanner;

/*
Class:      1321L
Section:    Wj1
Term:       Fall Semster 2022
Instructor: Surya Praveen Adivi
Name:       Niklas Knipschild
Lab#:       Assignment2B
Basics of Animation
 */
public class Assignment2B {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("[Lerping!]");
        System.out.print("Enter the X coordinate for Keyframe #1: ");
        double keyframe1 = scan.nextInt();
        System.out.print("Enter the X Coordinate for Keyframe #2: ");
        double keyframe2 = scan.nextInt();
        System.out.print("How many frames have passed?: ");
        double framesPassed = scan.nextInt();
        //formula for how many places the character has moved
        double places = keyframe2 - keyframe1;
        //output
        System.out.println("The character has to move " + places + " places in a second.");
        //formula for 30 fps
        double fps30 = keyframe1 + places*framesPassed / 30;
        System.out.println("at 30 FPS, their current X position would be " + fps30);
        //formula for 60 fps
        double fps60 = keyframe1 + places*framesPassed / 60;
        System.out.println("at 60 FPS, their current X position would be " + fps60);
    }
}