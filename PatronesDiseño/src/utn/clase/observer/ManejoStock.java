package utn.clase.observer;

public class ManejoStock implements IObserver
{
    @Override
    public void update()
    {
        System.out.println("Modificar stock");
    }
}
