package Tema8;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class PilotosCRUD {

    private static final String DB_URL = "jdbc:postgresql://ad-postgres.ctolu9imuhd9.us-east-1.rds.amazonaws.com:5432/";
    private static final String DB_USER = "postgres";
    private static final String DB_PASSWORD = "Febrero2022";

    public static void createPilot(Piloto piloto) {

        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            System.out.println("Conexión exitosa.");

            Statement stmt = connection.createStatement();

            String sql = "INSERT INTO drivers (code, forename, surname, dob, nationality, constructorid, url) VALUES '" + piloto.getCode() + "', '" + piloto.getForename() + "', '" + piloto.getSurname() + "', '" + piloto.getDob() + "', '" + piloto.getNationality() + "', '" + piloto.getUrl() + "';";
            stmt.executeQuery(sql);

            stmt.close();
        } catch (SQLException e) {
            System.err.println("Error al conectar o consultar: " + e.getMessage());
        }
    }

    public static Piloto readPiloto(int id) {

        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            System.out.println("Conexión exitosa.");

            Statement stmt = connection.createStatement();

            String sql = "SELECT code, forename, surname, dob, nationality, url FROM drivers WHERE driverid = " + id + ";";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                String code = rs.getString("code");
                String forename = rs.getString("forename");
                String surname = rs.getString("surname");
                String dob = rs.getString("dob");
                String nationality = rs.getString("nationality");
                String url = rs.getString("url");
                return new Piloto(id, code, forename, surname, dob, nationality, url);
            }

            rs.close();
            stmt.close();
        } catch (SQLException e) {
            System.err.println("Error al conectar o consultar: " + e.getMessage());
        }

        return new Piloto(1, " ", " ", " ", " ", " ", " ");
    }

    public static List<Piloto> readPilots() {

        List<Piloto> piloto =  new ArrayList<>();

        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            System.out.println("Conexión exitosa.");

            Statement stmt = connection.createStatement();

            String sql = "SELECT driverid, code, forename, surname, dob, nationality, url FROM drivers;";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                int id = rs.getInt("driverid");
                String code = rs.getString("code");
                String forename = rs.getString("forename");
                String surname = rs.getString("surname");
                String dob = rs.getString("dob");
                String nationality = rs.getString("nationality");
                String url = rs.getString("url");
                piloto.add(new Piloto(id, code, forename, surname, dob, nationality, url));
                return piloto;
            }

            rs.close();
            stmt.close();
        } catch (SQLException e) {
            System.err.println("Error al conectar o consultar: " + e.getMessage());
        }
        return piloto;
    }

    public static void updatePilot(Piloto piloto) {

        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            System.out.println("Conexión exitosa.");

            Statement stmt = connection.createStatement();

            String sql = "UPDATE drivers SET code = '" + piloto.getCode() + "' forename = '" + piloto.getForename() + "' surname = '" + piloto.getSurname() + "' dob = '" + piloto.getDob() + "' nationality = '" + piloto.getNationality() + "' url = '" + piloto.getUrl() + "' WHERE driverid = " + piloto.getDriverid() + ";";
            stmt.executeQuery(sql);

            stmt.close();
        } catch (SQLException e) {
            System.err.println("Error al conectar o consultar: " + e.getMessage());
        }
    }

    public static void deletePilot(Piloto piloto) {

        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            System.out.println("Conexión exitosa.");

            Statement stmt = connection.createStatement();

            String sql = "DELETE FROM drivers WHERE driverid = " + piloto.getDriverid() + ";";
            stmt.executeQuery(sql);

            stmt.close();
        } catch (SQLException e) {
            System.err.println("Error al conectar o consultar: " + e.getMessage());
        }
    }


    public static void showPilotClassification() {

        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            System.out.println("Conexión exitosa.");

            Statement stmt = connection.createStatement();

            String sql = "SELECT * FROM results ORDER BY points DESC;";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                int id = rs.getInt("resultid");
                int raceid = rs.getInt("raceid");
                int driverid = rs.getInt("driverid");
                int grid = rs.getInt("grid");
                int position = rs.getInt("position");
                int points = rs.getInt("points");
                System.out.println("- " + id + " " + " " + raceid + " " + driverid + " " + grid + " " + " " + position + " " + points + ";");
            }

            rs.close();
            stmt.close();
        } catch (SQLException e) {
            System.err.println("Error al conectar o consultar: " + e.getMessage());
        }
    }

    public static void showBuildersClassification() {


        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            System.out.println("Conexión exitosa.");

            Statement stmt = connection.createStatement();

            String sql = "SELECT name , SUM(points) AS total FROM results AS r JOIN drivers AS d ON r.driverid = d.driverid JOIN constructors AS c ON d.constructorid = c.constructorid GROUP BY name ORDER BY total DESC;";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                String name = rs.getString("name");
                int total = rs.getInt("total");
                System.out.println("- " + name + " " + total + ";");
            }

            rs.close();
            stmt.close();
        } catch (SQLException e) {
            System.err.println("Error al conectar o consultar: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List<Piloto> piloto = new ArrayList<>();
        int opcion = 1;
        while (opcion != 0) {
            System.out.println("Introduce un numero dependiendo de las siguientes opciones");
            System.out.println("1. CreatePilot");
            System.out.println("2. ReadPilot");
            System.out.println("3. ReadPilots");
            System.out.println("4. UpdatePilot");
            System.out.println("5. DeletePilot");
            System.out.println("6. ShowPilotClassification");
            System.out.println("7. ShowBuildersClassification");
            System.out.println("0. Salir");
            opcion = in.nextInt();

            switch (opcion) {

                case 0:

                    break;

                case 1:



                    break;

                case 2:

                    break;

                case 3:

                    break;

                case 4:

                    break;

                case 5:

                    break;

                case 6:

                    break;

                case 7:

                    break;

                default:

                    System.out.println("Introduce un numero valido");
            }
        }
    }
}
