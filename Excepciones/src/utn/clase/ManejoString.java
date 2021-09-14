package utn.clase;

import java.io.IOException;

public class ManejoString
{
    public int cantidadCaracteres(String s) throws Exception, IOException
    {
        if(s.isEmpty())
        {
            throw new MiExcepcion("String invalido");
        }
        return s.length();
    }
}
