import java.util.Scanner;
/*
Class:      1321L
Section:    Wj1
Term:       Fall Semster 2022
Instructor: Surya Praveen Adivi
Name:       Niklas Knipschild
Lab#:       Assignment4A
liner search*/
public class Lab9A {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int[] array=new int[10];
        int a,num,target=0;
        System.out.println("Please enter 10 numbers: ");
        for(a=0;a<10;a++)
        {
            System.out.print("Integer "+(a+1)+": ");
            array[a]=scan.nextInt();
        }
        System.out.print("\nWhat is the target number: ");
        num=scan.nextInt();
        for(a=0;a<10;a++)
        {
            if(array[a]==num)
            {
                target=1;
                break;
            }
        }
        if(target==1)
            System.out.println("\nThe target is in the set.");
        else
            System.out.println("The target is not in the set.");
    }
}
