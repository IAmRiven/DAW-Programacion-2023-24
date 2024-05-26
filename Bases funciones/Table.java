package com.iamriven;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Table {
    public static void CreateTableNotas(Connection conn) throws SQLException {
        String sql = "CREATE TABLE alumnos (" +
                " username TEXT NOT NULL," +
                " module TEXT NOT NULL," +
                " mark DOUBLE NOT NULL" +
                ");";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.executeUpdate();
    }

}
