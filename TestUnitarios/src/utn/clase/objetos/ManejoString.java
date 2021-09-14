package utn.clase.objetos;

public class ManejoString
{
    public int cantidadCaracteres(String s) throws MiExcepcion
    {
        if(s.isEmpty())
        {
            throw new MiExcepcion("String invalido");
        }
        return s.length();
    }
}
