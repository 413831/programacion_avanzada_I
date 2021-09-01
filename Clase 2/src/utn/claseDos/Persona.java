package utn.claseDos;

import java.util.Objects;

public class Persona
{
    private Integer dni;

    //TODO
    //FIXME


    /**
     * Método para determinar si una persona es mayor de edad
     * @return Retorna true si es mayor de edad
     */
    public boolean esMayor()
    {
        if(dni > 40000000)
        {
            return true;
        }
        return false;
    }

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder("Persona{");
        sb.append("dni=").append(getDni());
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof Persona)) return false;
        Persona persona = (Persona) o;
        return Objects.equals(getDni(), persona.getDni());
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(getDni());
    }

    public Integer getDni()
    {
        return dni;
    }

    public void setDni(Integer dni)
    {
        this.dni = dni;
    }
}
