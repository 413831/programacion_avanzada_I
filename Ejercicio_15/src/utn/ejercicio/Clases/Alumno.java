package utn.ejercicio.Clases;

public class Alumno
{
    private String nombre;
    private String apellido;
    private String legajo;
    private String carrera;
    private IEstado estado;

    public Alumno(String nombre, String apellido, String legajo, String carrera, IEstado estado)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
        this.carrera = carrera;
        this.estado = estado;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getApellido()
    {
        return apellido;
    }

    public void setApellido(String apellido)
    {
        this.apellido = apellido;
    }

    public String getLegajo()
    {
        return legajo;
    }

    public void setLegajo(String legajo)
    {
        this.legajo = legajo;
    }

    public String getCarrera()
    {
        return carrera;
    }

    public void setCarrera(String carrera)
    {
        this.carrera = carrera;
    }

    public IEstado getEstado()
    {
        return estado;
    }

    public void setEstado(IEstado estado)
    {
        this.estado = estado;
    }

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder("Alumno{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", apellido='").append(apellido).append('\'');
        sb.append(", legajo='").append(legajo).append('\'');
        sb.append(", carrera='").append(carrera).append('\'');
        sb.append(", estado=").append(estado);
        sb.append('}');
        return sb.toString();
    }
}
