package com.jdbc;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//数据库连接工具类
public class JdbcUtils_C3P0 {
    private static ComboPooledDataSource ds = null;
    //在静态代码块中创建数据库连接池
    static {
        try {
            //通过读取C3P0的xml配置文件创建数据源，C3P0的xml配置文件c3p0-config.xml必须放在src目录下
            //ds = new ComboPooledDataSource();//使用C3P0的默认配置来创建数据源
            ds = new ComboPooledDataSource("MySQL");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //从数据源中获取数据库连接
    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }
    //释放资源
    public static void release(Connection connection, Statement statement, ResultSet resultSet){
        if(resultSet!=null){
            try{
//关闭存储查询结果的ResultSet对象
                resultSet.close();
            }catch (Exception e) {
                e.printStackTrace();
            }
            resultSet = null;
        }
        if(statement!=null){
            try{
//关闭负责执行SQL命令的Statement对象
                statement.close();
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
        if(connection!=null){
            try{
//将Connection连接对象还给数据库连接池
                connection.close();
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

