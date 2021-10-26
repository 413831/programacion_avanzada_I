package utn.clase.state;

public class Baja implements IState
{
    @Override
    public void cambiarEstado(Objeto objeto)
    {
        objeto.setState(new Alta());
        System.out.println("Paso a Alta");
    }
}
