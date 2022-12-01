import java.util.Scanner;

/*
Class:      1321L
Section:    Wj1
Term:       Fall Semster 2022
Instructor: Surya Praveen Adivi
Name:       Niklas Knipschild
Lab#:       Assignment3A
Epic Quest
 */
class Assignment3A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //story start
        System.out.println("[Epic Quest Simulator]");
        System.out.println("Hello stranger! Do you have time to hear my tale?");
        System.out.println("1) Yes");
        System.out.println("2) No");
        //each level of the story will be called step, variables will go up by 1 step each step
        int step1 = scan.nextInt();
        //step 1 start
        if (step1 == 2)
        {
            System.out.println("Ah, then goodbye...");
        }
        //step 2 start
        else if (step1 == 1)
        {
            System.out.println("Thank you! I come from the land of Pax Bisonica. Our country has been taken over by a cruel tyrant!");
            System.out.println("1) That's awful");
            System.out.println("2) What can I do");
            int step2 = scan.nextInt();
            if (step2 == 1)
        {
            System.out.println("Alas, it is truly terrible...");
            System.out.println("Please, you must journey to Pax Bisonica and free our country!");
            System.out.println("1) Yes");
            System.out.println("2) No");
            int step3 = scan.nextInt();
            if (step3 == 2)
            {
                System.out.println("Then all is lost...");
            }
            else if (step3 == 1)
            {
                System.out.println("Hooray!");
            }
        }

            else if (step2 == 2)
            {
                //start of step 4
                System.out.println("Please, you must journey to Pax Bisonica and free our country!");
                System.out.println("1) Yes");
                System.out.println("2) No");
                int step4 = scan.nextInt();
                if (step4 == 2)
                {
                    System.out.println("Then all is lost");
                }
                else if (step4 ==1)
                {
                    System.out.println("Hooray!");
                }
            }
        }
            }
}