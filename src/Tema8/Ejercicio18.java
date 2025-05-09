package Tema8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ejercicio18 {

    private static final String DB_URL = "jdbc:postgresql://ad-postgres.ctolu9imuhd9.us-east-1.rds.amazonaws.com:5432/hogwarts";
    private static final String DB_USER = "postgres";
    private static final String DB_PASSWORD = "Febrero2022";

    public static void main(String[] args) {
        System.out.println("Conectando a la base de datos...");

        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            System.out.println("Conexión exitosa.");

            Statement stmt = connection.createStatement();

            String sql = "SELECT c.nombre AS home FROM Casa AS c JOIN Estudiante AS e ON c.id_casa = e.id_casa JOIN Estudiante_Asignatura AS ea ON e.id_estudiante = ea.id_estudiante GROUP BY home HAVING AVG(ea.calificacion) > 7;";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                String casa = rs.getString("home");
                System.out.println("- " + casa);
            }

            rs.close();
            stmt.close();
        } catch (SQLException e) {
            System.err.println("Error al conectar o consultar: " + e.getMessage());
        }
    }
}

