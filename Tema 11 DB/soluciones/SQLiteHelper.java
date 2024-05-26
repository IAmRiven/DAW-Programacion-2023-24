package com.daw.iesgoya;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLiteHelper {
    // static Connection conn;
    static String driver = "org.sqlite.JDBC";
    // String url;
    // String url = "jdbc:sqlite:connect/src/main/resources/mydb2.db";

    // conn = null;
    // public SQLiteHelper( String driver, String url) {
    // this.driver = driver;
    // this.url = url;
    // }

    static Connection getConnection(String url) {

        Connection conn = null;
        try {
            // Connection conn;
            Class.forName(driver);
            conn = DriverManager.getConnection(url);
            // System.out.println("Connection established");
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
        return conn;
    }

}
