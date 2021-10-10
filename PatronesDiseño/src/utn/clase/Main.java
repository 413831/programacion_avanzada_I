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

        // Facade
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();

        // Object Adapter
        Sparrow sparrow = new Sparrow();
        ToyDuck toyDuck = new PlasticToyDuck();
        ToyDuck birdAdapter = new BirdAdapter(sparrow);

        System.out.println("Sparrow...");
        sparrow.fly();
        sparrow.makeSound();
        System.out.println("Toyduck...");
        toyDuck.squeak();
        System.out.println("BirdAdapter...");
        birdAdapter.squeak();

    }
}
