package utn.ejercicio5;

/**
 * Implementación de Excepcion propia para clase Calculadora
 */
public class MiExcepcion extends Exception
{
    /**
     * Excepcion utilizada para implementar en ICalcular
     * @param mensaje Texto a mostrar en caso de lanzarse la excepcion
     */
    public MiExcepcion(String mensaje)
    {
        super(mensaje);
    }
}
