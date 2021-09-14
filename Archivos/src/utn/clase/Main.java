package utn.clase;

import java.io.*;

public class Main {

    public static void main(String[] args)
    {
        File archivo = new File("archivo.txt");

        /*if(!archivo.exists())
        {
            archivo.createNewFile();
        }*/
        try
        {
            escribir(archivo);
            leer(archivo);
        }
        catch (IOException exception)
        {
            System.out.println("exception.getMessage() = " + exception.getMessage());
        }
    }

    public static void leer(File archivo) throws IOException
    {
        FileReader fileReader = new FileReader(archivo);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String texto = "";
        while((texto = bufferedReader.readLine()) != null)
        {
            System.out.println(texto);
        }
        fileReader.close();
    }

    public static void escribir(File archivo) throws IOException
    {
        FileWriter fileWriter = new FileWriter(archivo,true);

        // Mecanismo que evita la constante escritura en disco
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("Hola mundo!");
        bufferedWriter.newLine();
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
