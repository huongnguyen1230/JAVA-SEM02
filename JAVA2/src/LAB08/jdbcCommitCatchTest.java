package LAB08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcCommitCatchTest {
    public static void main(String[] args) throws SQLException {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop", "root", "");
             Statement stmt = conn.createStatement();
             ){
            try{
                conn.setAutoCommit(false);

                stmt.executeUpdate("insert into books values (4001, 'paul chan', 'mahjong 101', 4.4, 4)");
                stmt.executeUpdate("insert into books values (4001, 'Peter chan', 'mahjong 102', 4.4, 4)");
                conn.commit();
            }catch (SQLException ex){
                System.out.println("--rolling back changes--");
                conn.rollback();
                ex.printStackTrace();
            }
        }
    }
}
