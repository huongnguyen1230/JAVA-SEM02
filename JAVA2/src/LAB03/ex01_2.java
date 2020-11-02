package LAB03;

import java.sql.*;

public class ex01_2 {
    public static void main(String[] args) {
        try(
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop", "root", "");
                Statement stmt = conn.createStatement();
        ){
            String strSelect  = "select title, price from books WHERE author = 'dang kim thi' ";
            System.out.println("the sql statement is: " + strSelect + "\n");

            ResultSet rset = stmt.executeQuery(strSelect);

            System.out.println("the record selected are: ");
            int rowCount = 0;
            while (rset.next()){
                String title = rset.getString("title");
                double price = rset.getDouble("price");
                System.out.println(title + ", " + price );
                ++rowCount;
            }
            System.out.println("total number of records = " + rowCount);
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
