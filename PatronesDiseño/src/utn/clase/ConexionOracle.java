package utn.clase;

public class ConexionOracle implements Conexion
{
    public static ConexionOracle conexion;

    private ConexionOracle()
    {}

    public static ConexionOracle getInstance()
    {
        if(ConexionOracle.conexion == null)
        {
            ConexionOracle.conexion = new ConexionOracle();
        }
        return ConexionOracle.conexion;
    }

    @Override
    public void conectar()
    {
        System.out.println("Me conecto a base de datos Oracle");
    }
}
