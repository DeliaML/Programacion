package Tema7;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class EjercicioS5 {

    private FileInputStream archivo;
    private ObjectInputStream input;

    public void abrir() throws IOException {

        archivo = new FileInputStream("Documentos/persona.dat");
        input = new ObjectInputStream(archivo);
    }

    public void cerrar() throws IOException {
        if (input != null)
            input.close();
    }

    public Persona leer() throws IOException, ClassNotFoundException {
        Persona persona = null;
        if (input != null) {
            try {
                persona = (Persona) input.readObject();
                System.out.println("persona leida correctamente");

            } catch (EOFException eof) {
            }
        }
        return persona;
    }

    public static void main(String[] args) {
        Persona persona = null;
        EjercicioS5 entrada;

        entrada = new EjercicioS5();
        try {
            entrada.abrir();
            do{
                persona = entrada.leer();
                System.out.println(persona.getNombre());
                System.out.println(persona.getEdad());
            }while (persona!=null);
            entrada.cerrar();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
