package utn.clase;

public class FabricaConexion
{
    public static Conexion crearConexion(String baseDeDatos)
    {
        if("oracle".equals(baseDeDatos))
        {
            return new ConexionOracle();
        }
        else if("sql".equals(baseDeDatos))
        {
            return new ConexionSQL();
        }
        return null;
    }
}
