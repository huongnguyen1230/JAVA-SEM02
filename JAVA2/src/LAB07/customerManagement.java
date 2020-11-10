package LAB07;

import LAB05.giftshop.Gift;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class customerManagement {
    private int id;
    private String name;
    private String email;
    private int phone;
    private String address;
    private String level;

    public customerManagement(){
        this.id = 0;
        this.name = "";
        this.email = "";
        this.phone = 0;
        this.address = "";
        this.level = " ";
    }

    public customerManagement(int id, String name, String email, int phone, String address, String level){
        this.id  = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.level = level;
    }
    //setter & getter
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhone(int phone) {
        this.phone = phone;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setLevel(String level) {
        this.level = level;
    }
    //

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public int getPhone() {
        return phone;
    }
    public String getAddress() {
        return address;
    }
    public String getLevel() {
        return level;
    }

    @Override
    public String toString() {
        return "customerManagement{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                ", address='" + address + '\'' +
                ", level='" + level + '\'' +
                '}';
    }
    List<customerManagement> objCM = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    //add: id, name, email, phone, address, level
    void addBook(){
        customerManagement objCM = new customerManagement();
        System.out.println("Enter customer id:" );
        int id = input.nextInt();
        objCM.setId(id);

        System.out.println("Enter customer's name: ");
        String name = input.nextLine();
        objCM.setName(input.nextLine());

        System.out.println("Enter customer's email: ");
        String email = input.nextLine();
        objCM.setEmail(email);

        System.out.println("Enter customer's phone: ");
        int phone = input.nextInt();
        objCM.setPhone(phone);

        System.out.println("Enter customer's address: ");
        String address = input.nextLine();
        objCM.setAddress(address);

        System.out.println("Enter customer's level: ");
        String level = input.nextLine();
        objCM.setLevel(level);

        System.out.println("Insert success");
    }

    //delete book
    void delete(int id) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookstore",
                "root", "");
             Statement stmt = conn.createStatement();) {
            String sqlDelete = "Delete From customer where idCus = " + id;
            System.out.println("The sql statement is: " + sqlDelete);
            stmt.executeUpdate(sqlDelete);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    void deleteBook(){
        System.out.println("Enter customer  's id you want to delete: ");
        int id = input.nextInt();
        delete(id);
        System.out.println("Delete success");
    }
}
