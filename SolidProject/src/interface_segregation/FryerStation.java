package interface_segregation;


public  class FryerStation implements FryerCook{

    @Override
    public Meal fryMeal() {
        return new Meal("Stake");
    }

}