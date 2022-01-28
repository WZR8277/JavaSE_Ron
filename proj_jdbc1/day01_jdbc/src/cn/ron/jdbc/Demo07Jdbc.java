package cn.ron.jdbc;

import cn.ron.domain.Emp;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Demo07Jdbc {
    public List<Emp> findAll(){
        Statement stmt = null;
        Connection conn =null;
        ResultSet resultSet= null;
        List<Emp> list = null;
        try {
            //Class.forName("com.mysql.jdbc.Driver");
            String sql = "select * from emp";
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db3",
                    "root", "woshi2388");
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
        return list;
    }
    public static void main(String[] args) {
        List<Emp> list = new Demo07Jdbc().findAll();
        System.out.println(list);
    }
}
