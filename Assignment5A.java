import java.util.Scanner;
/*
Class:      1321L
Section:    Wj1
Term:       Fall Semster 2022
Instructor: Surya Praveen Adivi
Name:       Niklas Knipschild
Lab#:       Assignment5A
friendslist*/
public class Assignment5A
{
    public static void main(String[] args)
    {
        String[] friendlist = new String[5]; //setup string
        Scanner scan = new Scanner(System.in);
        System.out.println("[Top 5 Friend's list']");
        while (true) {
            System.out.println("\nWhat would you like to do?");
            System.out.println("1) Enter a friend's name");
            System.out.println("2) Replace a friend's name");
            System.out.println("3) Display your friends list");
            System.out.println("4) Quit");
            System.out.print("Your choice: ");
            int choice = scan.nextInt();
            String name = " ";
            //using a switch statement because that makes the most sense for a menu like this
            switch (choice)
            {
                case 1:
                    //add friend
                    System.out.print("\nEnter a name ");
                    name = scan.next();
                    for (int index = 0; index < friendlist.length;index++)
                    {
                        if (friendlist[index]==null) {
                            friendlist[index] = name;
                            break;
                        }
                        if (friendlist[4] != null)
                        {
                            System.out.println("Sorry, your friends list is full!");
                            break;
                        }
                        if (friendlist[index].equals(name))
                        {
                            System.out.println("Sorry, they're already on the list!");
                            break;
                        }
                    }
                    break;
                case 2:
                    //replace a friend
                    System.out.print("Enter a name");
                    name = scan.next();
                    System.out.print("Enter an index");
                    int replace = scan.nextInt();
                    if (replace < 0 || replace > 5)
                    {
                        System.out.println("Sorry, that's an invalid command!");
                    }
                    if (friendlist[replace].equals(name)) {
                        System.out.println("Sorry, they're already on the list!");
                        break;
                    }
                    else
                    {
                        friendlist[replace] = name;
                    }
                    break;
                    //display the friends list
                case 3:
                    System.out.print("\nFriend's list");
                    for (int a=0; a< 5; a++)
                    {
                        System.out.print("\n" + (a+1)+ ") " + friendlist[a]);
                    }
                    break;
                    //end the program
                case 4:
                    System.out.println("\n[Program ends]");
                    break;
                    // default error message
                default:
                    System.out.println("Sorry, that's an invalid command!");
                    break;
            }
            if (choice == 4)
            {
                System.exit(0);
            }
        }
    }
}
