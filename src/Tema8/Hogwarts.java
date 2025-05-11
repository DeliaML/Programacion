package Tema8;

import java.sql.*;
import java.util.Scanner;

public class Hogwarts {

    private static final String DB_URL = "jdbc:postgresql://ad-postgres.ctolu9imuhd9.us-east-1.rds.amazonaws.com:5432/hogwarts";
    private static final String DB_USER = "postgres";
    private static final String DB_PASSWORD = "Febrero2022";

    public static void estudianteCasa(String casa) {

        switch (casa) {

            case "Gryffindor":

                try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
                    System.out.println("Conexión exitosa.");

                    Statement stmt = connection.createStatement();

                    String sql = "SELECT e.nombre AS name, apellido FROM Estudiante AS e JOIN Casa AS c ON e.id_casa = c.id_casa Where c.nombre = 'Gryffindor';";
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

                break;

            case "Hufflepuff":

                try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
                    System.out.println("Conexión exitosa.");

                    Statement stmt = connection.createStatement();

                    String sql = "SELECT e.nombre AS name, apellido FROM Estudiante AS e JOIN Casa AS c ON e.id_casa = c.id_casa Where c.nombre = 'Hufflepuff';";
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

                break;

            case "Ravenclaw":

                try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
                    System.out.println("Conexión exitosa.");

                    Statement stmt = connection.createStatement();

                    String sql = "SELECT e.nombre AS name, apellido FROM Estudiante AS e JOIN Casa AS c ON e.id_casa = c.id_casa Where c.nombre = 'Ravenclaw';";
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

                break;

            case "Slytherin":

                try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
                    System.out.println("Conexión exitosa.");

                    Statement stmt = connection.createStatement();

                    String sql = "SELECT e.nombre AS name, apellido FROM Estudiante AS e JOIN Casa AS c ON e.id_casa = c.id_casa Where c.nombre = 'Slytherin';";
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

                break;

            default:

                System.out.println("La casa Introducida no existe");
        }
    }

    public static void numeroEstudianteCasa() {

        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            System.out.println("Conexión exitosa.");

            Statement stmt = connection.createStatement();

            String sql = "SELECT COUNT(e.nombre) AS total FROM Estudiante AS e JOIN Casa AS c ON e.id_casa = c.id_casa GROUP BY c.id_casa;";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                int total = rs.getInt("total");
                System.out.println("- " + total);
            }

            rs.close();
            stmt.close();
        } catch (SQLException e) {
            System.err.println("Error al conectar o consultar: " + e.getMessage());
        }
    }

    public static void estudianteMascota(String estudiante) {

        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            System.out.println("Conexión exitosa.");

            Statement stmt = connection.createStatement();

            String sql = "SELECT m.nombre AS name, especie FROM Mascota AS m JOIN Estudiante AS e ON m.id_estudiante = e.id_estudiante WHERE e.nombre = '" + estudiante + "';";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                String nombre = rs.getString("name");
                String especie = rs.getString("especie");
                if (nombre == null) {
                    System.out.println("El estudiante " + estudiante + " no tiene mascota");
                } else {
                    System.out.println("- " + nombre + " " + especie);
                }
            }

            rs.close();
            stmt.close();
        } catch (SQLException e) {
            System.err.println("Error al conectar o consultar: " + e.getMessage());
        }
    }

    public static void addAsignatura() {
        Scanner in = new Scanner(System.in);

        int opcion = 2;
        boolean obligatoria;
        System.out.println("Introduce el nombre de la asignatura");
        String asignatura = in.nextLine();
        System.out.println("Introduce el aula de la asignatura");
        String aula = in.nextLine();
        while (opcion < 0 || opcion > 1) {
            System.out.println("Introduce 0 si es obligatoria y 1 si no lo es");
            opcion = in.nextInt();
        } if (opcion == 0) {
            obligatoria = true;
        } else obligatoria = false;

        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            System.out.println("Conexión exitosa.");

            Statement stmt = connection.createStatement();

            String sql = "INSERT INTO Asignatura (nombre, aula, obligatoria) VALUES ('" + asignatura + "', '" + aula + "', " + obligatoria + ");";
            stmt.executeQuery(sql);

            stmt.close();
        } catch (SQLException e) {
            System.err.println("Error al conectar o consultar: " + e.getMessage());
        }
    }

    public static void testAsignatura() {

        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            System.out.println("Conexión exitosa.");

            Statement stmt = connection.createStatement();

            String sql = "SELECT * FROM Asignatura;";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                int id = rs.getInt("id_asignatura");
                String nombre = rs.getString("nombre");
                String aula = rs.getString("aula");
                boolean obligatoria = rs.getBoolean("obligatoria");
                System.out.println("- " + id + " " + nombre + " " + aula + " " + obligatoria);
            }

            rs.close();
            stmt.close();
        } catch (SQLException e) {
            System.err.println("Error al conectar o consultar: " + e.getMessage());
        }
    }


    public static void updateAula(int asignatura, String aula) {

        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            System.out.println("Conexión exitosa.");

            Statement stmt = connection.createStatement();

            String sql = "UPDATE Asignatura SET aula = '" + aula + "' WHERE id_asignatura = " + asignatura + ";";
            stmt.executeQuery(sql);

            stmt.close();
        } catch (SQLException e) {
            System.err.println("Error al conectar o consultar: " + e.getMessage());
        }
    }

    public static void deleteAsignatura(String asignatura) {

        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            System.out.println("Conexión exitosa.");

            Statement stmt = connection.createStatement();

            String sql = "DELETE FROM Asignatura WHERE nombre = '" + asignatura + "';";
            stmt.executeQuery(sql);

            stmt.close();
        } catch (SQLException e) {
            System.err.println("Error al conectar o consultar: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int opcion = 1;
        while (opcion != 0) {
            System.out.println("Introduce un número según las siguientes opciones");
            System.out.println("1. Consulta de estudiantes por casa");
            System.out.println("2. Obtener la mascota de un estudiante específico");
            System.out.println("3. Número de estudiantes por casa");
            System.out.println("4. Insertar una nueva asignatura");
            System.out.println("5. Modificar el aula de una asignatura");
            System.out.println("6. Eliminar una asignatura");
            System.out.println("0. Salir");
            opcion = in.nextInt();
            String trash = in.nextLine();

            switch (opcion) {

                case 0:

                    testAsignatura();

                    break;

                case 1:

                    System.out.println("Introduce la casa que quieras");
                    String casa = in.nextLine();
                    estudianteCasa(casa);

                    break;

                case 2:

                    System.out.println("Introduce el estudiante que quieras");
                    String estudiante = in.nextLine();
                    estudianteMascota(estudiante);

                    break;

                case 3:

                    numeroEstudianteCasa();

                    break;

                case 4:

                    addAsignatura();

                    break;

                case 5:

                    System.out.println("Introduce el aula de la asignatura");
                    String aula = in.nextLine();
                    System.out.println("Introduce la id de la asignatura a modificar");
                    int id = in.nextInt();
                    updateAula(id, aula);

                    break;

                case 6:

                    System.out.println("Introduce el nombre de la asignatura a eliminar");
                    String nombre = in.nextLine();
                    deleteAsignatura(nombre);

                    break;

                default:

                    System.out.println("No has introducido una opción valida");
            }
        }
    }
}

