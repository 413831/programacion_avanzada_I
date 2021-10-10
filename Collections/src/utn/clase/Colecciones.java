package utn.clase;

import java.util.*;

public class Colecciones
{
    public static void TestArrayList()
    {
        List lista = new ArrayList<>();

        // agregar elemento
        lista.add(123);
        lista.add(2);
        lista.add(7);
        lista.add(1);
        lista.add(4);
        lista.add(10);
        // obtener elemento por indice
        lista.get(0);
        // cantidad de elementos
        lista.size();
        // quita elemento por indice
        lista.remove(3);
         Collections.sort(lista);

        // Lectura de elementos con foreach
        for (Object elemento: lista)
        {
            System.out.println(elemento);
        }
        //FIXME conflicto entre sort e iterador
        // Para ordenar en orden inverso
        Comparator<Integer> comparador = Collections.reverseOrder();
        Collections.sort(lista,comparador);
        // Lectura de elementos con while utilizando iterador
        Iterator iterador = lista.iterator();
        // Contains
        System.out.println("Contains: " + lista.contains(2));
        // Lectura de elementos con iterador
        while(iterador.hasNext())
        {
            Integer elemento = (int) iterador.next();
            System.out.println("elemento = " + elemento);
        }
    }

    public static void TestLinkedList()
    {
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
    }

    public static void TestHashSet()
    {
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
    }

    public static void TestTreeSet()
    {
        // TODO Agregar ejemplos
        // Requiere implementar interfaz Comparable en clases creadas
        Set<String> treeSet = new TreeSet<>();
    }

    public static void TestHashMap()
    {
        Map mapa = new HashMap<>();

        mapa.put(1,"Hola");
        mapa.put(2,"Mundo");
        mapa.put(3,"88");
        mapa.put(4,"2");
        mapa.get(2);

        Set claves = mapa.keySet();
        // No se suele recorrer
        for (Object clave: claves)
        {
            mapa.get(clave);
        }
        mapa.size();
        // Alternativa con iterador
        // Se recorren las claves con iterador para luego obtener el valor
        for (Iterator iteradorMap = mapa.keySet().iterator(); iteradorMap.hasNext() ; )
        {
            int s = (int) iteradorMap.next();
            String s1 = (String) mapa.get(s);
            System.out.println("s1 = " + s1);
        }
    }
}
