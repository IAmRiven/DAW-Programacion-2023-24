package com.iamriven;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class select {
    public static void ShowNotas(Connection conn) throws SQLException {
        String sql = "select * from alumnos;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            System.out.println("Nombre: " + rs.getString("username"));
            System.out.println("Módulo: " + rs.getString("module"));
            System.out.println("Nota: " + rs.getDouble("mark"));
            System.out.println();
        }
        rs.close();
    }
}
