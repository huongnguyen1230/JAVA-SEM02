package LAB08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class batchProcessing {
    public static void main(String[] args) throws SQLException {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop", "root", "");
             Statement stmt = conn.createStatement();
        ){
            try {
                conn.setAutoCommit(false);

                stmt.addBatch("insert into books values(8001, 'Java ABC', 'Kevin Jones', 1.1, 99)");
                stmt.addBatch("insert into books values(8002, 'Java XYZ', 'Kevin Jones', 1.1, 99)");
                stmt.addBatch("update books set price = 11.11 where id = 8001 or id = 8002");
                int[] returnCodes = stmt.executeBatch();

                System.out.print("Return codes are: ");
                for (int code : returnCodes){
                    System.out.printf(code + ", ");
                }
                System.out.println();
                conn.commit();
            }catch (SQLException ex){
                System.out.println("--rolling back changes--");
                conn.rollback();
                ex.printStackTrace();
            }
        }
    }
}
