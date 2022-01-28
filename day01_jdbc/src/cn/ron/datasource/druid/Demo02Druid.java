package cn.ron.datasource.druid;

import cn.ron.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Demo02Druid {
    public static void main(String[] args) {
        Connection connection =null;
        PreparedStatement preparedStatement =null;
        try {
            connection = JDBCUtils.getConnection();
            String sql = "insert into account values(null,?,?)";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,"王五");
            preparedStatement.setDouble(2,3000);
            int count = preparedStatement.executeUpdate();
            System.out.println(count);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(preparedStatement,connection);
        }
    }
}
