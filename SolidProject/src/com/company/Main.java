package com.company;

import Liskov_substitution.CorporateCustomer;
import Liskov_substitution.IndividualCustomer;
import Liskov_substitution.Subscriber;
import com.sun.source.tree.LiteralTree;
import dependancy_inversion.bad.DatabaseHandler;
import dependancy_inversion.bad.MySQLDatabase;
import dependancy_inversion.bad.OracleDatabase;
import interface_segregation.Kitchen;
import interface_segregation.Meal;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) throws Exception {
        // Liskov sub ***

        List<IDataBase> cList = new ArrayList<IDataBase>();
        cList.add(new IndividualCustomer("Tom", "Single"));
        cList.add(new CorporateCustomer("BI", "Corporate"));
        cList.add((IDataBase) new Subscriber("Subscriber 1"));


        for (IDataBase c : cList) {
            c.addToDatabase();
            c.receiveCashback();
        }

        // interface segregation

        Meal meal = new Meal("meal");
        Kitchen kitchen = new Kitchen();
        System.out.println("  ");

        // Dependency inversion ***

        DatabaseHandler databaseHandler = new DatabaseHandler(new MySQLDatabase());
        databaseHandler.connect();
        databaseHandler.disconnect();

    }

    // Liskov sub ***

    public interface IReczeiveCashback {
        void receiveCashback() throws Exception;
    }

    public interface IDataBase {
        public void addToDatabase();

        void receiveCashback() throws Exception;
    }


}
