package utn.clase;

import utn.clase.adapter.BirdAdapter;
import utn.clase.adapter.PlasticToyDuck;
import utn.clase.adapter.Sparrow;
import utn.clase.adapter.ToyDuck;
import utn.clase.facade.ShapeMaker;
import utn.clase.factory.FabricaConexion;
import utn.clase.observer.ManejoStock;
import utn.clase.observer.Publicaciones;
import utn.clase.observer.ValorDolar;

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

        // Observer
        ManejoStock manejoStock = new ManejoStock();
        Publicaciones publicaciones = new Publicaciones();
        ValorDolar valorDolar = new ValorDolar();

        valorDolar.agregar(manejoStock);
        valorDolar.agregar(publicaciones);

        try
        {
            Thread.sleep(3000l);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        valorDolar.setValorActual(200);

    }
}
