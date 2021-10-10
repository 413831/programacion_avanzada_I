package utn.clase;

public class ConexionSQL implements Conexion
{
    private static ConexionSQL conexion;

    private ConexionSQL()
    {}

    public static ConexionSQL getInstance()
    {
        if(ConexionSQL.conexion == null)
        {
            ConexionSQL.conexion = new ConexionSQL();
        }
        return ConexionSQL.conexion;
    }

    @Override
    public void conectar()
    {
        System.out.println("Me conecto a base de datos SQL");
    }
}
