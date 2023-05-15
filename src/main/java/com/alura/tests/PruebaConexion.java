package com.alura.tests;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PruebaConexion {
    public static void main(String[] args) throws SQLException {
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost/control_de_stock?useTimezone=true&serverTimeZone=UTC",
                "root",
                "root");
        System.out.println("Cerrando conexión");
        con.close();
    }
}
