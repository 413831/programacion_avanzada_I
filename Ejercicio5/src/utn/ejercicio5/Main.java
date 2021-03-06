package utn.ejercicio5;

import java.util.Scanner;

/**
 * Ejercicio 5: Cree una interface llamada ICalcular, que tenga los siguientes métodos: ∙
 * sumar
 * ∙ restar
 * ∙ multiplicar
 * ∙ dividir throw MiExcepcion
 * Todos los métodos reciben dos parámetros del tipo Numbre y retornan un Double. El
 * método dividir debe lanzar una excepción si se intenta dividir por 0.
 * Cree una clase llamada calculadora la cual implemente la interface anterior. En el método
 * main se deben mostrar por consola todos los métodos disponibles y un número. El
 * usuario debe ingresar la operación deseada y los valores requeridos por el método. El
 * sistema debe mostrar por consola el resultado. Utilice la estructura switch para la
 * ejecución de los métodos.
 * @author Alejandro Planes
 * @version 1.0
 */
public class Main {

    /**
     * Implementación de la Calculadora
     * @param args Parámetros estandar de aplicacion
     */
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        int operacion;
        Number numeroUno;
        Number numeroDos;
        double resultado;

        System.out.println("Ingrese primer numero");
        numeroUno = scanner.nextDouble();
        System.out.println("Ingrese segundo numero");
        numeroDos = scanner.nextDouble();
        System.out.println("Seleccione operacion:\n (1) Suma\n (2) Resta\n (3) Multiplicacion\n (4) División");
        scanner.nextLine();
        operacion = scanner.nextInt();

        try
        {
            switch (operacion)
            {
                case 1 :
                    resultado = calculadora.sumar(numeroUno,numeroDos);
                    System.out.println("resultado = " + resultado);
                    break;
                case 2 :
                    resultado = calculadora.restar(numeroUno,numeroDos);
                    System.out.println("resultado = " + resultado);
                    break;
                case 3 :
                    resultado = calculadora.multiplicar(numeroUno,numeroDos);
                    System.out.println("resultado = " + resultado);
                    break;
                case 4 :
                    resultado = calculadora.dividir(numeroUno,numeroDos);
                    System.out.println("resultado = " + resultado);
                    break;
            }
        }
        catch(MiExcepcion excepcion)
        {
            System.out.println("Error = " + excepcion.getMessage());
        }
    }
}
