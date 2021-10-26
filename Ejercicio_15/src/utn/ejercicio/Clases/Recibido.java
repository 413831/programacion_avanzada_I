package utn.ejercicio.Clases;

public class Recibido implements IEstado
{
    @Override
    public void cambiarEstado(Alumno alumno)
    {
        alumno.setEstado(new Recibido());
    }
}
