package LAB04;

import java.sql.*;
import java.util.Scanner;

public class ebookstore02 {
    public static void main(String[] args) {
        try(
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookstore", "root", "");
                Statement stmt = conn.createStatement();
        )

        //3.2hien thi don hang theo id customer
        {
            Scanner input = new Scanner(System.in);
            System.out.println("enter ID Customer: ");
            String strSelect = "select * from orderDetails where idCus like" + "\'%" + input.next() +"%\'";
            System.out.println("the sql statement is: " + strSelect +"\n");
            ResultSet rset = stmt.executeQuery(strSelect);
            System.out.println("the result is: ");
            int rowCount = 0;
            while (rset.next()){
                int id = rset.getInt("id");
                int idBook = rset.getInt("idBook");
                double price = rset.getDouble("price");
                int qty = rset.getInt("qty");
                System.out.println(id + ", " + idBook +", "+price+ ", " + qty);
                ++rowCount;
            }
            System.out.println("=============================================");
            //hien thi trang thai don hang theo id
            Scanner scan = new Scanner(System.in);
            System.out.println("enter ID Order Details: ");
            strSelect = "select status from orderDetails where id like" + "\'%" + input.next() +"%\'";
            System.out.println("the sql statement is: " + strSelect +"\n");
            rset = stmt.executeQuery(strSelect);
            System.out.println("the result is: ");
            rowCount = 0;
            while (rset.next()){
                int status = rset.getInt("status");
                System.out.println(status);
                ++rowCount;
            }
            System.out.println("=============================================");
            //hien thi thoong tin theo id
            Scanner info = new Scanner(System.in);
            System.out.println("enter ID Order Details: ");
            strSelect = "select * from orderDetails where id like" + "\'%" + input.next() +"%\'";
            System.out.println("the sql statement is: " + strSelect +"\n");
            rset = stmt.executeQuery(strSelect);
            System.out.println("the result is: ");
            rowCount = 0;
            while (rset.next()){
                int id = rset.getInt("id");
                String idCus = rset.getString("idCus");
                int idBook = rset.getInt("idBook");
                double price = rset.getDouble("price");
                int qty = rset.getInt("qty");
                int status = rset.getInt("status");
                System.out.println(id + "===" + idCus +"==="+idBook+ "==="  + price + "===" + qty+ "===" +status);
                ++rowCount;
            }
            System.out.println("total number of records = " + rowCount);
        }
        catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
