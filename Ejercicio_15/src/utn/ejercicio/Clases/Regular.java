package utn.ejercicio.Clases;

public class Regular implements IEstado
{
    private IEstado siguienteEstado;

    @Override
    public void cambiarEstado(Alumno alumno)
    {
        alumno.setEstado(this.siguienteEstado);
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
