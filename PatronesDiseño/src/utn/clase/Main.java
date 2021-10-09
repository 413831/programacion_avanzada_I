package utn.clase;

public class Main {

    public static void main(String[] args)
    {
        // Singleton
	    Singleton instancia = Singleton.getInstance();
        // Factory
        Conexion conexionOracle = FabricaConexion.crearConexion("oracle");
        conexionOracle.conectar();
        Conexion conexionSQL = FabricaConexion.crearConexion("sql");
        conexionSQL.conectar();

    }
}
