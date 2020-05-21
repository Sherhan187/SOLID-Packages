package Liskov_substitution;

public class CorporateCustomer extends Customer{
    public CorporateCustomer(String name, String customerType){
        super(name);
        this.customerType = customerType;
    }

    @Override
    public void addToDatabase() {
        System.out.println("Corporate customer " + this.name +  " added to database");
    }

    @Override
    public void receiveCashback()  throws Exception {
        System.out.println("Corporate customer " + this.name + " received cashback");
    }
}