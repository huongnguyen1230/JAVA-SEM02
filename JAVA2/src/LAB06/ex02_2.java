package LAB06;

import java.sql.*;

public class ex02_2 {public static void main(String[] args) {
    try(
            //step1: allocate  a database 'Connection' object
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind", "root", "");
            //step2: allocate a 'statement' object in the connection
            Statement stmt = conn.createStatement();
    )
    { //update address
        String strUpdate = "update customers set Address = '1A Yet Kieu - Ha Noi' where CustomerID = 'FRANK'";
        System.out.println("the SQL statement is: " + strUpdate + "\n");
        int countUpdate = stmt.executeUpdate(strUpdate);
        System.out.println(countUpdate + " records effected. \n");

        String strSelect = "select Address from customers where CustomerID = 'FRANK'";
        System.out.println("the SQL statement is: " + strSelect + "\n");
        ResultSet rset = stmt.executeQuery(strSelect);
        while (rset.next()) { //move  the cursor to the next row
            System.out.println(rset.getString("Address"));
        }
    }catch(SQLException ex){
        ex.printStackTrace();
    }
}

}
