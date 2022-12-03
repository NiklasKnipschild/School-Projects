/*
Class:      1321L
Section:    Wj1
Term:       Fall Semster 2022
Instructor: Surya Praveen Adivi
Name:       Niklas Knipschild
Lab#:       Lab13A
*/
public class Lab13A
{
    public static void main(String[] args)
    {
        BuildingBlueprint buildingOne = new BuildingBlueprint();
        BuildingBlueprint buildingTwo = new BuildingBlueprint(30, 30, 0.75f);
        buildingOne.setOccupancy(1.0f);
        buildingTwo.setOccupancy(0.75f);
        System.out.println("Year 2020:");
        System.out.println("Building 1 has " + buildingOne.getStories() + " floors, " + buildingOne.getApartments() + " apartments, and is " + (int)((buildingOne.getOccupancy() * 100)) + "% occupied. Full? " + buildingOne.isFull());
        System.out.println("Building 2 has " + buildingTwo.getStories() + " floors, " + buildingTwo.getApartments() + " apartments, and is " + (int)((buildingTwo.getOccupancy() * 100)) + "% occupied. Full? " + buildingTwo.isFull());
        System.out.println("\nMany years pass.\n\nYear 2043:");

        buildingOne.setOccupancy(0.0f);
        buildingTwo.setOccupancy(1.0f);

        System.out.println("Building 1 has " + buildingOne.getStories() + " floors, " + buildingOne.getApartments() + " apartments, and is " + (int)((buildingOne.getOccupancy() * 100)) + "% occupied. Full? false");
        System.out.println("Building 2 has " + buildingTwo.getStories() + " floors, " + buildingTwo.getApartments() + " apartments, and is " + (int)((buildingTwo.getOccupancy() * 100)) + "% occupied. Full? true");

        System.out.println("\nLooks like people prefer taller buildings.");
    }
}
