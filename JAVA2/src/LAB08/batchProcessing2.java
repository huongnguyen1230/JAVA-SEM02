package LAB08;

import java.awt.desktop.SystemSleepEvent;
import java.sql.*;

public class batchProcessing2 {
    public static void main(String[] args)throws SQLException {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop", "root", "");
             //step2:
             PreparedStatement pstmt = conn.prepareStatement(
                     "insert into books values (?, ?, ?, ?, ?)");
        ) {
            try {

                conn.setAutoCommit(false);
                pstmt.setInt(1, 8003); //set values for parameters 1 to 5
                pstmt.setString(2, "Java 123");
                pstmt.setString(3, "Kevin Jones");
                pstmt.setDouble(4, 12.34);
                pstmt.setInt(5, 88);
                pstmt.addBatch();

                pstmt.setInt(1, 8004);//change in values for parameters 1 and 2
                pstmt.setString(2, "Java 456");
                //no change in values for parameters 3 and 5
                pstmt.addBatch();

                int[] returnCodes = pstmt.executeBatch();

                System.out.print("Return codes are: ");
                for (int code : returnCodes) System.out.printf(code + ", ");
                System.out.println();
                conn.commit();
            } catch (SQLException ex) {
                System.out.println("--rolling back changes--");
                conn.rollback();
                ex.printStackTrace();
            }
        }
    }
}
