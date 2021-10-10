package utn.clase;

import java.io.*;

public class ManejoArchivos
{
    /**
     * Método estático para mostrar caracteres definidos por Sistema Operativo
     */
    public static void listarSeparadores()
    {
        String separadorDir = File.separator;
        Character separadorDirChar = File.separatorChar;
        String separadorRuta = File.pathSeparator;
        Character separadorRutaChar = File.pathSeparatorChar;

        System.out.println("separador de directorios = " + separadorDir);
        System.out.println("separador de directorio en char = " + separadorDirChar);
        System.out.println("separador de ruta = " + separadorRuta);
        System.out.println("separador de ruta en char = " + separadorRutaChar);
    }

    /**
     * Método para copiar archivos binarios utilizando buffers
     * @throws IOException
     */
    public static void leerBinario(String destino, String origen) throws IOException
    {
        File fileOutput = new File(origen);
        File fileCopy = new File(destino);

        try(BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(fileOutput));
            BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(fileCopy)))
        {
            int cantidad = 0;
            int size = 1000;
            byte[] buffer = new byte[size];

            while((cantidad = inputStream.read(buffer,0,size)) != -1)
            {
                outputStream.write(buffer,0,cantidad);
            }
            outputStream.flush();
            //outputStream.close();
            //inputStream.close();
        }
        catch (IOException exception)
        {
            exception.printStackTrace();
        }
    }

    /**
     * Método para leer un archivo
     * Se recibe nombre por parámetro y se lee utilizando buffer imprimiendo en pantalla
     * @param archivo Nombre de archivo a leer
     * @throws IOException
     */
    public static void leer(File archivo) throws IOException
    {
        FileReader fileReader = new FileReader(archivo);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String texto = "";
        while((texto = bufferedReader.readLine()) != null)
        {
            //TODO Retornar String concatenado en vez de imprimir en método (SOLID)
            System.out.println(texto);
        }
        fileReader.close();
    }

    public static void escribir(File archivo, String texto) throws IOException
    {
        FileWriter fileWriter = new FileWriter(archivo, true);

        // Mecanismo que evita la constante escritura en disco
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(texto);
        bufferedWriter.newLine();
        bufferedWriter.flush();
        bufferedWriter.close();
    }

    /**
     * Método para copiar un archivo
     * @param origen Archivo de origen
     * @param destino Archivo nuevo de destino
     * @return Retorna el nuevo archivo copiado como File
     * @throws IOException
     */
    public static File copiar(String destino, String origen) throws IOException
    {
        // Archivo de origen
        FileReader fileReader = new FileReader(origen);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        // Archivo de destino
        File nuevoArchivo = new File(destino);
        FileWriter fileWriter = new FileWriter(nuevoArchivo);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        String texto = "";
        while((texto = bufferedReader.readLine()) != null)
        {
            bufferedWriter.write(texto);
            bufferedWriter.newLine();
        }
        bufferedReader.close();
        bufferedWriter.close();
        return nuevoArchivo;
    }

    /**
     * Método para borrar contenido de un archivo
     * @param archivo Archivo para borrar contenido
     * @throws IOException
     */
    public static void borrarTodo(File archivo) throws IOException
    {
        FileWriter fileWriter = new FileWriter(archivo,false);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("");
    }

    /**
     * Método para crear nuevo archivo
     * @param nombreArchivo Nombre del nuevo archivo
     * @return Retorna el nuevo archivo como File
     */
    public static File crearArchivo(String nombreArchivo)
    {
        File archivo = new File(nombreArchivo);

        if(!archivo.exists())
        {
            try
            {
                archivo.createNewFile();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
        return archivo;
    }

    /**
     * Crea un directorio si no existe, si existe crea archivo File y lo retorna
     * @param nombreDirectorio para crear
     * @return directorio como File
     */
    public static File crearDirectorio(String nombreDirectorio)
    {
        File directorio = new File(nombreDirectorio);

        if(!directorio.exists())
        {
            directorio.mkdir();
            // Crea ruta completa
            //directorio.mkdirs();
        }
        return directorio;
    }

    /**
     * Método para listar nombres de los archivos en un directorio
     * @param directorio para listar nombres de archivos
     * @return Array de strings con archivos o array inicializado vacio
     */
    public static String[] listarNombresArchivos(File directorio )
    {
        String[] strings = new String[1];

        if(directorio != null)
        {
            return directorio.list();
        }
        return strings;
    }

    /**
     * Método para listar archivos en un directorio
     * @param directorio para listar archivos
     * @return Array de File con archivos del directorio o array de File inicializado
     */
    public static File[] listarArchivos(File directorio)
    {
        if(directorio != null)
        {
            return directorio.listFiles();
        }
        return new File[1];
    }
}
