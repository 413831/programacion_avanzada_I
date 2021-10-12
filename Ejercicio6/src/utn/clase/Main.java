package utn.clase;

public class Main {

    public static void main(String[] args)
    {
	    Cafetera cafetera = new Cafetera(2000,200);

        cafetera.agregarCafe(100);
        cafetera.llenarCafetera();
        cafetera.vaciarCafetera();
        cafetera.servirTaza(150);
        System.out.println("cafetera = " + cafetera);
    }
}
