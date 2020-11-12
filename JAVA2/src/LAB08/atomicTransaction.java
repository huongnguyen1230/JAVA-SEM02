package LAB08;

import java.sql.*;

public class atomicTransaction {
    public static void main(String[] args) throws SQLException {
        try (
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop", "root", "");
                Statement stmt = conn.createStatement();
        ) {
            try {
                conn.setAutoCommit(false);
                //before changes
                ResultSet rset = stmt.executeQuery("select id , qty from books where id in (1001,1002)");
                System.out.println("--before UPDATE--");
                while (rset.next()) {
                    System.out.println(rset.getInt("id") + ", " + rset.getInt("qty"));
                }
                conn.commit(); //commit select

                //issue two update statements thru executeUpdate()
                stmt.executeUpdate("update books set qty = qty + 1  where id = 1001");
                stmt.executeUpdate("update books set qty = qty + 1  where id = 1002");
                conn.commit();

                rset = stmt.executeQuery("select id, qty from books where id in (1001, 1002)");
                System.out.println("--After update and commit--");
                while (rset.next()) {
                    System.out.println(rset.getInt("id") + ", " + rset.getInt("qty"));
                }
                conn.commit();

                //issue two update statements thru executeUpdate()
                stmt.executeUpdate("update books set qty = qty -99 where id = 1001");
                stmt.executeUpdate("update books set qty = qty -99 where id = 1002");
                conn.rollback();

                rset = stmt.executeQuery("select id, qty from books where id in (1001,1002)");
                System.out.println("--After update and rollback--");
                while (rset.next()) {
                    System.out.println(rset.getInt("id") + ", " + rset.getInt("qty"));
                }
                conn.commit();

            } catch (SQLException ex) {
                System.out.println("--rolling back changes--");
                conn.rollback();
                ex.printStackTrace();
            }
        }
    }
}
