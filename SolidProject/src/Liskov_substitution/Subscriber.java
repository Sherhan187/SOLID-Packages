package Liskov_substitution;

import com.company.Main;

public class Subscriber implements Main.IDataBase{
    private String name;

    public Subscriber(String name){
        this.name = name;
    }

    public String getName(String name) {
        return this.name;
    }

    @Override
    public void addToDatabase() {
        System.out.println("Subscriber " + getName(this.name) + " added to database");
    }

    @Override
    public void receiveCashback() throws Exception{
        System.out.println("Cannot receive cashback!");
    }


}