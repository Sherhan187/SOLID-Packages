package dependancy_inversion.bad;

public class MySQLDatabase implements DataBase{

    public void connect() {
        System.out.println("connecting database..");
    }

    public void disconnect() {
        System.out.println("disconnecting database..");
    }
}