package cn.ron.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo05Jdbc {
    public static void main(String[] args) {
        Statement stmt = null;
        Connection conn =null;
        try {
            //Class.forName("com.mysql.jdbc.Driver");
             String sql = "create table student(id int, name varchar(20))";
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db3",
                    "root", "woshi2388");
            stmt = conn.createStatement();

            int count = stmt.executeUpdate(sql);
            System.out.println(count);

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if(stmt!=null){
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(conn!=null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
