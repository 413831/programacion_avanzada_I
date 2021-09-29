package utn.clase;

import java.util.Objects;

public class Persona implements Comparable
{
    private String nombre;
    private String dni;

    public Persona(String nombre, String dni)
    {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getDni()
    {
        return dni;
    }

    public void setDni(String dni)
    {
        this.dni = dni;
    }

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder("Persona{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", dni='").append(dni).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o)
    {
        if(o == null) return false;
        if(o.getClass().equals(this.getClass()))
        {
            Persona p = (Persona) o;

            if(p.nombre.equals(this.nombre) && p.dni.equals(this.dni))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(getNombre(), getDni());
    }

    @Override
    public int compareTo(Object o)
    {

        return 0;
    }
}
