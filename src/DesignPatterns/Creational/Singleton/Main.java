package DesignPatterns.Creational.Singleton;

public class Main {
    public static void main(String[] args) {

        DatabaseConnection databaseConnection = DatabaseConnection.getInstance();
        databaseConnection.connect();
        DatabaseConnection databaseConnection1 = DatabaseConnection.getInstance();
        databaseConnection1.connect();

        System.out.println(databaseConnection == databaseConnection1);
    }

}
