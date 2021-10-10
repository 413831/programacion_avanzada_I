package utn.clase;

public class Puerta
{
    private Ventana ventana;
    private boolean puertaCerrada;

    public Puerta()
    {
        this.ventana = new Ventana();
    }

    public void setPuertaCerrada(boolean puertaCerrada)
    {
        this.puertaCerrada = puertaCerrada;
    }

    public void abrir()
    {
        if(this.puertaCerrada)
        {
            this.puertaCerrada = !this.puertaCerrada;
        }
    }

    public void cerrar()
    {
        if(!this.puertaCerrada)
        {
            this.puertaCerrada = !this.puertaCerrada;
        }
    }

    public boolean isPuertaCerrada()
    {
        return puertaCerrada;
    }

    public Ventana getVentana()
    {
        return ventana;
    }

    public void setVentana(Ventana ventana)
    {
        this.ventana = ventana;
    }

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder("Puerta{");
        sb.append("ventana=").append(ventana);
        sb.append(", puertaCerrada=").append(puertaCerrada);
        sb.append('}');
        return sb.toString();
    }
}
