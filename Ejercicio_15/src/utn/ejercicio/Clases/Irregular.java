package utn.ejercicio.Clases;

public class Irregular implements IEstado
{
    private IEstado siguienteEstado;

    public Irregular()
    {
    }

    @Override
    public void cambiarEstado(Alumno alumno)
    {
        alumno.setEstado(new Regular());
    }

    public IEstado getSiguienteEstado()
    {
        return siguienteEstado;
    }

    public void setSiguienteEstado(IEstado siguienteEstado)
    {
        this.siguienteEstado = siguienteEstado;
    }
}
