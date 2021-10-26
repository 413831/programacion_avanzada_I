package utn.clase.observer;

public class Publicaciones implements IObserver
{
    @Override
    public void update()
    {
        // Se ejecuta al cambiar el valor del dolar
        System.out.println("Bajar publicacion");
    }
}
