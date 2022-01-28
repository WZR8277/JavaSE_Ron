package cn.ron.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo03Jdbc {
    public static void main(String[] args) {
        Statement stmt = null;
        Connection conn =null;
        try {
            //Class.forName("com.mysql.jdbc.Driver");
            String sql = "update account set balance = 1500 where id =3";
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db3",
                    "root", "woshi2388");
            stmt = conn.createStatement();

            int count = stmt.executeUpdate(sql);
            System.out.println(count);

            if (count>0){
                System.out.println("修改成功");
            }else {
                System.out.println("修改失败");
            }
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
