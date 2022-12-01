import java.util.Scanner;

/*
Class:      1321L
Section:    Wj1
Term:       Fall Semster 2022
Instructor: Surya Praveen Adivi
Name:       Niklas Knipschild
Lab#:       Assignment3A
Martial Arts */
public class Assignment3B {
    public static void main(String[] args) {
        //scanner = new Scan
        Scanner scan = new Scanner(System.in);
        //code start
        System.out.println("[Martial Arts Belt]");
        System.out.print("What belt grade are you? ");
        int belt = scan.nextInt();
        switch (belt)
        {
            case 0:
                System.out.println("You have a black belt,");
                System.out.println("with 0 stripe!");
                break;
            case 1:
                System.out.println("You have a brown belt,");
                System.out.println("with 2 stripes!");
                break;
            case 2:
                System.out.println("You have a brown belt,");
                System.out.println("with 1 stripe!");
                break;
            case 3:
                System.out.println("You have a green belt,");
                System.out.println("with 2 stripes!");
                break;
            case 4:
                System.out.println("You have a green belt,");
                System.out.println("with 1 stripe!");
                break;
            case 5:
                System.out.println("You have a blue belt,");
                System.out.println("with 2 stripes!");
                break;
            case 6:
                System.out.println("You have a blue belt,");
                System.out.println("With 1 stripe");
                break;
            case 7:
                System.out.println("You have a yellow belt,");
                System.out.println("With 2 stripes!");
                break;
            case 8:
                System.out.println("You have a yellow belt,");
                System.out.println("With 1 stripe!");
                break;
            case 9:
                System.out.println("You have a white belt,");
                System.out.println("With 2 stripes!");
                break;
            case 10:
                System.out.println("You have a white belt,");
                System.out.println("With 1 stripe!");
                break;
            default:
                System.out.println("You have no belt...");
        }
    }
}
