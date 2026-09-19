package DesignPatterns.Creational.Singleton;

public class DatabaseConnection {
    //private instance variable

    private static DatabaseConnection databaseInstance;

    //private constructor
    private DatabaseConnection() {

    }
    //public method to get instance

    public static synchronized DatabaseConnection getInstance() {
        if (databaseInstance == null) {
            databaseInstance = new DatabaseConnection();
        }
        return databaseInstance;
    }

    public void connect() {
        System.out.println("Connected to database");
    }
}
