package test;

import org.junit.Assert;
import org.junit.Test;
import utn.clase.ManejoPalabra;

public class ManejoPalabraTest
{
    @Test
    public void TestSegundaPalabraOK()
    {
        ManejoPalabra manejoPalabra = new ManejoPalabra();

        String palabra = "La casa del lobo";

        try
        {
            String resultado = manejoPalabra.segundaPalabra(palabra);
            Assert.assertEquals(resultado,"casa");
        }
        catch (Exception ex)
        {
            Assert.fail();
        }
    }

}
