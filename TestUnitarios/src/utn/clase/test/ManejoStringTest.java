package utn.clase.test;


import org.junit.Assert;
import org.junit.Test;
import utn.clase.objetos.ManejoString;
import utn.clase.objetos.MiExcepcion;

public class ManejoStringTest
{
    /**
     * Test para verificar si el método cantidadCaracteres devuelve la cantidad correcta
     */
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

    /**
     * Test para verificar que el  metodo cantidadCaracteres lanza excepcion en caso de blanco / vacio
     */
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

    /**
     * Test oara verificar que el método cantidadCaracteres lanza excepcion al recibir String null
     */
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

    @Test
    public void cantidadCaracteresConEspacios()
    {
        ManejoString manejoString = new ManejoString();
        final String input = "Palabra con espacios";
        final int valorEsperado = 20;
        try
        {
            int resultado = manejoString.cantidadCaracteres(input);
            Assert.assertEquals("OK",valorEsperado, resultado);
        }
        catch (Exception e)
        {
            Assert.fail();
        }
    }


}
