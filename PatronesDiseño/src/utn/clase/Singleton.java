package utn.clase;

/**
 * Patron de diseño
 * - Utilizado para la reutilizacion de recursos
 */
public class Singleton
{
    private static Singleton miInstancia;

    private Singleton()
    {
    }

    public static Singleton getInstance()
    {
        if(miInstancia == null)
        {
            miInstancia = new Singleton();
        }
        return miInstancia;
    }
}
