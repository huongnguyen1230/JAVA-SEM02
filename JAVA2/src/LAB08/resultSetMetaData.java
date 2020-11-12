package LAB08;

import java.sql.*;

public class resultSetMetaData {
    public static void main(String[] args) throws SQLException {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop", "root", "");
             Statement stmt = conn.createStatement();
        ){
            try {
                ResultSet rset = stmt.executeQuery("select * from books");
                //get metadata of the result set
                ResultSetMetaData rsetMD = rset.getMetaData();
                //get the number of column frm metadata
                int numColumns = rsetMD.getColumnCount();

                //print column names - column index begins at 1( instead of 0)
                for (int i =1; i <= numColumns; i++){
                    System.out.printf("% - 30s", rsetMD.getColumnName(i));
                }
                System.out.println();
                //print column class names
                for (int i = 1; i <= numColumns; ++i){
                    System.out.printf("%-30s", "(" + rsetMD.getColumnClassName(i) + ")");
                }
                System.out.println();
                //print column contents for all the rows
                while (rset.next()){
                    for (int i = 1; i <= numColumns; ++i){
                        //getString() can be used for all column types
                        System.out.printf("%-30", rset.getString(i));
                    }
                    System.out.println();
                }
            }catch (SQLException ex){
                System.out.println("--rolling back changes--");
                conn.rollback();
                ex.printStackTrace();

            }
        }
    }
}
