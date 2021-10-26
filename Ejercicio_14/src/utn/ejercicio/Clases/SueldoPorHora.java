package utn.ejercicio.Clases;

public class SueldoPorHora implements ICalcularSueldo
{
    private Double sueldo;
    private Integer horas;

    public SueldoPorHora(Double sueldo, Integer horas)
    {
        this.sueldo = sueldo;
        this.horas = horas;
    }

    @Override
    public double calcular()
    {
        return this.sueldo * this.horas;
    }

    public Double getSueldo()
    {
        return sueldo;
    }

    public void setSueldo(Double sueldo)
    {
        this.sueldo = sueldo;
    }

    public Integer getHoras()
    {
        return horas;
    }

    public void setHoras(Integer horas)
    {
        this.horas = horas;
    }
}
