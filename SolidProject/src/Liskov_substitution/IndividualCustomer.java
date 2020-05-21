package Liskov_substitution;

public class IndividualCustomer extends Customer{

    public IndividualCustomer(String name, String customerType) {
        super(name);
        this.customerType = customerType;
    }

    @Override
    public void addToDatabase() {
        System.out.println("Individual customer " + this.name + " added to database");

    }

    @Override
    public void receiveCashback() throws Exception {
        System.out.println("Individual customer " + this.name + " received cashback");
    }
}