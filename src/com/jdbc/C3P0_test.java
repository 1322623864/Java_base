package com.jdbc;

import java.sql.*;

public class C3P0_test {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            connection = JdbcUtils_C3P0.getConnection();
            String sql = "insert into users(id,name,password,email,birthday) values(?,?,?,?,?)";
            statement = connection.prepareStatement(sql);
            statement.setInt(1,13);
            statement.setString(2,"del");
            statement.setString(3,"714283");
            statement.setString(4,"del@gmail");
            statement.setDate(5, new Date(new java.util.Date().getTime()));
            int i = statement.executeUpdate();
            if(i>0){
                System.out.println("插入成功");
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            JdbcUtils_C3P0.release(connection,statement,resultSet);
        }
    }
}
