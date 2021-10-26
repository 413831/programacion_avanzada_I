package utn.ejercicio.Clases;

public class SueldoMensual implements ICalcularSueldo
{
    private double sueldo;

    public SueldoMensual(double sueldo)
    {
        this.sueldo = sueldo;
    }

    @Override
    public double calcular()
    {
        return this.sueldo;
    }

    public double getSueldo()
    {
        return sueldo;
    }

    public void setSueldo(double sueldo)
    {
        this.sueldo = sueldo;
    }
}
