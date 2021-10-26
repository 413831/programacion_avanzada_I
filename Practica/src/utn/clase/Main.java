package utn.clase;

import java.util.*;

public class Main {

    public static void main(String[] args)
    {
	    String s = "No se, no entiendo, no funciona";
        s.replaceAll("no","");
        System.out.println(s.substring(s.indexOf("no")).toLowerCase());

        Integer numero = 1;
        String numeroString = String.valueOf(numero);
        int numeroPrimitivo = numero.intValue();
        Double numeroDouble = Double.valueOf(numero.doubleValue());
        System.out.println("numeroString = " + numeroString);
        System.out.println("numeroPrimitivo = " + numeroPrimitivo);
        System.out.println("numeroDouble = " + numeroDouble);

        Set<String> set = new HashSet<String>();
        set.add("Sarasa");
        set.add("Hola");
        set.add("Mundo");

        String uno = "UNO";
        String dos = "DOS";
        String tres = "TRES";
        Map lista = new TreeMap();
        lista.put(uno, uno);
        lista.put(dos, dos);
        lista.put(tres, tres);
        System.out.println(lista.size());

        Map personas = new HashMap();
    }


}
