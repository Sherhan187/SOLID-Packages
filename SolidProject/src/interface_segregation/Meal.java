package interface_segregation;


public class Meal{
    String name;
    public Meal(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}