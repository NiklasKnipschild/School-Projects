import java.util.Scanner;
/*
Class:      1321L
Section:    Wj1
Term:       Fall Semster 2022
Instructor: Surya Praveen Adivi
Name:       Niklas Knipschild
Lab#:       Assignment4A
Study Abroad Program
 */
//I don't know if your going read this, but I'm legit starting to enjoy coding...I dreaded this class, this assignment was fun
public class Assignment4A
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("[CCSE Study Abroad Survey]");
        //variables I will use
        int student = 0;
        int Ghana = 0;
        int Pax = 0;
        int Costa = 0;
        int Italy = 0;
        String choice = "";
         //choice is the selection
        //using while statement to start the program
        while(!choice.equals("quit"))
        {
            student++;
            System.out.println("Student #:"+ student + " Which country should we go to for our next study abroad program?");
            System.out.println("Italy");
            System.out.println("Costa Rica");
            System.out.println("Pax Bisonica");
            System.out.println("Ghana");
            System.out.println("(Type Quit to end the survey)");
            choice = scan.nextLine();
            //using switch statement to calcuate the totals as its the only logical thing I could think of
            switch (choice)
            {
                case "Italy":
                    Italy++;
                    System.out.println("Thank you!");
                    System.out.println(" ");
                    break;
                case "Costa Rica":
                    Costa++;
                    System.out.println("Thank you!");
                    System.out.println(" ");
                    break;
                case "Pax Bisonica":
                    Pax++;
                    System.out.println("Thank you!");
                    System.out.println(" ");
                    break;
                case "Ghana":
                    Ghana++;
                    System.out.println("Thank you!");
                    System.out.println(" ");
                   break;
            }
        }
        //results, the logic behind this confused me for quite a while
        System.out.println("[Results]");
        System.out.println("Italy: " + Italy++);
        System.out.println("Costa Rica: " + Costa++);
        System.out.println("Pax Bisonica: " + Pax++);
        System.out.println("Ghana: " + Ghana++);
        System.out.println(" ");
        if (Italy > Costa && Italy > Pax && Italy > Ghana) {
            System.out.println("Next year's study abroad program will take place in Italy");
        }
        else if (Costa > Pax && Costa > Italy && Costa > Ghana){
            System.out.println("Next year's study abroad program will take place in Costa Rica");
        }
        else if (Pax > Ghana && Pax > Italy && Pax > Costa ){
            System.out.println("Next year's study abroad program will take place in Pax Bisonica");
        }
        else {
            System.out.println("Next year's study abroad program will take place in Ghana");
        }
    }
}
