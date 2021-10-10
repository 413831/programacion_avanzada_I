package utn.clase;

public class Main {

    public static void main(String[] args)
    {
	    Auto auto1 = new Auto("763AAA",EMarca.FORD,"Fiesta",150000);
        Auto auto2 = new Auto("868ABC",EMarca.NISSAN,"Murano",200000);
        Auto auto3 = new Auto("668ABC",EMarca.MERCEDES_BENZ,"Sedan",200000);

        System.out.println("auto1 = " + auto1);
        System.out.println("auto2 = " + auto2);
        System.out.println("auto3 = " + auto3);
    }
}
