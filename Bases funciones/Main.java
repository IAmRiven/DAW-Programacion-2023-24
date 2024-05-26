package com.iamriven;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        Scanner teclado = new Scanner(System.in);
        boolean salir = false;
        String setColorCode = "\u001B[32m";
        String resetColorCode = "\u001B[0m";
        Connection conn = SQLiteHelper.getConnection();
        if (conn != null) {
            try {
                System.out.println(setColorCode + "(!) Conexión realizada con éxito." + resetColorCode);

                do {
                    menu();
                    System.out.print("¿Qué quieres hacer?: ");
                    int opcion = teclado.nextInt();
                    if (opcion == 1) {
                        System.out.print("Nombre del alumno: ");
                        String nombre = teclado.next();
                        System.out.print("Modulo del alumno: ");
                        String modulo = teclado.next();
                        System.out.print("Nota del alumno: ");
                        double nota = teclado.nextDouble();
                        Insert.InsertInfo(conn, nombre, modulo, nota);
                    } else if (opcion == 2) {
                        select.ShowNotas(conn);
                    } else if (opcion == 3) {
                        System.out.print("Nombre del alumno: ");
                        String nombre = teclado.next();
                        System.out.print("Modulo del alumno: ");
                        String modulo = teclado.next();
                        System.out.print("Nota del alumno: ");
                        double nota = teclado.nextDouble();
                        update.actualizarNotas(conn, nombre, modulo, nota);
                    } else if (opcion == 5) {
                        System.out.println("Cerrando el programa..");
                        salir = true;
                    } else {
                        System.out.println("Opción no disponible.");
                    }

                } while (salir != true);

                Table.CreateTableNotas(conn);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    if (conn != null) {
                        conn.close();
                        System.out.println(setColorCode + "(!) Se ha cerrado la conexión." + resetColorCode);
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            teclado.close();
        }

    }

    public static void menu() {
        System.out.println("*****************************");
        System.out.println("1. Insertar calificación.");
        System.out.println("2. Mostrar información de alumnos.");
        System.out.println("3. Actualizar información de alumno.");
        System.out.println("5. Salir.");
        System.out.println("*****************************");
    }
}