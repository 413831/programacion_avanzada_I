package utn.clase;

public class Rueda
{
    private boolean ruedaInflada;

    public void inflar()
    {
        if(!this.ruedaInflada)
        {
            this.ruedaInflada = !this.ruedaInflada;
        }
    }

    public void desinflar()
    {
        if(this.ruedaInflada)
        {
            this.ruedaInflada = !this.ruedaInflada;
        }
    }

    public boolean isRuedaInflada()
    {
        return ruedaInflada;
    }

    public void setRuedaInflada(boolean ruedaInflada)
    {
        this.ruedaInflada = ruedaInflada;
    }

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder("Rueda{");
        sb.append("ruedaInflada=").append(ruedaInflada);
        sb.append('}');
        return sb.toString();
    }
}
