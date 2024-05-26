package com.iamriven;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {
    public static void InsertInfo(Connection conn, String nombre, String modulo, double nota) throws SQLException {
        try {
            String sql = "INSERT INTO alumnos (username, module, mark) values (?, ?, ?);";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, nombre);
            ps.setString(2, modulo);
            ps.setDouble(3, nota);
            int numRows = ps.executeUpdate();
            System.out.println("Se han insertado " + numRows + " fila.");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

}
