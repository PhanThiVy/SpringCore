package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    private  static  String driver ="com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static String url = "jdbc:sqlserver://localhost:1433; database = MINIMART;encrypt=true;trustServerCertificate=true;";
    private static String userName= "sa";
    private static String passWord = "123456";
    //method use to connect database
    public static Connection getConnection() throws SQLException {
        Connection con=null;
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, userName, passWord);
            System.out.println("Successful!");
        } catch (ClassNotFoundException e) {
            System.out.println("connection failed!");
        }
        return con;
    }
    public static void main(String[] args) {

        try (Connection con = getConnection()) {
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}