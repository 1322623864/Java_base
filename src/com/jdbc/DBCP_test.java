package com.jdbc;

import java.sql.*;

public class DBCP_test {
    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            connection = JdbcUtils_DBCP.getConnection();
            String sql ="insert into users(id,name,password,email,birthday) values(?,?,?,?,?)";
            statement = connection.prepareStatement(sql);
            statement.setInt(1,15);
            statement.setString(2,"dety");
            statement.setString(3,"7142874");
            statement.setString(4,"dadsa@gmail");
            statement.setDate(5, new Date(new java.util.Date().getTime()));
            int i = statement.executeUpdate();
            if(i>0) {
                System.out.println("插入成功");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JdbcUtils_DBCP.release(connection,statement,resultSet);
            }
        }
    }

