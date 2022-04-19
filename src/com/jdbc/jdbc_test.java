package com.jdbc;

import java.sql.*;

public class jdbc_test {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
    //要链接的数据库信息
        String url = "jdbc:mysql://localhost:3306/jdbcstudy?useUnicode=true&characterEncoding=utf8&useSSL=false";
        String username = "root";
        String password = "zzl121";

    //1.加载驱动
        Class.forName("com.mysql.jdbc.Driver");
    //2.与数据库获取链接
        Connection conn = DriverManager.getConnection(url,username,password);
    //3.获取用于向数据库发送sql语句的statement
        Statement statement = conn.createStatement();
        String sql = "SELECT * FROM users";
    //4.向数据库发送sql，并获取代表结果集的resultset
        ResultSet resultSet = statement.executeQuery(sql);
    //5.取出结果集数据
        while(resultSet.next()){
            System.out.println("id=" + resultSet.getObject("id"));
            System.out.println("name=" + resultSet.getObject("name"));
            System.out.println("password=" + resultSet.getObject("password"));
            System.out.println("email=" + resultSet.getObject("email"));
            System.out.println("birthday=" + resultSet.getObject("birthday"));
        }
    //6.关闭连接 释放资源
        resultSet.close();
        statement.close();
        conn.close();
    }
}
