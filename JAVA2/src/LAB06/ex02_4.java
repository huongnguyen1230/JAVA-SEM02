package LAB06;

import java.sql.*;

public class ex02_4 {
    public static void main(String[] args) {
        try(
                //step1: allocate  a database 'Connection' object
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind", "root", "");
                //step2: allocate a 'statement' object in the connection
                Statement stmt = conn.createStatement();
        )
        { //update in Orders
            String strUpdate = "update orders set ShipVia = 3 where OrderID = 10313";
            System.out.println("the SQL statement is: " + strUpdate + "\n");
            int countUpdate = stmt.executeUpdate(strUpdate);
            System.out.println(countUpdate + " records effected. \n");

        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
}
