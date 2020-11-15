package LAB07;

import LAB05.giftshop.Gift;
import LAB05.giftshop.giftController;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class productManagement {
    private int id;
    private String name;
    private String author;
    private double price;
    private int qty;

    public productManagement(){
        this.id = 0;
        this.name = "";
        this.author = "";
        this.price = 0;
        this.qty = 0;
    }

    public productManagement(int id, String name, String author, double price, int qty){
        this.id  = id;
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }
//setter & getter
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }
    //

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getAuthor() {
        return author;
    }
    public double getPrice() {
        return price;
    }
    public int getQty() {
        return qty;
    }
    @Override
    public String toString() {
        return "productManagement{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }
    //
    List<productManagement> objPM = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    //add: id, name, author, price, qty
    void addBook(){
        productManagement objPM = new productManagement();
        System.out.println("Enter book id:" );
        int id = input.nextInt();
        objPM.setId(id);

        System.out.println("Enter book's name: ");
        String name = input.nextLine();
        objPM.setName(input.nextLine());

        System.out.println("Enter book's author: ");
        String author = input.nextLine();
        objPM.setAuthor(author);

        System.out.println("Enter book's price: ");
        double price = input.nextFloat();
        objPM.setPrice(price);

        System.out.println("Enter book's qty: ");
        int qty = input.nextInt();
        objPM.setQty(qty);

        System.out.println("Insert success");
    }

    //delete book
    void delete(int id) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore",
                "root", "");
             Statement stmt = conn.createStatement();) {
            String sqlDelete = "Delete From books where bookID = " + id;
            System.out.println("The sql statement is: " + sqlDelete);
            stmt.executeUpdate(sqlDelete);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    void deleteBook(){
        System.out.println("Enter book's id you want to delete: ");
        int id = input.nextInt();
        delete(id);
        System.out.println("Delete success");
    }
    //update boook

    void updateBook(){

            Scanner input = new Scanner(System.in);
            System.out.println("=== Update The books ===");
            System.out.println("Enter the BookID: ");
            id = input.nextInt();
            System.out.println("Update the Price: ");
            price = input.nextDouble();
            System.out.println("Update the qty: ");
            qty = input.nextInt();

            try(
                    Connection conn = DriverManager.getConnection(
                            "jdbc:mysql://localhost:3306/ebookstore", "root", "");
                    Statement stmt = conn.createStatement();
            ){
                String sqlUpdate = "update books set price = price and qty = qty where idBook = " + id;

                stmt.executeUpdate(sqlUpdate);
                System.out.println("records affected. \n");
                ResultSet rs = stmt.executeQuery(sqlUpdate);
                if(rs.next() ) {
                    System.out.println("The correct id");
                }else {
                    System.out.println("The Failed id");
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    void select() {
        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop",
                "root","");
            Statement stmt = conn.createStatement();) {
            String sqlSelect = "Select * from books";
            System.out.println("The sql statement is: " + sqlSelect);
            ResultSet rSet = stmt.executeQuery(sqlSelect);
            while (rSet.next()){
                System.out.println(rSet.getInt("bookID") + ", "
                        + rSet.getString("BookName") + ", "
                        +rSet.getString("author") + ", "
                        +rSet.getDouble("price") + ", "
                        +rSet.getInt("qty"));
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }    }

