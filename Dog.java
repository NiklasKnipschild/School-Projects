/*
Class:      1321L
Section:    Wj1
Term:       Fall Semster 2022
Instructor: Surya Praveen Adivi
Name:       Niklas Knipschild
Lab#:       Lab12B
min/max/avg*/
class Dog
{
    int age = 0;
    double weight = 0.0;
    String name = "";
    String furColor = "";
    String breed = "";
    public static void bark()
    {
        System.out.println("Woof! Woof!");
    }
    void eat(double w){
        weight = weight + w;
    }
    void rename(String n){
        name = n;
    }
}