package utn.ejercicio5;

/**
 * Interfaz con descripción de métodos para calculor aritméticos
 */
public interface ICalcular
{
    /**
     * Método para sumar dos números
     * @param numeroUno Primer numero del termino
     * @param numeroDos Segundo numero del termino
     * @return Retorna el resultado de la suma
     */
    public double sumar(Number numeroUno, Number numeroDos);

    /**
     * Método para restar dos números
     * @param numeroUno Primer número del termino
     * @param numeroDos Segundo número del termino
     * @return Retorna el resultado de la resta
     */
    public double restar(Number numeroUno, Number numeroDos);

    /**
     * Método para multiplicar dos números
     * @param numeroUno Multiplicando
     * @param numeroDos Multiplicador
     * @return Retorna el producto de dos numeros
     */
    public double multiplicar(Number numeroUno, Number numeroDos);

    /**
     * Método para dividir dos números
     * @param numeroUno Dividendo
     * @param numeroDos Divisor
     * @return Retorna el cociente de dos números
     * @throws MiExcepcion en caso de que el divisor sea igual a 0 (Cero)
     */
    public double dividir(Number numeroUno, Number numeroDos) throws MiExcepcion;
}
