import java.util.Scanner;

/*
Class:      1321L
Section:    Wj1
Term:       Fall Semster 2022
Instructor: Surya Praveen Adivi
Name:       Niklas Knipschild
Lab#:       Assignment5A
whats your sign
*/
public class Assignment5B
{
    public static void main(String[] args)
    {
        String[][] sign = new String [13][32];
        //start for loop
        for (int m=1;m<=12;m++)
        {
            for (int d=1; d<=31;d++)
            {
                // start the signs
                if (m==1 && d >=1 || m==2 && d <=10 )
                {
                    sign[m][d] = "Aquarius";
                }
                if (m==2 && d >=19 || m==3 && d <=20 )
                {
                    sign[m][d] = "Pisces";
                }
                if (m==3 && d >=21 || m==4 && d <=19 )
                {
                    sign[m][d] = "Aries";
                }
                if (m==4 && d >=20 || m==5 && d <=20 )
                {
                    sign[m][d] = "Taurus";
                }
                if (m==5 && d >=21 || m==6 && d <=21 )
                {
                    sign[m][d] = "Gemini";
                }
                if (m==6 && d >=22 || m==7 && d <=22 )
                {
                    sign[m][d] = "Cancer";
                }
                if (m==7 && d >=23 || m==8 && d <=22 )
                {
                    sign[m][d] = "Leo";
                }
                if (m==8 && d >=23 || m==9 && d <=22 )
                {
                    sign[m][d] = "Virgo";
                }
                if (m==9 && d >=23 || m==10 && d <=23 )
                {
                    sign[m][d] = "Libra";
                }
                if (m==10 && d >=24 || m==11 && d <=21 )
                {
                    sign[m][d] = "Scorpius";
                }
                if (m==11 && d >=22 || m==12 && d <=2 )
                {
                    sign[m][d] = "Sagittarius";
                }
                if (m==12 && d >=22 || m==1 && d <=19 )
                {
                    sign[m][d] = "Capricornus";
                }
            }
        }
        while (true)
        {
            System.out.println("\n[What's your sign?]");
            Scanner scan = new Scanner(System.in);
            //collect user input
            System.out.print("What month were you born in? ");
            int month = scan.nextInt();
            //error checking
            if (month < 1 || month > 12)
            {
                System.out.println("That is not a valid month...");
                break;
            }
            System.out.print("And what day? ");
            int day = scan.nextInt();
            // error checking
            if (day < 1 || month > 31)
            {
                System.out.println("That is not a valid day...");
                break;
            }
            //spit out the sign
            System.out.println("\nYour sign is " + sign[month][day] + "!");
        }
    }
}
