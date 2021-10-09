package utn.clase;

public class ConexionOracle implements Conexion
{
    @Override
    public void conectar()
    {
        System.out.println("Me conecto a base de datos Oracle");
    }
}
