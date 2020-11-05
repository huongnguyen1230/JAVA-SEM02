package LAB05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        try (
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop", "root", "");
                Statement stmt = conn.createStatement();
        ) {
            //delete  records  with id >8000
            String sqlDelete = "delete from books where id>8000";
            System.out.println("the SQL statement is: " + sqlDelete + "\n");
            int countDelete = stmt.executeUpdate(sqlDelete);
            System.out.println(countDelete + "records deleted.\n");

            //insert 2 ban ghi
            String sqlInsert = "insert into books values "
                    + "(8002, 'Gone Fishing 2', 'Kumar', 22.22, 22),"
                    + "(8003, 'Gone Fishing 3', 'Kumar', 33.33, 33)";
            System.out.println("the SQL statement is: " + sqlInsert + "\n");
            int countInserted = stmt.executeUpdate(sqlInsert);
            System.out.println(countInserted + "record inserted. \n");

            System.out.println("============================================");
            //insert partial records
            sqlInsert = "insert into books (id, title, author) values (2001, 'my SQL', 'kim thi')";
            System.out.println("the SQL statement is: " + sqlInsert + "\n");
            countInserted = stmt.executeUpdate(sqlInsert);
            System.out.println(countInserted + "record inserted. \n");

            System.out.println("\n" + "========================================");
            //delete 1 cuon sach theo id
            Scanner input = new Scanner(System.in);
            System.out.println("Enter id: ");
            sqlDelete = "delete from books where id like" + "\'%" + input.next() +"%\'";
            System.out.println("the SQL statement is: " +sqlDelete + "\n");
            countDelete = stmt.executeUpdate(sqlDelete);
            System.out.println(countDelete + "records deleted.\n");
        }catch(SQLException ex) {
            ex.printStackTrace();
        }
    }
}

