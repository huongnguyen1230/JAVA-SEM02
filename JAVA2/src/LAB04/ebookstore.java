package LAB04;

import java.sql.*;
import java.util.Scanner;

public class ebookstore {
    public static void main(String[] args) {
        try(
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookstore", "root", "");
                Statement stmt = conn.createStatement();
        )
        {
            String strSelect = "select * from books";
            System.out.println("the sql statement is: " + strSelect + "\n");
            ResultSet rset = stmt.executeQuery(strSelect);
            System.out.println("the record selected are: ");
            int rowCount = 0;
            while (rset.next()){
                String nameBook = rset.getString("nameBook");
                String author = rset.getString("author");
                String category = rset.getString("category");
                double price = rset.getDouble("price");
                int qty = rset.getInt("qty");
                System.out.println(nameBook + ", " + author +", "+category+ ", "  + price + ", " + qty);
                ++rowCount;
            }
            System.out.println("------------------------------------------");

            //2.3 tim sach theo the loai//
            Scanner input = new Scanner(System.in);
            System.out.println("enter category: ");
            strSelect = "select * from books where category like" + "\'%" + input.next() +"%\'";
            System.out.println("the sql statement is: " + strSelect +"\n");
            rset = stmt.executeQuery(strSelect);
            System.out.println("the result is: ");
            rowCount = 0;
            while (rset.next()){
                String nameBook = rset.getString("nameBook");
                String author = rset.getString("author");
                String category = rset.getString("category");
                double price = rset.getDouble("price");
                int qty = rset.getInt("qty");
                System.out.println(nameBook + ", " + author +", "+category+ ", "  + price + ", " + qty);
                ++rowCount;
            }
            System.out.println("------------------------------------------");

            //2.4 tim sach theo ten tac gia//
            Scanner scan = new Scanner(System.in);
            System.out.println("enter author: ");
            strSelect = "select * from books where author like" + "\'%" + input.next() +"%\'";
            System.out.println("the sql statement is: " + strSelect +"\n");
            rset = stmt.executeQuery(strSelect);
            System.out.println("the result is: ");
            rowCount = 0;
            while (rset.next()){
                String nameBook = rset.getString("nameBook");
                String author = rset.getString("author");
                String category = rset.getString("category");
                double price = rset.getDouble("price");
                int qty = rset.getInt("qty");
                System.out.println(nameBook + ", " + author +", "+category+ ", "  + price + ", " + qty);
                ++rowCount;
            }
            System.out.println("----------------------------------------------");

            //2.5 hien thi thong tin sach//
            Scanner info = new Scanner(System.in);
            System.out.println("enter author: ");
            strSelect = "select * from books where idBook like" + "\'%" + input.next() +"%\'";
            System.out.println("the sql statement is: " + strSelect +"\n");
            rset = stmt.executeQuery(strSelect);
            System.out.println("the result is: ");
            rowCount = 0;
            while (rset.next()){
                String nameBook = rset.getString("nameBook");
                String author = rset.getString("author");
                String category = rset.getString("category");
                double price = rset.getDouble("price");
                int qty = rset.getInt("qty");
                System.out.println(nameBook + ", " + author +", "+category+ ", "  + price + ", " + qty);
                ++rowCount;
            }
            System.out.println("total number of records = " + rowCount);
        }
            catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
