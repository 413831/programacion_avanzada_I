package utn.clase;

public class ManejoPalabra
{
    private static ManejoPalabra miInstancia;

    public ManejoPalabra()
    {}

    public static ManejoPalabra getInstance()
    {
        if(miInstancia == null)
        {
            miInstancia = new ManejoPalabra();
        }
        return miInstancia;
    }

    public String segundaPalabra(String palabra) throws ArrayIndexOutOfBoundsException
    {
        String[] palabras = palabra.split(" ");
        return palabras[1];
    }
}
