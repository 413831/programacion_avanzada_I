package utn.parcial;

public class ManejoStringTest
{
    @Test(intentos = 5, nombre = "Mayusculas")
    public void metodoUno()
    {
        System.out.println("Metodo Uno");
    }

    @Test(intentos = 3, nombre = "Caracteres especiales")
    public void metodoDos()
    {
        System.out.println("Metodo Dos");
    }

    public void metodoTres()
    {
        System.out.println("Metodo Tres");
    }
}
