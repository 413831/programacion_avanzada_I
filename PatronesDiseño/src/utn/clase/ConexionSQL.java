package utn.clase;

public class ConexionSQL implements Conexion
{
    @Override
    public void conectar()
    {
        System.out.println("Me conecto a base de datos SQL");
    }
}
