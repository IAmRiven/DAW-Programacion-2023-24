package com.iamriven;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class update {
    public static void actualizarNotas(Connection conn, String nombre, String modulo, double nota) throws SQLException {
        String sql = "UPDATE alumnos SET mark = ? WHERE username = ? AND module = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setDouble(1, nota);
        ps.setString(2, nombre);
        ps.setString(3, modulo);
        int numRows = ps.executeUpdate();
        System.out.println("Se han insertado " + numRows + " fila.");
    }
}
