package utn.ejercicio.Clases;

public class FactorySueldo
{
    public static ICalcularSueldo obtenerCalculadora(Empleado empleado)
    {
        if(empleado.getTipoCobro().equals(TipoCobro.MENSUAL))
        {
            return new SueldoMensual(empleado.getSueldo());
        }
        else if(empleado.getTipoCobro().equals(TipoCobro.POR_HORA))
        {
            return new SueldoPorHora(empleado.getSueldo(), empleado.getCantidadHorasTrabajadas());
        }
        return null;
    }
}
