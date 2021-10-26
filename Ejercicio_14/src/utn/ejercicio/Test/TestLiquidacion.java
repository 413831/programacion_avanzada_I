package utn.ejercicio.Test;

import org.junit.Assert;
import org.junit.Test;
import utn.ejercicio.Clases.*;

import java.util.ArrayList;
import java.util.List;

public class TestLiquidacion
{
    @Test
    public void identificarTipoSueldo()
    {
        List<Empleado> lista = new ArrayList<>();

        lista.add(new Empleado("Pepito", "Heinz", "2367765758", "Activo", 80000d, 1000, TipoCobro.MENSUAL));
        lista.add(new Empleado("Manuela", "Pereyra", "2367765459", "Activo", 95000d, 2500, TipoCobro.MENSUAL));
        lista.add(new Empleado("Kevin", "Guevara", "2356765459", "Activo", 170d, 2500, TipoCobro.POR_HORA));
        lista.add(new Empleado("Nancy", "Corridas", "2456765459", "Inactivo", 250d, 2000, TipoCobro.POR_HORA));
        lista.add(new Empleado("Arnaldo", "Gerschwin", "2333765459", "Activo", 115000d, 1600, TipoCobro.MENSUAL));

        for (Empleado empleado: lista)
        {
            ICalcularSueldo calculadora = FactorySueldo.obtenerCalculadora(empleado);
            System.out.println("Sueldo = " + calculadora.calcular());

            if( empleado.getTipoCobro().equals(TipoCobro.MENSUAL) && calculadora.getClass() != SueldoMensual.class ||
                empleado.getTipoCobro().equals(TipoCobro.POR_HORA) && calculadora.getClass() != SueldoPorHora.class )
            {
                Assert.fail();
            }
        }
        Assert.assertTrue(true);
    }
}
