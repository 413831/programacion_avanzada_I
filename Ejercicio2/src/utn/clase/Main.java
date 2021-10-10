package utn.clase;

public class Main {

    public static void main(String[] args)
    {
        Motor motor = new Motor();
        Puerta puerta1 = new Puerta();
        Puerta puerta2 = new Puerta();
        Rueda rueda1 = new Rueda();
        Rueda rueda2 = new Rueda();
        Rueda rueda3 = new Rueda();
        Rueda rueda4 = new Rueda();

	    Coche coche = new Coche(motor,rueda1,rueda2,rueda3,rueda4,puerta1,puerta2);

        coche.getRueda1().inflar();
        coche.getRueda2().inflar();
        coche.getRueda3().inflar();
        coche.getRueda4().inflar();
        coche.getPuerta1().cerrar();
        coche.getPuerta1().getVentana().cerrar();
        coche.getPuerta2().cerrar();
        coche.getPuerta2().getVentana().cerrar();

        coche.arrancar();
    }
}
