package utn.clase;

public class Main {

    public static void main(String[] args)
    {
        ManejoString manejoString = new ManejoString();

        try
        {
            manejoString.cantidadCaracteres("Palabra");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
