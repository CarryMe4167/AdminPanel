import java.sql.*;
import java.util.*;

public class Test {
    public static void main(String[] args) throws SQLException {
        System.out.println("What's up polapainz?");
        System.out.println("Enter username for oracle database");
        Scanner scan = new Scanner(System.in);
        String username = scan.nextLine();
        System.out.println("Enter password for " + username);
        String password = scan.nextLine();
        Connection conn = null;
        Statement stmt = null;
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost", username, password);
            System.out.println("Connection established successfully");
            stmt = conn.createStatement();
            stmt.execute("create table employees(" + "id number primary key," + "name varchar2(20)," + "dept varchar2(20))");
            stmt.execute("insert into employees values(1, 'LOL', 'LOL')");
            ResultSet res = stmt.executeQuery("select * from employees");
            while (res.next())
            {
                System.out.println(res.getInt("id") + res.getString("name") + res.getString("dept"));
            }
        }catch (SQLException e)
        {
            System.out.println(e);
        }
        finally
        {
            if ( conn != null )
                conn.close();
        }
    }
}
