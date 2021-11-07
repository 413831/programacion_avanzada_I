package utn.clase;


import java.lang.reflect.*;

public class Main {

    public static void main(String[] args)
    {
	    Persona p = new Persona();
        p.setNombre("Pepito");
        p.setDni("12222121");

        Class c = p.getClass();
        //Field[] attributes = c.getFields();
        Field[] attributes = c.getDeclaredFields();

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
}
