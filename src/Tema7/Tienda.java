package Tema7;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class Tienda {

    private FileOutputStream file;
    private ObjectOutputStream output;

    public void abrir() throws IOException {

        file = new FileOutputStream("Documentos/funkos.csv");
        output = new ObjectOutputStream(file);
    }

    public void cerrar() throws IOException {
        if (output != null)
            output.close();
    }


    public void escribir(Funko funko) throws IOException {
        if (output != null) {
            output.writeObject(funko);
        }
    }

    public static Funko addFunko() {
        Scanner in = new Scanner(System.in);

        System.out.println("Introduce el nombre del funko");
        String nombre = in.nextLine();
        System.out.println("Introduce el modelo");
        String modelo = in.nextLine();
        System.out.println("Introduce la fecha de lanzamiento del funko utilizando el formato YY-MM-DD");
        String fecha = in.nextLine();
        System.out.println("Introduce el precio del funko");
        double precio = in.nextDouble();
        String codigo = "qoqwoe" + nombre + "qwerhp" + "kQWR" + fecha +"qqqq" + modelo;

        return new Funko(codigo, nombre, modelo, precio, fecha);
    }

    public static void showLista(List<Funko> lista) {

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).toString());
        }
    }

    public static void showMedia(List<Funko> lista) {

        double media = 0;
        for (int i = 0; i < lista.size(); i++) {
            media = media + lista.get(i).getPrecio();
        }
        System.out.println(media / lista.size());
    }

    public static void showMaxPrice(List<Funko> lista) {

        double max = 0;
        int funko = 0;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getPrecio() > max) {
                max = lista.get(i).getPrecio();
                funko = i;
            }
        }
        System.out.println(lista.get(funko).toString());
    }

    public static void showModelo(List<Funko> lista) {
        Scanner in = new Scanner(System.in);

        System.out.println("Introduce el nombre del modelo a buscar");
        String modelo = in.nextLine();
        for (int i = 0; i < lista.size(); i++) {
            if (Objects.equals(modelo, lista.get(i).getModelo())) System.out.println(lista.get(i).toString());
        }
    }

    public static void showFecha(List<Funko> lista) {
        Scanner in = new Scanner(System.in);

        System.out.println("Introduce el año a buscar");
        String fecha = in.nextLine();
        for (Funko funko : lista) {
            if (funko.getFecha().substring(0, 4).equals(fecha)) {
                System.out.println(funko); }
        }
    }

    public static List<Funko> deleteFunko(List<Funko> lista) throws IOException {
        Scanner in = new Scanner(System.in);

        System.out.println("Introduce el nombre del funko a borrar");
        String nombre = in.nextLine();
        for (int i = 0; i < lista.size(); i++) {
            if (Objects.equals(nombre, lista.get(i).getNombre())) {
                lista.remove(i);
                i --;
            }
        }
        Files.write(Paths.get("Documentos/funkos.csv"), ("COD,NOMBRE,MODELO,PRECIO,FECHA_LANZAMIENTO\n".getBytes()));
        for (int i = 0; i < lista.size(); i++) {
            Files.write(Paths.get("Documentos/funkos.csv"), (lista.get(i).lineCSV2().getBytes(StandardCharsets.UTF_8)), StandardOpenOption.APPEND);
        }
        return lista;
    }

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        List<Funko> lista = new ArrayList<>();
        List<List<String>> funkos = Files.lines(Paths.get("Documentos/funkos.csv")).map(linea -> Arrays.asList(linea.split(","))).toList();
        double precio = 0;
        String nombre;
        String modelo;
        String fecha;
        String codigo;
        boolean con = false;
        for (List<String> line: funkos) {
            codigo = line.get(0);
            nombre = line.get(1);
            modelo = line.get(2);
            if (con) precio = Double.parseDouble(line.get(3));
            fecha = line.get(4);
            if (con) lista.add(new Funko(codigo, nombre, modelo, precio, fecha));
            con = true;
        }
        int res = 1;
        while (res != 8) {
            System.out.println("Introduce la opción que quieras");
            System.out.println("1: Añadir funko");
            System.out.println("2: Borrar funko");
            System.out.println("3: Mostrar todos los funkos");
            System.out.println("4: Mostrar el funko más caro");
            System.out.println("5: Mostrar la media del precio de todos los funkos");
            System.out.println("6: Mostrar los funkos agrupados por modelos");
            System.out.println("7: Mostrar los funkos de un año");
            System.out.println("8: Salir");
            res = in.nextInt();

            switch (res) {

                case 1:

                    lista.add(addFunko());
                    Files.writeString(Path.of("Documentos/funkos.csv"), lista.getLast().lineCSV(), StandardOpenOption.APPEND);
                    try {
                        funkos = Files.lines(Paths.get("Documentos/funkos.csv")).map(linea -> Arrays.asList(linea.split(","))).toList();
                    } catch (Exception e){
                        System.out.println(e.getMessage());
                    }

                    break;

                case 2:

                    lista = deleteFunko(lista);

                    break;

                case 3:

                    showLista(lista);

                    break;

                case 4:

                    showMaxPrice(lista);

                    break;

                case 5:

                    showMedia(lista);

                    break;

                case 6:

                    showModelo(lista);

                    break;

                case 7:

                    showFecha(lista);

                    break;

                case 8:

                    break;

                default:

                    System.out.println("Introduce uno de los números del menu");

            }
        }
    }
}
