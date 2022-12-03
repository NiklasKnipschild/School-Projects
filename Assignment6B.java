import java.util.Scanner;

public class Assignment6B
{
    public static int WhatsMyTypeInt (int n1)
{
    return n1;
}
public static String WhatsMyTypeString(String words)
{
            return words;
}
public static float WhatsMyTypeFloat(float n1)
{
    return n1;
}
public static char WhatsMyTypeChar(char character)
{
    return character;
}
public static boolean WhatsMyTypeBoolean(boolean result)
{
    return result;
}
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("[What's my datatype?");
        System.out.print("\nEnter an int: ");
        int number = scan.nextInt();
        System.out.print("Enter a string: ");
        String word = scan.next();
        System.out.print("Enter a float: ");
        float decimal = scan.nextFloat();
        System.out.print("Enter a char: ");
        char character = scan.next().charAt(0);
        System.out.print("Enter a boolean: ");
        Boolean bool = scan.nextBoolean();
        System.out.println("\nWhat datatype do you want to check? ");
        String choice = scan.next();
        if (choice.equalsIgnoreCase("int"))
        {
            System.out.print("\n'" + WhatsMyTypeInt(number) + "' is a int value!");
        }
        else if (choice.equalsIgnoreCase("String"))
        {
            System.out.print("\n'" + WhatsMyTypeString(word) + "' is a string value!");
        }
        else if (choice.equalsIgnoreCase("Float"))
        {
            System.out.print("\n'" + WhatsMyTypeFloat(decimal) + "' is a float value!");
        }
        else if (choice.equalsIgnoreCase("char"))
        {
            System.out.print("\n'" + WhatsMyTypeChar(character) + "' is a char value!");
        }
        else if (choice.equalsIgnoreCase("Boolean"))
        {
            System.out.print("\n'" + WhatsMyTypeBoolean(bool) + "' is a boolean value!");
        }
    }
}
