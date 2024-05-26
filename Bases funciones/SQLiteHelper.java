package com.iamriven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLiteHelper {

    public static Connection getConnection() {
        String driver = "org.sqlite.JDBC";
        String url = "jdbc:sqlite:src\\main\\resources\\mydb.db";
        Connection conn = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url);
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
        return (conn);
    }
}
