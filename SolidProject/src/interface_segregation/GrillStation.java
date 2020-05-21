package interface_segregation;


public class GrillStation implements GrillCook{

    @Override
    public Meal grillMeal() {
        return new Meal("Barbeque");
    }

}