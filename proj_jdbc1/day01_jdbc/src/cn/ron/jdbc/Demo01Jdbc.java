package cn.ron.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo01Jdbc {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        //1.导入jar包
        //2.注册驱动
        //Class.forName("com.mysql.jdbc.Driver"); 可以省略
        //3.获取数据库连接对象
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db3",
                "root", "woshi2388");
        //4.定义sql语句
        String sql = "update account set balance = 500 where id =1";
        //5.获取执行sql的对象statement
        Statement stmt = conn.createStatement();
        //执行
        int count = stmt.executeUpdate(sql);

        System.out.println(count);
        //释放资源
        stmt.close();
        conn.close();
    }
}
