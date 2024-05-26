package com.daw.iesgoya;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertMark {

    public static void insertMarkStudent(String nombre, String modulo, float nota) {
        Connection connection = null;

        try {
            connection = SQLiteHelper.getConnection("jdbc:sqlite:connect/src/main/resources/mydb2.db");
            String sql = "INSERT into marks values (?, ?, ?);";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, nombre);
            ps.setString(2, modulo);
            ps.setString(3, Double.toString(nota));
            // ps.setDouble(3, nota);
            int numRows = ps.executeUpdate();
            System.out.println(numRows + " row(s) inserted.");
        } catch (SQLException ex) {
            // ex.printStackTrace();
            System.err.println("Nota no introducida, datos incorrectos");
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

    }

}
