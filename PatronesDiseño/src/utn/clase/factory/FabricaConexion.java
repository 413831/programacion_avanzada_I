package utn.clase.factory;

import utn.clase.Conexion;
import utn.clase.ConexionOracle;
import utn.clase.ConexionSQL;

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
