package utn.ejercicio5;

/**
 * Clase para realizar operaciones aritméticas
 * Implementa interfaz ICalcular
 */
public class Calculadora implements ICalcular
{
    /**
     * Método para sumar dos números
     * @param numeroUno Primer numero a sumar
     * @param numeroDos Segundo numero a sumar
     * @return Se retorna el resultado de la suma
     */
    @Override
    public double sumar(Number numeroUno, Number numeroDos)
    {
        return numeroUno.doubleValue() + numeroDos.doubleValue();
    }

    /**
     * Método para restar dos números
     * @param numeroUno Primer número para restar
     * @param numeroDos Segundo número a restar
     * @return Se retorna el resultado de la resta
     */
    @Override
    public double restar(Number numeroUno, Number numeroDos)
    {
        return numeroUno.doubleValue() - numeroDos.doubleValue();
    }

    /**
     * Metodo para multiplicar dos numeros
     * @param numeroUno Número multiplicando
     * @param numeroDos Número multiplicador
     * @return Se retorna el producto de la multiplicacion
     */
    @Override
    public double multiplicar(Number numeroUno, Number numeroDos)
    {
        return numeroUno.doubleValue() * numeroDos.doubleValue();
    }

    /**
     * Método para dividir dos numeros
     * @param numeroUno Número dividendo
     * @param numeroDos Número divisor
     * @return Se retorna el resultado de la división
     * @throws MiExcepcion en caso de que el divisor sea igual a 0 (Cero)
     */
    @Override
    public double dividir(Number numeroUno, Number numeroDos) throws MiExcepcion
    {
        if(numeroDos.doubleValue() == 0)
        {
            throw new MiExcepcion("No es posible dividir por cero");
        }
        return numeroUno.doubleValue() / numeroDos.doubleValue();
    }


}
