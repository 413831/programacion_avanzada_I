package utn.clase;

import java.util.Objects;

public class Auto
{
    private String patente;
    private EMarca marca;
    private String modelo;
    private Integer precio;

    public Auto(String patente, EMarca marca, String modelo, Integer precio)
    {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getPatente()
    {
        return patente;
    }

    public void setPatente(String patente)
    {
        this.patente = patente;
    }

    public EMarca getMarca()
    {
        return marca;
    }

    public void setMarca(EMarca marca)
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

    public Integer getPrecio()
    {
        return precio;
    }

    public void setPrecio(Integer precio)
    {
        this.precio = precio;
    }

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder("Auto{");
        sb.append("patente='").append(patente).append('\'');
        sb.append(", marca=").append(marca);
        sb.append(", modelo='").append(modelo).append('\'');
        sb.append(", precio=").append(precio);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof Auto)) return false;
        Auto auto = (Auto) o;
        return getPatente().equals(auto.getPatente()) && getMarca() == auto.getMarca()
               && getModelo().equals(auto.getModelo()) && Objects.equals(getPrecio(), auto.getPrecio());
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(getPatente(), getMarca(), getModelo(), getPrecio());
    }
}
