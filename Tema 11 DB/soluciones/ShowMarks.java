package com.daw.iesgoya;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ShowMarks {

    public static void ShowMarksStudent(String username) {
        Connection connection = null;
        try {
            connection = SQLiteHelper.getConnection("jdbc:sqlite:connect/src/main/resources/mydb2.db");
            String sql = "select username,module, mark from marks where username='" + username + "' order by username";
            System.out.println(sql);
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            System.out.println("**************************************");
            System.out.println("Estudiantes:Notas:");
            while (rs.next()) {
                System.out.print(rs.getString("username"));
                System.out.print(", ");
                System.out.print(rs.getString("module"));
                System.out.print(": ");
                System.out.println(rs.getString("mark"));
            }
            rs.close();
            System.out.println("");
        } catch (Exception e) {
            e.printStackTrace();
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

    public static void showStudents() {
        Connection connection = null;
        try {

            connection = SQLiteHelper.getConnection("jdbc:sqlite:connect/src/main/resources/mydb2.db");

            String sql = "select distinct username from marks order by username";

            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            System.out.println("**************************************");
            System.out.println("");
            System.out.println("Estudiantes:");
            while (rs.next()) {
                System.out.println(rs.getString("username"));
            }
            rs.close();
            System.out.println("");

        } catch (SQLException e) {
            System.err.println("Error al conectar a la base de datos:");
            e.printStackTrace();
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
