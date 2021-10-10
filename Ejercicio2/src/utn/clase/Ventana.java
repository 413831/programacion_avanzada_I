package utn.clase;

public class Ventana
{
    private boolean ventanaCerrada;

    public void abrir()
    {
        if(this.ventanaCerrada)
        {
            this.ventanaCerrada = !this.ventanaCerrada;
        }
    }

    public void cerrar()
    {
        if(!this.ventanaCerrada)
        {
            this.ventanaCerrada = !this.ventanaCerrada;
        }
    }

    public boolean isVentanaCerrada()
    {
        return ventanaCerrada;
    }

    public void setVentanaCerrada(boolean ventanaCerrada)
    {
        this.ventanaCerrada = ventanaCerrada;
    }

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder("Ventana{");
        sb.append("ventanaCerrada=").append(ventanaCerrada);
        sb.append('}');
        return sb.toString();
    }
}
