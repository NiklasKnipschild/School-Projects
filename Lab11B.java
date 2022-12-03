import java.util.Scanner;

/*
Class:      1321L
Section:    Wj1
Term:       Fall Semster 2022
Instructor: Surya Praveen Adivi
Name:       Niklas Knipschild
Lab#:       Assignment4A
min/max/avg*/
public class Lab11B
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        boolean EightChars = false;
        boolean Uppercase = false;
        boolean hasnumber = false;
        int size;
        System.out.print("Enter a password: ");
        String password = scan.next();
        if (password.length()>=8)
        {
            EightChars=true;
        }
        for (int i=0; i < password.length(); i++)
        {
            if ((password.charAt(i))>=65 && (password.charAt(i) <=90))
            {
                Uppercase= true;
                break;
            }
        }
        for (int i=0; i < password.length();i++)
        {
            if ((password.charAt(i)) >=48 && (password.charAt(i)<=57))
            {
                hasnumber = true;
                break;
            }
        }
        if ((EightChars) && (Uppercase) && (hasnumber))
        {
            System.out.println("Valid password");
        }
        else
        {
            System.out.println("Invalid password");
        }
        System.out.println("\nProgram Ends");
    }
}
