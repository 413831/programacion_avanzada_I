package utn.clase.objetos;

public class ManejoPalabra
{
    public String segundaPalabra(String palabra) throws IndexOutOfBoundsException
    {
        String[] palabras = palabra.split(" ");
        return palabras[1];
    }
}
