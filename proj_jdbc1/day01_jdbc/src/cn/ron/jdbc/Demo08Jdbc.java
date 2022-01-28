package cn.ron.jdbc;

import cn.ron.domain.Emp;
import cn.ron.util.JDBCUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Demo08Jdbc {
    public List<Emp> findAll(){
        Statement stmt = null;
        Connection conn =null;
        ResultSet resultSet= null;
        List<Emp> list = null;
        try {
            //Class.forName("com.mysql.jdbc.Driver");
            conn = JDBCUtils.getConnection();
            String sql = "select * from emp";
            stmt = conn.createStatement();

            resultSet = stmt.executeQuery(sql);

            Emp emp = null;
            list = new ArrayList<Emp>();
            while (resultSet.next()){
                //获取数据
                int id = resultSet.getInt("id");
                String ename = resultSet.getString("ename");
                int job_id = resultSet.getInt("job_id");
                int mgr = resultSet.getInt("mgr");
                Date joindate = resultSet.getDate("joindate");
                double salary = resultSet.getDouble("salary");
                double bonus = resultSet.getDouble("bonus");
                int dept_id = resultSet.getInt("dept_id");
                // 创建emp对象,并赋值
                emp = new Emp();
                emp.setId(id);
                emp.setEname(ename);
                emp.setJob_id(job_id);
                emp.setMgr(mgr);
                emp.setJoindate(joindate);
                emp.setSalary(salary);
                emp.setBonus(bonus);
                emp.setDept_id(dept_id);

                //装载集合
                list.add(emp);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(resultSet,stmt,conn);
        }
        return list;
    }
    public static void main(String[] args) {
        List<Emp> list = new Demo08Jdbc().findAll();
        System.out.println(list);
    }
}
