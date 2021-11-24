package utn.parcial;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Controller
{
    public static Object crearObjeto(Object object) throws InvocationTargetException, InstantiationException, IllegalAccessException
    {
        Constructor[] constructores = object.getClass().getConstructors();
        Field[] atributos = object.getClass().getDeclaredFields();
        Method[] metodos = object.getClass().getDeclaredMethods();
        Constructor constructorCompleto = null;
        Class[] parametros = null;

        for (Constructor constructor: constructores)
        {
            if(atributos.length == constructor.getParameterCount())
            {
                constructorCompleto = constructor;
                parametros = constructorCompleto.getParameterTypes();
            }
        }

        Object[] argumentos = new Object[parametros.length];

        for (int i = 0; i < atributos.length; i++)
        {
            System.out.print(atributos[i].getName() + " - ");

            for (Method metodo: metodos)
            {
                if(metodo.getName().toLowerCase().contains("get" + atributos[i].getName()))
                {
                    Object value = metodo.invoke(object);
                    System.out.println(value);
                    argumentos[i] = value;
                }
            }
        }
        return constructorCompleto.newInstance(argumentos);
    }

    public static void invocarMetodo(Object object) throws InvocationTargetException, IllegalAccessException
    {
        Method[] metodos = object.getClass().getDeclaredMethods();

        for (Method metodo: metodos)
        {
            Test test = metodo.getAnnotation(Test.class);
            if(test != null)
            {
                System.out.println(test.nombre());
                for (int i = 0; i < test.intentos(); i++)
                {
                    metodo.invoke(object);
                }
            }
        }
    }
}
