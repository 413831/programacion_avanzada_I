package utn.clase.test;


import org.junit.Assert;
import org.junit.Test;
import utn.clase.objetos.ManejoString;
import utn.clase.objetos.MiExcepcion;

public class ManejoStringTest
{
    @Test
    public void cantidadCaracteresOK()
    {
        ManejoString manejoString = new ManejoString();
        final String input = "Hola";
        final int valorEsperado = 4;

        try
        {
            int result = manejoString.cantidadCaracteres(input);
            Assert.assertEquals("OK",valorEsperado, result);
        }
        catch(Exception e)
        {
            Assert.fail();
        }
    }

    @Test
    public void cantidadCaracteresException()
    {
        ManejoString manejoString = new ManejoString();
        final String input = "";
        try
        {
            manejoString.cantidadCaracteres(input);
            Assert.fail("No se lanzó excepción");
        }
        catch (Exception e)
        {
            Assert.assertTrue(true);
        }
    }

    @Test
    public void cantidadCaracteresNull()
    {
        ManejoString manejoString = new ManejoString();
        final String input = null;
        try
        {
            manejoString.cantidadCaracteres(input);
            Assert.fail("No se lanzó excepción");
        }
        catch (Exception e)
        {
            Assert.assertTrue(true);
        }
    }


}
