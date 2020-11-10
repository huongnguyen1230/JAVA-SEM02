package LAB06;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ex01 {
    public static void main(String[] args) {
        try (
                //step1: allocate  a database 'Connection' object
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop", "root", " ");
                //step2: allocate a 'statement' object in the connection
                Statement stmt = conn.createStatement();
        ) {
            //step 3&4: execute a sql update via executeUpdate()
            //which returns  an int indicating the number of rows affected
            //increase the price 50%
            String strUpdate = "update books set price = price * 5 where title = 'java for dummies'";
            System.out.println("the SQL statement is: " + strUpdate + "\n");
            int countUpdate = stmt.executeUpdate(strUpdate);
            System.out.println(countUpdate + "records effected. \n");
            //set qty = 0 where title is 'java for dummies'
            strUpdate = "update books set qty = 0 where title = 'java for dummies'";
            System.out.println("the SQL statement is: " + strUpdate + "\n");
            countUpdate = stmt.executeUpdate(strUpdate);
            System.out.println(countUpdate + "records effected. \n");

        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
