package LAB03;

import java.sql.*;

public class ex01_1 { public static void main(String[] args) {
    try(
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop", "root", "");
            Statement stmt = conn.createStatement();
    ){
        String strSelect  = "select * from books";
        System.out.println("the sql statement is: " + strSelect + "\n");
        ResultSet rset = stmt.executeQuery(strSelect);

        System.out.println("the record selected are: ");
        int rowCount = 0;
        while (rset.next()){
            String title = rset.getString("title");
            double price = rset.getDouble("price");
            int qty = rset.getInt("qty");
            System.out.println(title + ", " + price + ", " + qty);
            ++rowCount;
        }
        System.out.println("total number of records = " + rowCount);
    }catch (SQLException ex){
        ex.printStackTrace();
    }
}

}
