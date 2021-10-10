package utn.clase;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args)
    {
	    List<String> lista = new ArrayList<>();
        List<Persona> personas = new ArrayList<>();

        Caja<String,Persona> cajaString = new Caja<>();
        cajaString.guardar("Palabra");
        System.out.println(cajaString.sacar());
    }
}
