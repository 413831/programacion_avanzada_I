package utn.ejercicio;

/*
14. Crear una clase llamada empleado, que tenga nombre, apellido, cuil, estado, sueldo,
cantidadHorasTrabajadas y tipoCobro.
Los tipos de cobro tiene que estar dados por un Enum: mensual o porHora.
Crear una interface llamada ICalculoSueldo, la cual debe poseer un método que se llame
calcular que retornara el monto que debe cobrar el empleado.
Cree dos implementaciones de la interfaz ICalculoSueldo: SueldoMensual y
SueldoPorHora, en la primera debe retornar el atributo sueldo y en la segunda debe
retornar el atributo sueldo por cantidad de horas.
Genere en un test una lista de 5 empleados y liquídele el sueldo. Utilice el patrón Factory
para identificar que implementación utilizar para cada empleado.
 */

import utn.ejercicio.Clases.Empleado;
import utn.ejercicio.Clases.FactorySueldo;
import utn.ejercicio.Clases.ICalcularSueldo;
import utn.ejercicio.Clases.TipoCobro;

public class Main
{
    public static void main(String[] args)
    {
        Empleado empleado1 = new Empleado("Pepito", "Heinz", "2367765758", "Activo", 80000d, 1000, TipoCobro.MENSUAL);
        Empleado empleado2 = new Empleado("Juancito", "Paredes", "23235743758", "Activo", 80000d, 100, TipoCobro.POR_HORA);
        ICalcularSueldo calcularSueldo = FactorySueldo.obtenerCalculadora(empleado2);

        Double sueldo = calcularSueldo.calcular();
        System.out.println("sueldo = " + sueldo);

    }
}
