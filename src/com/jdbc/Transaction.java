package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//不论写不写rollback() 遇到异常都会自动回滚！！！！！！！！
//==============================================================
//模拟转账成功时的业务场景
//模拟转账过程中出现异常导致有一部分SQL执行失败时手动通知数据库回滚事务
public class Transaction {
    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = JdbcUtils_C3P0.getConnection();
            connection.setAutoCommit(false);//通知数据库开启事务

            String sql1 = "update account set money = money-100 where name='A'";
            preparedStatement = connection.prepareStatement(sql1);
            preparedStatement.executeUpdate();

            //用这句代码模拟执行完SQL1之后程序出现了异常而导致后面的SQL无法正常执行，事务也无法正常提交，此时数据库会自动执行回滚操作
            //int x = 1/0;

            String sql2 = "update account set money = money+100 where name='B'";
            preparedStatement = connection.prepareStatement(sql2);
            preparedStatement.executeUpdate();

            connection.commit();//上面的两条SQL执行Update语句成功之后就通知数据库提交事务
            System.out.println("成功!!!!");
        } catch (Exception e) {
            try {//捕获到异常之后手动通知数据库执行回滚事务的操作
                connection.rollback();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            JdbcUtils_C3P0.release(connection,preparedStatement,resultSet);
        }

    }
}
