package utn.clase.state;

public class Context
{
    private IState estado;

    public Context(IState estado)
    {
        this.estado = estado;
    }

    public void ejecutarAccion(Objeto objeto)
    {
        this.estado.cambiarEstado(objeto);
    }

}
