package LAB06;

import java.sql.*;

public class ex02_3 {
    public static void main(String[] args) {
        try(
                //step1: allocate  a database 'Connection' object
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind", "root", "");
                //step2: allocate a 'statement' object in the connection
                Statement stmt = conn.createStatement();
        )
        { //update categories in Product
            String strUpdate = "update products set UnitPrice = UnitPrice * 10 where CategoryID = 5";
            System.out.println("the SQL statement is: " + strUpdate + "\n");
            int countUpdate = stmt.executeUpdate(strUpdate);
            System.out.println(countUpdate + " records effected. \n");

            String strSelect = "select UnitPrice from products where CategoryID = 5";
            System.out.println("the SQL statement is: " + strSelect + "\n");
            ResultSet rset = stmt.executeQuery(strSelect);
            while (rset.next()) { //move  the cursor to the next row
                System.out.println(rset.getDouble("UnitPrice"));
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
}
