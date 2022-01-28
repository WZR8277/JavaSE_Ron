package cn.ron.jdbctemplate;

import cn.ron.utils.JDBCUtils;
import org.springframework.jdbc.core.JdbcTemplate;

public class Demo01JdbcTemplate {
    public static void main(String[] args) {

        JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtils.getDataSource());
        String sql = "update account set balance = 5000 where id = ?";
        int count = jdbcTemplate.update(sql, 5);
        System.out.println(count);
    }
}
