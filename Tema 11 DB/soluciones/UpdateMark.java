package com.daw.iesgoya;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateMark {

    public static void UpdateMarkStudent(String username, String module, Double mark) {
        Connection connection = null;

        try {
            connection = SQLiteHelper.getConnection("jdbc:sqlite:connect/src/main/resources/mydb2.db");
            String sql = "UPDATE marks SET mark=? WHERE (username=? AND module=?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, Double.toString(mark));
            ps.setString(2, username);
            ps.setString(3, module);
            int numRows = ps.executeUpdate();
            System.out.println(numRows + " row(s) updated.");
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
