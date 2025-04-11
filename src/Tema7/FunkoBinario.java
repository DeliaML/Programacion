package Tema7;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class FunkoBinario implements Serializable {

    private FileOutputStream file;
    private ObjectOutputStream output;

    private FileInputStream archivo;
    private ObjectInputStream input;

    public void abrir2() throws IOException {

        archivo = new FileInputStream("Documentos/funkos.dat");
        input = new ObjectInputStream(archivo);
    }

    public void cerrar2() throws IOException {
        if (input != null)
            input.close();
    }

    public Funko leer() throws IOException, ClassNotFoundException {
        Funko funko = null;
        if (input != null) {
            try {
                funko = (Funko) input.readObject();
            } catch (EOFException eof) {
            }
        }
        return funko;
    }

    public void abrir() throws IOException {

        file = new FileOutputStream("Documentos/funkos.dat");
        output = new ObjectOutputStream(file);
    }

    public void cerrar() throws IOException {
        if (output != null)
            output.close();
    }


    public void escribir(Funko funko, List<Funko> lista) throws IOException {
        try {
            for (int i = 0; i < lista.size(); i++) {
                if (lista.get(i) == null) {
                    lista.remove(i);
                    i--;
                }
            }
        } catch (Exception e) {

        }
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
        System.out.println("Introduce la fecha de lanzamiento del funko con el formato YY-MM-DD");
        String fecha = in.nextLine();
        System.out.println("Introduce el precio del funko");
        double precio = in.nextDouble();
        String codigo = "qoqwoe" + nombre + "qwerhp" + "kQWR" + fecha +"qqqq" + modelo;

        return new Funko(codigo, nombre, modelo, precio, fecha);
    }

    public static void showLista(List<Funko> lista) {

        try {
            for (Funko funko : lista) {
                System.out.println(funko.toString());
            }
        } catch (Exception e) {

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
            System.out.println(lista.get(funko).toString());
        }
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
        String anyo = in.nextLine();
        for (int i = 0; i < lista.size(); i++) {
            if (Objects.equals(anyo, Arrays.toString(lista.get(i).getFecha().split("-")))) System.out.println(lista.get(i).toString());
        }
    }

    public static List<Funko> deleteFunko(List<Funko> lista) throws IOException {
        Scanner in = new Scanner(System.in);

        try {
            for (int i = 0; i < lista.size(); i++) {
                if (lista.get(i) == null) {
                    lista.remove(i);
                    i--;
                }
            }
        } catch (Exception e) {

        }
        System.out.println("Introduce el nombre del funko a borrar");
        String nombre = in.nextLine();
        try {
            for (int i = 0; i < lista.size(); i++) {
                if (Objects.equals(nombre, lista.get(i).getNombre())) {
                    lista.remove(i);
                    i --;
                }
            }
        } catch (Exception e) {

        }
        FunkoBinario salida = new FunkoBinario();
        try {
            salida.abrir2();
            salida.leer();
            salida.cerrar2();
        }catch (Exception e){

        }
        return lista;
    }

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        try {
            Files.createFile(Path.of("Documentos/funkos.dat"));
        } catch (Exception e) {

        }
        List<Funko> lista = new ArrayList<>();
        List<List<String>> funkos;
        double precio = 0;
        String nombre;
        String modelo;
        String fecha;
        String codigo;
        boolean con = false;
        Funko funko = null;
        FunkoBinario entrada;

        entrada = new FunkoBinario();
        try {
            entrada.abrir2();
        } catch (Exception e) {

        }
        try {

            do{
                funko = entrada.leer();
                lista.add(funko);
            }while (funko!=null);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        try {
            entrada.cerrar2();
        } catch (Exception e) {

        }
        try {
            for (int i = 0; i < lista.size(); i++) {
                if (lista.get(i) == null) {
                    lista.remove(i);
                    i--;
                }
            }
        } catch (Exception e) {

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
                    try {
                        for (int i = 0; i < lista.size(); i++) {
                            if (lista.get(i) == null) {
                                lista.remove(i);
                                i--;
                            }
                        }
                    } catch (Exception e) {

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
        try {
            for (int i = 0; i < lista.size(); i++) {
                if (lista.get(i) == null) {
                    lista.remove(i);
                    i--;
                }
            }
        } catch (Exception e) {

        }
        FunkoBinario salida = new FunkoBinario();
        salida.abrir();
        for (int i = 0; i < lista.size(); i ++) {
            try {

                salida.escribir(lista.get(i), lista);

            } catch (Exception e) {

            }
        }salida.cerrar();
    }
}
