package utn.clase;

import java.util.*;

public class Main {

    public static void main(String[] args)
    {
        // - Arraylist
        List lista = new ArrayList<>();

        // agregar elemento
        lista.add("Hola");
        lista.add("Mundo");
        lista.add("!");
        // obtener elemento por indice
        lista.get(0);
        // cantidad de elementos
        lista.size();
        // quita elemento por indice
        lista.remove(3);

        for (Object elemento: lista)
        {
            System.out.println(elemento);
        }

        // - Linkedlist
        // Cada nodo tiene referencia de los proximos
        // Agil para ordenar, modificar y eliminar un objeto
        List<String> linkedList = new LinkedList();

        linkedList.add("1");
        linkedList.add("6");
        linkedList.add("3");
        linkedList.size();

        for (String numero : linkedList)
        {
            System.out.println("numero = " + numero);
        }

        // - Set
        // No se guardan de forma secuancial
        // Sin Indice, sin Get
        // No acepta valores duplicados
        Set<String> setPalabras = new HashSet<>();

        setPalabras.add("c");
        setPalabras.add("b");
        setPalabras.add("a");

        setPalabras.remove("b");

        for (String palabra: setPalabras)
        {
            System.out.println(palabra);
        }

        // Ejemplo con Objetos
        Set<Persona> personas = new HashSet<>();

        Persona p1 = new Persona("Pepito", "543545343");
        Persona p2 = new Persona("Manolo", "223545343");
        Persona p3 = new Persona("Silvia", "323545343");

        personas.add(p1);
        personas.add(p2);
        personas.add(p3);

        // - Treeset
        // Requiere implementar interfaz Comparable en clases creadas
        Set<String> treeSet = new TreeSet<>();

        // Map
        Map mapa = new HashMap<>();

        mapa.put(1,"Hola");
        mapa.put(2,"Mundo");
        mapa.put(3,new Persona("Sarasa","65654654"));
        mapa.put(4,"2");
        mapa.get(2);

        Set claves = mapa.keySet();
        // No se suele recorrer
        for (Object clave: claves)
        {
            mapa.get(clave);
        }
        mapa.size();




    }
}
