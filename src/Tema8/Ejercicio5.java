package Tema8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ejercicio5 {

    private static final String DB_URL = "jdbc:postgresql://ad-postgres.ctolu9imuhd9.us-east-1.rds.amazonaws.com:5432/hogwarts";
    private static final String DB_USER = "postgres";
    private static final String DB_PASSWORD = "Febrero2022";

    public static void main(String[] args) {
        System.out.println("Conectando a la base de datos...");

        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            System.out.println("Conexión exitosa.");

            Statement stmt = connection.createStatement();

            String sql = "SELECT AVG(e.calificacion) AS media, MAX(e.calificacion) AS maxima FROM Estudiante_Asignatura AS e JOIN Asignatura AS a ON e.id_asignatura = a.id_asignatura WHERE nombre = 'Pociones';";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                double media = rs.getDouble("media");
                int maxima = rs.getInt("maxima");
                System.out.println("- " + media + " " + maxima);
            }

            rs.close();
            stmt.close();
        } catch (SQLException e) {
            System.err.println("Error al conectar o consultar: " + e.getMessage());
        }
    }
}
