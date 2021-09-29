package utn.clase;

import java.util.Objects;

public class Persona
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
        if (this == o) return true;
        if (!(o instanceof Persona)) return false;
        Persona persona = (Persona) o;
        return getNombre().equals(persona.getNombre()) && getDni().equals(persona.getDni());
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(getNombre(), getDni());
    }
}
