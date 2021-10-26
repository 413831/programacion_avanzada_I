package utn.ejercicio.Clases;

public class Contexto
{
    private IEstado estado;

    public Contexto(IEstado estado)
    {
        this.estado = estado;
    }

    public void ejecutarAccion(Alumno alumno)
    {
        this.estado.cambiarEstado(alumno);
    }

    public IEstado getEstado()
    {
        return estado;
    }

    public void setEstado(IEstado estado)
    {
        this.estado = estado;
    }
}
