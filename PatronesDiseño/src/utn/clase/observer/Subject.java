package utn.clase.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject
{
    List<IObserver> observadores = new ArrayList<>();

    public void agregar(IObserver observer)
    {
        this.observadores.add(observer);
    }

    public void sacar(IObserver observer)
    {
        this.observadores.remove(observer);
    }

    public void notificar()
    {
        for (IObserver observer: this.observadores)
        {
            observer.update();
        }
    }

}
