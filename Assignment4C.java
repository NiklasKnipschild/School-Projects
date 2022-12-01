import java.util.Scanner;

/*
Class:      1321L
Section:    Wj1
Term:       Fall Semster 2022
Instructor: Surya Praveen Adivi
Name:       Niklas Knipschild
Lab#:       Assignment4C
backspacing: */
public class Assignment4C {
    public static void main(String[] args) throws InterruptedException{
        Scanner scan = new Scanner(System.in);
        String input = " ";
        String output = " ";
        System.out.println("[Back Space Animation]");
        System.out.println("Please enter your sentence:");
        input = scan.nextLine();
        System.out.println("How many letters do you want to backspace? ");
        int backspace = scan.nextInt();
        System.out.print(input);
            for (int b=0;b<backspace;b++)
            {
                Thread.sleep(500);
                System.out.print("\b");
            }
    }
}
