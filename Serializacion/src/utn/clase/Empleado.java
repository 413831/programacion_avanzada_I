package utn.clase;

import java.io.Serializable;
import java.math.BigDecimal;

public class Empleado implements Serializable
{
    private String nombre;
    private BigDecimal salario;
    private transient int id;

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public BigDecimal getSalario()
    {
        return salario;
    }

    public void setSalario(BigDecimal salario)
    {
        this.salario = salario;
    }

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder("Empleado{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", salario=").append(salario);
        sb.append('}');
        return sb.toString();
    }

    public int getId()
    {
        return id;
    }
}
