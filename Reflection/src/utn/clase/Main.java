package utn.clase;


import java.lang.reflect.*;

public class Main
{
    /**
     * Crear objetos con Reflection
     * @param c Clase del objeto del que se requiere crear una instancia
     * @return
     */
    public static Object crearObjeto(Class c)
    {
        Constructor[] constructores = c.getConstructors();

        for (Constructor constructor: constructores)
        {
            // Busco el constructor por defecto
            if(constructor.getParameterCount() == 0)
            {
                try
                {
                    // Se instancia desde el constructor sin parametros
                    return constructor.newInstance(null);
                }
                catch (InstantiationException e)
                {
                    e.printStackTrace();
                }
                catch (IllegalAccessException e)
                {
                    e.printStackTrace();
                }
                catch (InvocationTargetException e)
                {
                    e.printStackTrace();
                }
            }
            else if(constructor.getParameterCount() == 2)
            {
                // Se obtienen los parametros de un constructor
                Class[] parametros = constructor.getParameterTypes();
                // Se crea instancia de un objeto que contendrá los parámetros para instanciar
                Object[] o = new Object[parametros.length];
                System.out.println(parametros);

                // Se recorren los parametros para cargar los valores
                for ( int i = 0; i < parametros.length; i++ )
                {
                    // Se puede utilizar para inicializar una instancia de una clase
                    if(parametros[i].equals(String.class))
                    {
                        o[i] = "Nombre";
                    }
                    else
                    {
                        o[i] = 12345;
                    }
                }

                try
                {
                    return constructor.newInstance(o);
                }
                catch (InstantiationException e)
                {
                    e.printStackTrace();
                }
                catch (IllegalAccessException e)
                {
                    e.printStackTrace();
                }
                catch (InvocationTargetException e)
                {
                    e.printStackTrace();
                }
            }

        }

        return null;
    }

    public static void main(String[] args)
    {
        Persona persona = (Persona) crearObjeto(Persona.class);
        Prueba prueba = persona.getClass().getAnnotation(Prueba.class);

        try
        {
            Class clase = Class.forName("Persona");
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }

        Persona p = new Persona();
        p.setNombre("Pepito");
        p.setDni("12222121");

        // Obtengo la clase del objeto de tipo Persona
        Class c = p.getClass();
        //Field[] attributes = c.getFields();
        // Obtengo los atributos declarados de la clase Persona
        Field[] attributes = c.getDeclaredFields();

        // Itero sobre los atr
        for (Field f: attributes)
        {
            System.out.println(f.getName() + " " + f.getType().getSimpleName());
        }

        //Method[] methods = c.getMethods();
        Method[] methods = c.getDeclaredMethods();

        for (Method m: methods)
        {
            System.out.println("metodo = " + m.getName());
            if(m.getName().startsWith("get"))
            {
                Object[] parametros = new Object[0];
                try
                {
                    Object o = m.invoke(p,parametros);
                    System.out.println("o = " + o);
                }
                catch (IllegalAccessException e)
                {
                    e.printStackTrace();
                }
                catch (InvocationTargetException e)
                {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void guardar(Object o)
    {
        Class c = o.getClass();
        Tabla tabla = (Tabla) c.getAnnotation(Tabla.class);

        Field[] atributos = c.getDeclaredFields();

        String query = "INSERT INTO " + tabla.nombre() + "(";
        for (Field atributo: atributos)
        {
            query += atributo.getName() + ",";
        }
    }
}
