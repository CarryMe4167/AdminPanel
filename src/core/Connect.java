package core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Connect {
    String username = null;
    String password = null;
    String dbLocation = null;
    Connection conn = null;

    public Connect() throws ClassNotFoundException, SQLException {
        dbLocation = "jdbc:oracle:thin:";
        System.out.println("Is your database locally hosted? Y/N");
        Scanner scan = new Scanner(System.in);
        char ch = scan.next().charAt(0);
        if ( ch == 'Y' || ch == 'y' )
        {
            dbLocation += "@localhost";
        }
        else
        {
            dbLocation += "@localhost"; //change this when you figure out how to connect to online databases
        }
        scan.nextLine();
        System.out.println("Enter your username please");
        username = scan.nextLine();
        System.out.println("Enter your password please");
        password = scan.nextLine();
        System.out.println("Trying to establish connection to " + dbLocation + " for " + username + " with passowrd " + password);
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver"); //initialise driver
            conn = DriverManager.getConnection(dbLocation, username, password); //connect to local database
            System.out.println("Connection established successfully");
        }
        catch (SQLException | ClassNotFoundException e)
        {
            System.out.println("Exception: " + e);
        }
    }
    //do we need a destructor to close the connection or does the JVM handle that all on its own?
}
