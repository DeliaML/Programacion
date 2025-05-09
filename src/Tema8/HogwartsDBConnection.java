package Tema8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class HogwartsDBConnection {
    private static final String URL = "jdbc:postgresql://ad-postgres.ctolu9imuhd9.us-east-1.rds.amazonaws.com:5432/hogwarts";
    private static final String USER = "postgres";
    private static final String PASSWORD = "Febrero2022";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            if (connection != null) {
                System.out.println("Conexión exitosa a la base de datos Hogwarts.");
            } else {
                System.out.println("Error al conectar a la base de datos.");
            }
        } catch (SQLException e) {
            System.err.println("Error de conexión: " + e.getMessage());
        }
    }
}

