package utn.clase;

import java.io.*;

public class Main {

    public static void main(String[] args)
    {
        // Separadores según Sistema Operativo
        ManejoArchivos.listarSeparadores();

        // Pruebas de métodos de manejo de archivos
        File archivo = new File("archivo.txt");

        try
        {
            // ManejoArchivos.crearArchivo("nuevo.txt");
            // ManejoArchivos.crearDirectorio("directorio");
            // ManejoArchivos.leerBinario("copia.pdf","archivo.pdf");
            // ManejoArchivos.escribir(archivo, "Erase una vez");
            ManejoArchivos.leer(archivo);
            // ManejoArchivos.copiar("nuevoArchivo.txt", "archivo.txt");
            // ManejoArchivos.borrarTodo(archivo);
        }
        catch (IOException exception)
        {
            System.out.println("exception.getMessage() = " + exception.getMessage());
        }
    }


}
