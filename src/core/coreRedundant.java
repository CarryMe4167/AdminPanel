package core;

import java.sql.*;
import java.util.Arrays;
import java.util.Scanner;

public class coreRedundant {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        System.out.println("What's up polapainz?");
//        System.out.println("Enter username for oracle database");
//        Scanner scan = new Scanner(System.in);
//        String username = scan.nextLine();
//        System.out.println("Enter password for " + username);
//        String password = scan.nextLine();
//        Connection conn = null;
//        Statement stmt = null;
//        try
//        {
//            Class.forName("oracle.jdbc.driver.OracleDriver"); //initialise driver
//            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost", username, password); //connect to local database
//            System.out.println("Connection established successfully");
//            stmt = conn.createStatement(); //create a statement
//            stmt.execute("create table employees(" + "id number primary key," + "name varchar2(20)," + "dept varchar2(20))"); //create a table
//            stmt.execute("insert into employees values(1, 'LOL', 'LOL')"); //insert into a table
//            stmt.execute("insert into employees values(1, 'LOLA', 'LOLA')"); //insert into a table returns error since unique constraint is violated
//            ResultSet res = stmt.executeQuery("select * from employees"); //this is a select query
//            while (res.next())
//            {
//                System.out.println("ID = " + res.getInt("id") + " NAME = " + res.getString("name") + " DEPT = " + res.getString("dept"));
//            }
//            stmt.execute("drop table employees"); //drop table
//            System.out.println("Successfully dropped table");
//        }catch (SQLException | ClassNotFoundException e)
//        {
//            System.out.println(e);
//        }
//        finally
//        {
//            if ( conn != null )
//                conn.close();
//        }
        System.out.println("Creating Connect object");
        Connect connObj = new Connect("dipto", "dipto123", "@localhost");
        System.out.println("Created Connect object");
    }
}
