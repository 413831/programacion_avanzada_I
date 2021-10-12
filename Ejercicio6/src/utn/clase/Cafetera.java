package utn.clase;

public class Cafetera
{
    private int capacidadMaxima;
    private int cantidadActual;

    public Cafetera()
    {
        this.capacidadMaxima = 1000;
        this.cantidadActual = 0;
    }

    public Cafetera(int cantidadMaxima)
    {
        this.cantidadActual = cantidadMaxima;
        this.capacidadMaxima = cantidadMaxima;
    }
    public Cafetera(int capacidadMaxima, int cantidadActual)
    {
        if(cantidadActual > capacidadMaxima)
        {
            this.cantidadActual = capacidadMaxima;
        }
        else
        {
            this.cantidadActual = cantidadActual;
        }
        this.capacidadMaxima = capacidadMaxima;
    }

    public void llenarCafetera()
    {
        this.cantidadActual = this.capacidadMaxima;
    }

    public void servirTaza(int capacidad)
    {
        if(capacidad > this.cantidadActual)
        {
            this.cantidadActual -= this.cantidadActual;
        }
        else
        {
            this.cantidadActual -= capacidad;
        }
    }

    public void vaciarCafetera()
    {
        this.cantidadActual = 0;
    }

    public void agregarCafe(int cantidadCafe)
    {
        if((this.cantidadActual + cantidadCafe) > this.capacidadMaxima)
        {
            this.cantidadActual = this.capacidadMaxima;
        }
        else
        {
            this.cantidadActual += cantidadCafe;
        }
    }

    public int getCapacidadMaxima()
    {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima)
    {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual()
    {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual)
    {
        this.cantidadActual = cantidadActual;
    }

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder("Cafetera{");
        sb.append("capacidadMaxima=").append(capacidadMaxima);
        sb.append(", cantidadActual=").append(cantidadActual);
        sb.append('}');
        return sb.toString();
    }
}
