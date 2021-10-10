package utn.clase;

import java.io.*;
import java.math.BigDecimal;

public class Main {

    public static void main(String[] args)
    {
	    Empleado empleado = new Empleado();
        empleado.setNombre("Pepito");
        empleado.setSalario(BigDecimal.valueOf(250000.87));

        serialize(empleado, "empleado.bin");
        Empleado empleadoDeserializado = (Empleado) deserialize("empleado.bin");
        System.out.println("empleadoDeserializado = " + empleadoDeserializado);
    }

    private static void serialize(Serializable objeto, String nombreArchivo)
    {
        File file = new File(nombreArchivo);
        try(FileOutputStream outputStream = new FileOutputStream(file);
            ObjectOutputStream objectInputStream = new ObjectOutputStream(outputStream))
        {
            objectInputStream.writeObject(objeto);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    private static Object deserialize(String nombreArchivo)
    {
        Object objeto = null;
        File file = new File(nombreArchivo);

        try(FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream))
        {
            objeto = objectInputStream.readObject();
        }
        catch (FileNotFoundException exception)
        {
            exception.printStackTrace();
        }
        catch (IOException exception)
        {
            exception.printStackTrace();
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        return objeto;
    }
}
