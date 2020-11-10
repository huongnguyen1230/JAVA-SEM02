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
    void updateBook() {
        try (
               //step1: allocate  a database 'Connection' object
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookstore", "root", "");//step2: allocate a 'statement' object in the connection
                Statement stmt = conn.createStatement();
        ) { //update address
            System.out.println("Enter book's id: ");
            int id = input.nextInt();
            setId(id);

            String strUpdate = "update price, qty where  idBook = " + id;
            System.out.println("the SQL statement is: " + strUpdate + "\n");
            int countUpdate = stmt.executeUpdate(strUpdate);
            System.out.println(countUpdate + " records effected. \n");

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
