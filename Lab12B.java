import java.util.Scanner;
/*
Class:      1321L
Section:    Wj1
Term:       Fall Semster 2022
Instructor: Surya Praveen Adivi
Name:       Niklas Knipschild
Lab#:       Lab12B
min/max/avg*/
class Lab12B {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner (System.in);
        System.out.println("You are about to create a dog");
        Dog dogOne = new Dog();
        System.out.print("How old is the dog: ");
        dogOne.age = scan.nextInt();
        System.out.print("How much does the dog weigh: ");
        dogOne.weight = scan.nextDouble();
        System.out.print("What is the dog's name: ");
        dogOne.name = scan.next();
        System.out.print("What color is the dog: ");
        dogOne.furColor = scan.next();
        System.out.print("What breed is the dog: ");
        dogOne.breed = scan.next();
        System.out.println();

        System.out.println(dogOne.name + " is a " + dogOne.age + " year old " + dogOne.furColor + " " + dogOne.breed + " that weighs " + dogOne.weight + " lbs.\n");
        dogOne.bark();
        System.out.print(dogOne.name + " is hungry, how much should he eat: ");
        dogOne.eat(scan.nextDouble());
        System.out.print(dogOne.name + " isn't a very good name. What should they be renamed to: ");
        dogOne.name = scan.next();
        System.out.println("\n" + dogOne.name + " is a " + dogOne.age + " year old " + dogOne.furColor + " " + dogOne.breed + " that weighs " + dogOne.weight + " lbs.");
    }
}