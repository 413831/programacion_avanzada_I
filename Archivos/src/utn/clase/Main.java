package utn.clase;

import java.io.*;

public class Main {

    public static void main(String[] args)
    {
        //File archivo = new File("archivo.txt");


        /*if(!archivo.exists())
        {
            archivo.createNewFile();
        }*/
        try
        {
            leerBinario();
            //escribir(archivo);
            //leer(archivo);
        }
        catch (IOException exception)
        {
            System.out.println("exception.getMessage() = " + exception.getMessage());
        }
    }



    public static void leerBinario() throws IOException
    {
        File fileOutput = new File("imagen.jpeg");
        File fileCopy = new File("copia.jpeg");

        FileInputStream fileInputStream = new FileInputStream(fileOutput);
        BufferedInputStream inputStream = new BufferedInputStream(fileInputStream);

        FileOutputStream fileOutputStream = new FileOutputStream(fileCopy);
        BufferedOutputStream outputStream = new BufferedOutputStream(fileOutputStream);

        byte[] aux = new byte[1000];

        int cantidad = 0;
        while((cantidad = inputStream.read(aux,0,1000)) != -1)
        {
            outputStream.write(aux,0,cantidad);
        }
        outputStream.flush();
        outputStream.close();
        inputStream.close();
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
