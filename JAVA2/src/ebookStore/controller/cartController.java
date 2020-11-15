package ebookStore.controller;

import ebookStore.models.Book;
import ebookStore.models.cart;

import java.sql.*;

public class cartController {

    public cart getItem(Book book){
        cart obj = new cart();
        try (
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookstore", "root", "");
                Statement stmt = conn.createStatement();
        ) {
            String select = "Select * from books where idBook = "+book.getIdBook();
            ResultSet rset = stmt.executeQuery(select);
            System.out.printf("%-30s%-30s%-30s%-30s%-30s","bookID","title","price","qty","discount");
            System.out.println();
            int row = 0;
            int id = 0;
            String title = null;
            double price = 0;
            while (rset.next()) {
                id = rset.getInt("bookID");
                title = rset.getString("title");
                price = rset.getDouble("price");

                row++;
            }
            if(row==0){
                System.out.println("No book with entered ID");
                return null;
            }else
                obj = new cart(id, title, price, book.getQty());

        }catch (SQLException ex) {
            ex.printStackTrace();
        }
        return obj;
    }
}
