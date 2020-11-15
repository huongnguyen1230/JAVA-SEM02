package ebookStore.controller;

import ebookStore.models.Book;
import ebookStore.models.Cart;
import ebookStore.models.Users;
import ebookStore.models.orderDetail;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class bookController {
    List<Book> BookList = new ArrayList<>();

    public List<Book> loading() {
        try (
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookstore", "root", "");
                Statement stmt = conn.createStatement();
        ) {
            String select = "Select * from books";
            ResultSet rset = stmt.executeQuery(select);
            while (rset.next()) {
                int idBook = rset.getInt("idBook");
                String nameBook = rset.getString("nameBook");
                String author = rset.getString("author");
                int years = rset.getInt("years");
                String category = rset.getString("category");
                int qty = rset.getInt("qty");
                int status = rset.getInt("status");
                double price = rset.getDouble("price");
                Book obj = new Book(idBook, nameBook, author, category, status, qty, price, years);
                BookList.add(obj);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return BookList;
    }

    public boolean insertBook(Book book) {
        try (
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookstore", "root", "");
                Statement stmt = conn.createStatement();
        ) {
            String insert = "Insert into books(idBook,nameBook,author,qty,price) values(" + book.getIdBook() + ",'" + book.getNameBook() + "','" + book.getAuthor() + "'," + book.getQty() + "," + book.getPrice() + ")";
            stmt.executeUpdate(insert);
            loading();
            System.out.println("Book has been inserted");
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public int updateBook(Book book) {
        try (
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookstore", "root", "");
                Statement stmt = conn.createStatement();
        ) {
            String update = "update books set qty=" + book.getQty() + ",price=" + book.getPrice() + " where idBook =" + book.getIdBook();
            int count = stmt.executeUpdate(update);
            loading();
            if (count == 0) {
                return 0;
            } else {
                return 1;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return -1;
        }
    }

    public boolean deleteBook(Book book) {
        try (
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookstore", "root", "");
                Statement stmt = conn.createStatement();
        ) {
            String select = "select * from orderdetails where idBook =" + book.getIdBook();
            ResultSet rset = stmt.executeQuery(select);
            if (!rset.next()) {
                String delete = "delete from books where idBook =" + book.getIdBook();
                stmt.executeUpdate(delete);
                loading();
                System.out.println("Book has been deleted");
                return true;
            } else
                System.out.println("Cannot delete/No book found");
            return false;
        } catch (SQLException ex) {
            System.out.println("Cannot delete this book");
            ex.printStackTrace();
            return false;
        }
    }

    public void displayBook() {
        try (
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookstore", "root", "");
                Statement stmt = conn.createStatement();
        ) {
            String stt = "Select * from books";
            ResultSet rset = stmt.executeQuery(stt);
            ResultSetMetaData rsetMD = rset.getMetaData();
            int numColums = rsetMD.getColumnCount();
            for (int i = 1; i <= numColums; i++) {
                System.out.printf("%-30s", rsetMD.getColumnName(i));
            }
            loading();
            System.out.println();
            while (rset.next()) {
                for (int i = 1; i <= numColums; i++) {
                    System.out.printf("%-30s", rset.getString(i));
                }
                System.out.println();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }


    public void afterPurchase(List<Cart> list, Users user) {
        try (
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookstore", "root", "");
                Statement stmt = conn.createStatement();
        ) {
            double sum = 0;
            for (int i = 0; i < list.size(); i++) {
                sum = sum + list.get(i).getPrice() * list.get(i).getQty();
            }
            conn.setAutoCommit(false);
            orderController ctrl = new orderController();
            List<orderDetail> orderList = ctrl.loading();
            int j = orderList.size() - 1;
            int orderID = orderList.get(j).getId();
            for (int i = 0; i < list.size(); i++) {
                String update = "update books set qty = qty -" + list.get(i).getQty() + " where idBook = " + list.get(i).getBookID();
                stmt.executeUpdate(update);
                String insert = "insert into orderdetails(orderID, idBook,nameBoook,amount,price) values(" + orderID + "," + list.get(i).getBookID() + ",'" + list.get(i).getTitle() + "'," + list.get(i).getQty() + "," + list.get(i).getPrice();
                stmt.executeUpdate(insert);
            }
            conn.commit();
        } catch (SQLException ex) {
            System.out.println("Failed! Please try again");
            ex.printStackTrace();
        }
    }
}

