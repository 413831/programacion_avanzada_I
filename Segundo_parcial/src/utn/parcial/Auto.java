package utn.parcial;

import java.util.Objects;

public class Auto
{
    private String marca;
    private String modelo;
    private String anio;

    public Auto(String marca, String modelo, String anio)
    {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public String getMarca()
    {
        return marca;
    }

    public void setMarca(String marca)
    {
        this.marca = marca;
    }

    public String getModelo()
    {
        return modelo;
    }

    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }

    public String getAnio()
    {
        return anio;
    }

    public void setAnio(String anio)
    {
        this.anio = anio;
    }

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder("Auto{");
        sb.append("marca='").append(marca).append('\'');
        sb.append(", modelo='").append(modelo).append('\'');
        sb.append(", anio='").append(anio).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof Auto)) return false;
        Auto auto = (Auto) o;
        return Objects.equals(getMarca(), auto.getMarca()) && Objects.equals(getModelo(), auto.getModelo()) && Objects.equals(getAnio(), auto.getAnio());
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(getMarca(), getModelo(), getAnio());
    }
}
