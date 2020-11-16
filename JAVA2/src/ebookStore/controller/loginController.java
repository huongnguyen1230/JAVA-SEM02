package ebookStore.controller;

import java.sql.*;
import java.util.Scanner;

public class loginController {
    public static void main(String[] args) {
        try(
                //step1: allocate  a database 'Connection' object
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookstore", "root", "");
                //step2: allocate a 'statement' object in the connection
                Statement stmt = conn.createStatement();
        ) {
            Scanner input = new Scanner(System.in);
            //username
            System.out.println("Username: ");
            String usernames = input.nextLine();
            //password
            System.out.println("Password: ");
            String password = input.nextLine();

            String strSelect = "select userName, password from users where userName ='" + usernames+"' and password ='"+password+"'";
            System.out.println("the SQL statement is: " + strSelect + "\n");

            ResultSet rset = stmt.executeQuery(strSelect);

            if(rset.next()){
                System.out.println("Login successfully!!");
            }else {
                System.out.println("Login failed!!");
            }

        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
