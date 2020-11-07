package LAB06;

import java.sql.*;

public class jdbcUpdateTest {
    public static void main(String[] args) {
        try(
                //step1: allocate  a database 'Connection' object
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop", "root", "");
                //step2: allocate a 'statement' object in the connection
                Statement stmt = conn.createStatement();
                ){
            //step 3&4: execute a sql update via executeUpdate()
            //which returns  an int indicating the number of rows affected
            //increase the price 7% and qty by 1 for id = 1001
            String strUpdate = "update books set price = price * 0.7 where id = 1001";
            System.out.println("the SQL statement is: " + strUpdate + "\n");
            int countUpdate = stmt.executeUpdate(strUpdate);
            System.out.println(countUpdate + "records effected. \n");
            //step3&4: issue a SELECT to check the UPDATE
            String strSelect = "select * from books where id = 1001";
            System.out.println("the SQL statement is: " + strSelect + "\n");
            ResultSet rset = stmt.executeQuery(strSelect);
            while (rset.next()){ //move  the cursor to the next row
                System.out.println(rset.getInt("id") + ","
                + rset.getString("author")
                +rset.getString("title")
                +rset.getDouble("price")
                +rset.getInt("qty"));
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
