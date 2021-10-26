package utn.clase.observer;

public class ValorDolar extends Subject
{
    double valorActual;

    public void setValorActual(double valorActual)
    {
        this.valorActual = valorActual;
        super.notificar();
    }
}
