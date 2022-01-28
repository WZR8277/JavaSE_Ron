package cn.ron.jdbc;

import java.sql.*;

public class Demo06Jdbc {
    public static void main(String[] args) {
        Statement stmt = null;
        Connection conn =null;
        ResultSet resultSet= null;
        try {
            //Class.forName("com.mysql.jdbc.Driver");
            String sql = "select * from account";
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db3",
                    "root", "woshi2388");
            stmt = conn.createStatement();

            resultSet = stmt.executeQuery(sql);

            while (resultSet.next()){
                int id = resultSet.getInt(1);
                String name = resultSet.getString("name");
                double balance = resultSet.getDouble(3);
                System.out.println(id+"---"+name+"---"+balance);
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
            if(resultSet!=null){
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
