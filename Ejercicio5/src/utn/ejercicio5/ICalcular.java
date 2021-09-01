package utn.ejercicio5;

public interface ICalcular
{
    public double sumar(Number numeroUno, Number numeroDos);
    public double restar(Number numeroUno, Number numeroDos);
    public double multiplicar(Number numeroUno, Number numeroDos);
    public double dividir(Number numeroUno, Number numeroDos) throws MiExcepcion;
}
