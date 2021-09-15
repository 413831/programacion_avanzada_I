package utn.clase;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args)
    {
        List lista = new ArrayList<>();

        // agregar elemento
        lista.add("Hola");
        // obtener elemento por indice
        lista.get(0);
        // cantidad de elementos
        lista.size();
        // quita elemento por indice
        lista.remove(0);

        for (Object elemento: lista)
        {
            System.out.println("elemento = " + elemento);
        }
    }
}
