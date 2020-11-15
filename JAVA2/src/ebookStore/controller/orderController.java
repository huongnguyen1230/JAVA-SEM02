package ebookStore.controller;

import ebookStore.models.orderDetail;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class orderController {
    List<orderDetail> orderList = new ArrayList<>();
    public List<orderDetail> loading(){
        try (
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookstore", "root", "");
                Statement stmt = conn.createStatement();
        ) {
            String select = "Select * from orderdetails";
            ResultSet rset = stmt.executeQuery(select);
            while(rset.next()){
                int Oid = rset.getInt("id");
                String idCus = rset.getString("idCus");
                double price = rset.getDouble("total");
                int status = rset.getInt("status");
                orderDetail obj = new orderDetail(Oid,idCus,price,status );
                orderList.add(obj);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return orderList;
    }
}
