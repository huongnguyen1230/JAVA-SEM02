package PRACTICE.Controller;



import PRACTICE.Model.student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class studentController {
 List<student> stu = new ArrayList<>();
    public void addStudent(){
            student st1 = new student();
            Scanner input = new Scanner(System.in);
            try(
                    Connection conn = DriverManager.getConnection(
                            "jdbc:mysql://localhost:3306/studentinf", "root", "");
                    Statement stmt = conn.createStatement();
            ){
                    System.out.println("Enter student's ID:" );
                    String id = input.nextLine();
                    st1.setStudentID(id);

                    System.out.println("Enter student's name: ");
                    String name = input.nextLine();
                    st1.setStudentName(name);

                    System.out.println("Enter student's address: ");
                    String address = input.nextLine();
                    st1.setAddress(address);

                    System.out.println("Enter student's phone: ");
                    int phone = input.nextInt();
                    st1.setPhone(phone);
            } catch (SQLException throwables) {
                    throwables.printStackTrace();
            }
       }
       public void selectStudent(){
               try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinf",
                       "root","");
                   Statement stmt = conn.createStatement();) {
                       String sqlSelect = "Select * from student";
                       ResultSet rSet = stmt.executeQuery(sqlSelect);
                       while (rSet.next()){
                               System.out.println(rSet.getString("StudentID") + ", "
                                       + rSet.getString("StudentName") + ", "
                                       +rSet.getString("Address") + ", "
                                       +rSet.getInt("Phone"));
                       }

               } catch (SQLException throwables) {
                       throwables.printStackTrace();
               }
          }
          public void display(){
                  try (
                         Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinf",
                          "root","");
                          Statement stmt = conn.createStatement();
                  ) {
                          String sqlSelect = "Select * from student";
                          ResultSet rSet = stmt.executeQuery(sqlSelect);
                          ResultSetMetaData rsetMD = rSet.getMetaData();
                          int numColums = rsetMD.getColumnCount();
                          for (int i = 1; i <= numColums; i++) {
                                  System.out.printf("%-30s", rsetMD.getColumnName(i));
                          }
                          selectStudent();
                          System.out.println();
                          while (rSet.next()) {
                                  for (int i = 1; i <= numColums; i++) {
                                          System.out.printf("%-30s", rSet.getString(i));
                                  }
                                  System.out.println();
                          }
                  } catch (SQLException throwables) {
                          throwables.printStackTrace();
                  }
          }
    }
