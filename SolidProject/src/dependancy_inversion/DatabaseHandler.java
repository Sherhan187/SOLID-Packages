package dependancy_inversion.bad;

public class DatabaseHandler {
    private DataBase database;

    public DatabaseHandler(DataBase database){
        this.database = database;
    }

    public void connect(){
        this.database.connect();
    }

    public void disconnect(){
        this.database.disconnect();
    }

}