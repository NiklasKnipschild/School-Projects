/*
Class:      1321L
Section:    Wj1
Term:       Fall Semster 2022
Instructor: Surya Praveen Adivi
Name:       Niklas Knipschild
Lab#:       Lab13A
*/
class BuildingBlueprint{
    private int stories;
    private int apartments;
    private float occupancy;
    private boolean fullOccupancy;

    public BuildingBlueprint(){
        stories = 10;
        apartments = 20;
        occupancy = 1.0f;
        fullOccupancy = true;
    }
    public BuildingBlueprint(int s, int a, float o){
        stories = s;
        apartments = a;
        occupancy = o;
        if (o == 1.0){
            fullOccupancy = true;
        }
        else {
            fullOccupancy = false;
        }
    }
    public float getOccupancy(){
        return occupancy;
    }
    public void setOccupancy(float o){
        if ((o >= 0.0) || (o <= 1.0)){
            occupancy = o;
        }
    }
    public int getStories(){
        return stories;
    }
    public int getApartments(){
        return apartments;
    }
    public boolean isFull(){
        return fullOccupancy;
    }



}