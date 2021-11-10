package utn.clase;

@Prueba(cantidad = 1, nombre = "Persona")
@Tabla(nombre = "Personas")
public class Persona
{
    private String nombre;
    private String dni;

    @Prueba(cantidad = 3)
    public Persona()
    {
    }

    public Persona(@Prueba(cantidad = 2) String nombre, String dni)
    {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getDni()
    {
        return dni;
    }

    public void setDni(String dni)
    {
        this.dni = dni;
    }
}
