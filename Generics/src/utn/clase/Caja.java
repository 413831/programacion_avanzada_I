package utn.clase;

public class Caja<T extends String, K extends Persona>
{
    // Type = T
    T valor;

    public void guardar(T valor)
    {
        this.valor = valor;
    }

    public T sacar()
    {
        return this.valor;
    }
}
