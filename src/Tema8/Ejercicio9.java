package Tema8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ejercicio9 {

    private static final String DB_URL = "jdbc:postgresql://ad-postgres.ctolu9imuhd9.us-east-1.rds.amazonaws.com:5432/hogwarts";
    private static final String DB_USER = "postgres";
    private static final String DB_PASSWORD = "Febrero2022";

    public static void main(String[] args) {
        System.out.println("Conectando a la base de datos...");

        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            System.out.println("Conexión exitosa.");

            Statement stmt = connection.createStatement();

            String sql = "SELECT e.nombre AS name, apellido FROM Estudiante AS e JOIN Casa AS c ON e.id_casa = c.id_casa WHERE e.anyo_curso = 5 AND (c.nombre = 'Gryffindor' OR c.nombre = 'Slytherin');";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                String nombre = rs.getString("name");
                String apellido = rs.getString("apellido");
                System.out.println("- " + nombre + " " + apellido);
            }

            rs.close();
            stmt.close();
        } catch (SQLException e) {
            System.err.println("Error al conectar o consultar: " + e.getMessage());
        }
    }
}
