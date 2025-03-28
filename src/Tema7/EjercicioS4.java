package Tema7;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class EjercicioS4 {

    private FileOutputStream file;
    private ObjectOutputStream output;

    public void abrir() throws IOException {

        file = new FileOutputStream("Documentos/persona.dat");
        output = new ObjectOutputStream(file);
    }

    public void cerrar() throws IOException {
        if (output != null)
            output.close();
    }


    public void escribir(Persona persona) throws IOException {
        if (output != null) {
            output.writeObject(persona);
            System.out.println("persona " + persona.getNombre() + " escrita correctamente");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Introduce el nombre de la persona");
        String nombre = in.nextLine();
        System.out.println("Introduce su edad");
        int edad = in.nextInt();
        Persona persona = new Persona(nombre, edad);
        EjercicioS4 salida = new EjercicioS4();
        try {
            salida.abrir();
            salida.escribir(persona);
            salida.cerrar();
        }catch (Exception e){

        }
    }
}
