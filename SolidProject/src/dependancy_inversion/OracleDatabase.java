package dependancy_inversion.bad;

public class OracleDatabase implements DataBase {
    public void connect(){
        System.out.println("connecting to oracle..");
    }
    public void disconnect(){
        System.out.println("disconnecting from oracle..");
    }
}
