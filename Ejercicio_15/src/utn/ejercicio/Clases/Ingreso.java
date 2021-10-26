package utn.ejercicio.Clases;

public class Ingreso implements IEstado
{
    @Override
    public void cambiarEstado(Alumno alumno)
    {
        alumno.setEstado(new Regular());
    }
}
