class Chair
    /*
Class:      1321L
Section:    Wj1
Term:       Fall Semster 2022
Instructor: Surya Praveen Adivi
Name:       Niklas Knipschild
Lab#:       Lab12A
min/max/avg*/
{
    // default
    public int numOfLegs = 0;
    public boolean rolling = false;
    public String material = "";
    // default constructor
    Chair()
    {
        numOfLegs = 0;
        rolling = false;
        material = "";
    }
    // accepts all three attributes
    Chair(int n, boolean r, String m){
        numOfLegs = n;
        rolling = r;
        material = m;
    }
}