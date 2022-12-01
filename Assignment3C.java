import java.util.Scanner;

/*
Class:      1321L
Section:    Wj1
Term:       Fall Semster 2022
Instructor: Surya Praveen Adivi
Name:       Niklas Knipschild
Lab#:       Assignment3C
Martial Arts */
public class Assignment3C {
    public static void main(String[] args) {
        //scanner = new Scan
        Scanner scan = new Scanner(System.in);
        //code start
        System.out.println("[App Checklist]");
        System.out.print("What mobile device do you have? ");
        String Phone = scan.next();
        //iphone
        if (Phone.equalsIgnoreCase("Apple"))
        {
            System.out.print("What verison do you have? ");
            float OS = scan.nextFloat();
            System.out.print("Does your apple device support Bluetooth? ");
            String bluetooth = scan.next();
            if (OS >= 12 && bluetooth.equalsIgnoreCase("Yes"))
            {
                System.out.println("Congratulations, you can run the app!");
            }
            else if (OS <= 12 || bluetooth.equalsIgnoreCase("No"))
            {
                System.out.println("I'm sorry, our app does not support your device");
            }
        }
        else if(Phone.equalsIgnoreCase("Android"))
        {
            System.out.print("What version do you have? ");
            float OS = scan.nextFloat();
            System.out.print("Does your device support Augmented Reality? ");
            String reality = scan.next();
            if (OS >= 11 && reality.equalsIgnoreCase("Yes"))
            {
                System.out.println("Congratulations, you can run the app!");
            }
            else if (OS <= 11 || reality.equalsIgnoreCase("No"))
            {
                System.out.println("I'm sorry, our app does not support your device");
            }
        }
        else
        {
            System.out.println("I'm sorry, our app does not support your device.");
        }
    }
}