package Tema8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ejercicio16 {

    private static final String DB_URL = "jdbc:postgresql://ad-postgres.ctolu9imuhd9.us-east-1.rds.amazonaws.com:5432/hogwarts";
    private static final String DB_USER = "postgres";
    private static final String DB_PASSWORD = "Febrero2022";

    public static void main(String[] args) {
        System.out.println("Conectando a la base de datos...");

        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            System.out.println("Conexión exitosa.");

            Statement stmt = connection.createStatement();

            String sql = "SELECT e.nombre AS name, m.nombre AS pet, a.nombre AS subject FROM Estudiante AS e LEFT JOIN Mascota AS m ON e.id_estudiante = m.id_estudiante JOIN Estudiante_Asignatura AS ea ON e.id_estudiante = ea.id_estudiante JOIN Asignatura AS a ON ea.id_asignatura = a.id_asignatura;";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                String nombre = rs.getString("name");
                String mascota = rs.getString("pet");
                String asignatura = rs.getString("subject");
                System.out.println("- " + nombre + " " + mascota + " " + asignatura);
            }

            rs.close();
            stmt.close();
        } catch (SQLException e) {
            System.err.println("Error al conectar o consultar: " + e.getMessage());
        }
    }
}

