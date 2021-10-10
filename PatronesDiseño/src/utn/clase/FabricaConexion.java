package utn.clase;

public class FabricaConexion
{
    public static Conexion crearConexion(String baseDeDatos)
    {
        if("oracle".equals(baseDeDatos))
        {
            return ConexionOracle.getInstance();
        }
        else if("sql".equals(baseDeDatos))
        {
            return ConexionSQL.getInstance();
        }
        return null;
    }
}
