package utn.clase.state;

public class Alta implements IState
{
    @Override
    public void cambiarEstado(Objeto objeto)
    {
        objeto.setState(new Baja());
        System.out.println("Paso a Baja");
    }
}
