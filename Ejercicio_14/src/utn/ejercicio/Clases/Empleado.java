package utn.ejercicio.Clases;

public class Empleado
{
    private String nombre;
    private String apellido;
    private String cuil;
    private String estado;
    private Double sueldo;
    private Integer cantidadHorasTrabajadas;
    private TipoCobro tipoCobro;

    public Empleado(String nombre, String apellido, String cuil, String estado, Double sueldo, Integer cantidadHorasTrabajadas, TipoCobro tipoCobro)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cuil = cuil;
        this.estado = estado;
        this.sueldo = sueldo;
        this.cantidadHorasTrabajadas = cantidadHorasTrabajadas;
        this.tipoCobro = tipoCobro;
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

    public String getCuil()
    {
        return cuil;
    }

    public void setCuil(String cuil)
    {
        this.cuil = cuil;
    }

    public String getEstado()
    {
        return estado;
    }

    public void setEstado(String estado)
    {
        this.estado = estado;
    }

    public Double getSueldo()
    {
        return sueldo;
    }

    public void setSueldo(Double sueldo)
    {
        this.sueldo = sueldo;
    }

    public Integer getCantidadHorasTrabajadas()
    {
        return cantidadHorasTrabajadas;
    }

    public void setCantidadHorasTrabajadas(Integer cantidadHorasTrabajadas)
    {
        this.cantidadHorasTrabajadas = cantidadHorasTrabajadas;
    }

    public TipoCobro getTipoCobro()
    {
        return tipoCobro;
    }

    public void setTipoCobro(TipoCobro tipoCobro)
    {
        this.tipoCobro = tipoCobro;
    }

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder("Empleado{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", apellido='").append(apellido).append('\'');
        sb.append(", cuil='").append(cuil).append('\'');
        sb.append(", estado='").append(estado).append('\'');
        sb.append(", sueldo=").append(sueldo);
        sb.append(", cantidadHorasTrabajadas=").append(cantidadHorasTrabajadas);
        sb.append(", tipoCobro=").append(tipoCobro);
        sb.append('}');
        return sb.toString();
    }
}
