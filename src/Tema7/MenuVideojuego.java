package Tema7;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class MenuVideojuego {

    private FileOutputStream file;
    private ObjectOutputStream output;

    private FileInputStream archivo;
    private ObjectInputStream input;

    public void abrir2() throws IOException {

        archivo = new FileInputStream("Documentos/ranking.dat");
        input = new ObjectInputStream(archivo);
    }

    public void cerrar2() throws IOException {
        if (input != null)
            input.close();
    }

    public Videojuego leer() throws IOException, ClassNotFoundException {
        Videojuego juego = null;
        if (input != null) {
            try {
                juego = (Videojuego) input.readObject();
            } catch (EOFException eof) {
            }
        }
        return juego;
    }

    public void abrir() throws IOException {

        file = new FileOutputStream("Documentos/ranking.dat");
        output = new ObjectOutputStream(file);
    }

    public void cerrar() throws IOException {
        if (output != null)
            output.close();
    }


    public void escribir(Videojuego videogame, List<Videojuego> lista) throws IOException {
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
            output.writeObject(videogame);
        }
    }

    public static Videojuego addVideogame() throws NotaInvalidaException {
        Scanner in = new Scanner(System.in);
        int opcion = 2;
        int nota = 0;
        double tamañoGB = 0;

        System.out.println("Introduce el titulo del videojuego");
        String titulo = in.nextLine();
        System.out.println("Introduce la plataforma del videojuego");
        String plataforma = in.nextLine();
        System.out.println("Introduce la nota del videojuego");
        try {
            nota = in.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("No has introducido un entero");
        }
        if (nota < 0 || nota > 10) throw new NotaInvalidaException ("La nota es invalida");
        while (opcion < 0 || opcion > 1) {
            System.out.println("Introduce 0 si el videojuego es Físico o 1 si es Digital");
            try {
                opcion = in.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("No has introducido un entero");
            }
        }
        if (opcion == 0) {
            String estado = "a";
            String tiendaCompra = in.nextLine();
            System.out.println("Introduce el nombre de la tienda");
            tiendaCompra = in.nextLine();
            while (!Objects.equals(estado, "nuevo") && !Objects.equals(estado, "usado")) {
                System.out.println("Introduce si el videojuego es nuevo o usado");
                estado = in.nextLine();
            }
            return new VideojuegoFisico(tiendaCompra, estado, titulo, plataforma, nota);
        }
        String tiendaOnline = in.nextLine();
        System.out.println("Introduce el nombre de la tienda");
        tiendaOnline = in.nextLine();
        System.out.println("Introduce el tamaño en GB del videojuego");
        try {
            tamañoGB = in.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("No has introducido un número");
        }
        return new VideojuegoDigital(tiendaOnline, tamañoGB, titulo, plataforma, nota);
    }

    public static void showRanking(List<Videojuego> lista){

        for (int i = 10; i > 0; i--) {
            for (Videojuego videojuego : lista) {
                if (i == videojuego.getNota()) {
                    System.out.println(videojuego);
                }
            }
        }
    }

    public static void saveRanking(List<Videojuego> lista) throws IOException {

        List<Videojuego> nuevo = new ArrayList<>();
        for (int i = 10; i > 0; i--) {
            for (Videojuego videojuego : lista) {
                if (i == videojuego.getNota()) {
                    nuevo.add(videojuego);
                }
            }
        }

        try {
            for (int i = 0; i < nuevo.size(); i++) {
                if (nuevo.get(i) == null) {
                    nuevo.remove(i);
                    i--;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        MenuVideojuego salida = new MenuVideojuego();
        salida.abrir();
        for (int i = 0; i < nuevo.size(); i ++) {
            try {

                salida.escribir(nuevo.get(i), nuevo);

            } catch (Exception e) {

            }
        }salida.cerrar();

    }

    public static List<Videojuego> loadRanking() {
        List<Videojuego> lista = new ArrayList<>();
        List<Videojuego> nuevo = new ArrayList<>();

        Videojuego juego = null;
        MenuVideojuego entrada;

        entrada = new MenuVideojuego();
        try {
            entrada.abrir2();
        } catch (Exception e) {

        }
        try {

            do{
                juego = entrada.leer();
                lista.add(juego);
            }while (juego!=null);
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

        for (int i = 10; i > 0; i--) {
            for (Videojuego videojuego : lista) {
                if (i == videojuego.getNota()) {
                    nuevo.add(videojuego);
                }
            }
        }
        return nuevo;
    }

    public static List<Videojuego> deleteVideogame(List<Videojuego> lista) throws JuegoNoEncontradoException{
        Scanner in = new Scanner(System.in);

        boolean con = false;
        int opcion = 0;
        System.out.println("Introduce el nombre del Videojuego a eliminar");
        String titulo = in.nextLine();
        for (int i = 0; i < lista.size(); i++) {
            if (Objects.equals(titulo, lista.get(i).getTitulo())) con = true;
        }
        if (!con) throw new JuegoNoEncontradoException("El titulo introducido no existe");
        System.out.println("Introduce cualquier numero si quieres eliminar todos los Videojuegos con ese nombre o 1 si quieres eliminar solo el de una plataforma en específico");
        try {
            opcion = in.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("No has introducido un entero");
        }
        if (opcion == 1) {
            String plataforma = in.nextLine();
            System.out.println("Introduce la plataforma del Videojuego a eliminar");
            plataforma = in.nextLine();
            for (int i = 0; i < lista.size(); i ++) {
                if (Objects.equals(titulo, lista.get(i).getTitulo()) && Objects.equals(plataforma, lista.get(i).getPlataforma())) {
                    lista.remove(i);
                    i --;
                }
            }
        } else {
            for (int i = 0; i < lista.size(); i ++) {
                if (Objects.equals(titulo, lista.get(i).getTitulo())) {
                    lista.remove(i);
                    i --;
                }
            }
        }
        return lista;
    }

    public static void textExport(List<Videojuego> lista) throws IOException {

        for(int i = 0; i < lista.size(); i ++) {
            Files.write(Paths.get("Documentos/ranking.csv"), (lista.get(i).LineCSV().getBytes(StandardCharsets.UTF_8)), StandardOpenOption.APPEND);
        }
    }

    public static void main(String[] args) throws IOException, NotaInvalidaException, JuegoNoEncontradoException {
        Scanner in = new Scanner(System.in);

        List<Videojuego> lista = new ArrayList<>();
        int opcion = 1;
        while (opcion != 0) {
            System.out.println("--Ranking de Videojuegos--");
            System.out.println("1. Añadir videojuego");
            System.out.println("2. Mostrar ranking");
            System.out.println("3. Guardar ranking");
            System.out.println("4. Cargar ranking");
            System.out.println("5. Eliminar videojuego");
            System.out.println("6. Exportar a texto");
            System.out.println("0. Salir");
            System.out.println("Elige una opción:");
            try {
                opcion = in.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("No has introducido un entero");
            }
            switch (opcion) {

                case 1:

                    lista.add(addVideogame());

                    break;

                case 2:

                    showRanking(lista);

                    break;

                case 3:

                    saveRanking(lista);

                    break;

                case 4:

                    lista = loadRanking();
                    System.out.println(lista);

                    break;

                case 5:

                    lista = deleteVideogame(lista);

                    break;

                case 6:

                    textExport(lista);
            }
        }
    }
}
