package LAB08;

import java.sql.*;

public class preparedStatement {
    public static void main(String[] args) {
        try (
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop", "root", "");

                //two PreparedStatements, one of for INSERT, one of for SELECT
                PreparedStatement pstmt = conn.prepareStatement(
                        "insert into books values (?,?,?,?,?)");
                PreparedStatement pstmtSelect = conn.prepareStatement("select  * from books");
                ){
            pstmt.setInt(1,7001); //set values for parameters 1 to 5
            pstmt.setString(2, "Mahjong 101");
            pstmt.setString(3, "Kumar");
            pstmt.setDouble(4, 88.88);
            pstmt.setInt(5, 88);
            int rowInserted = pstmt.executeUpdate();
            System.out.println(rowInserted + "rows affected.");

            pstmt.setInt(1, 7002); //change values for parameters 1 and 2
            pstmt.setString(2, "Mahjong 102");
            //no change in values for parameters 3 to 5
            rowInserted = pstmtSelect.executeUpdate();
            System.out.println(rowInserted + "rows affected.");

            //issue a select to check the changes
            ResultSet rset = pstmtSelect.executeQuery();
            while (rset.next()){
                System.out.println(rset.getInt("id") + ", "
                                    + rset.getString("author") + ", "
                                    + rset.getString("title") + ", "
                                    + rset.getDouble("price") + ", "
                                    + rset.getInt("qty"));
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
