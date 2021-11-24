package utn.parcial;

import java.util.ArrayList;
import java.util.List;

public class ClasePrincipal
{
    List<String> lista = new ArrayList<>();

    public static void main(String[] args)
    {
        ClasePrincipal c = new ClasePrincipal();
        for (int i = 0; i < 100; i++)
        {
            c.lista.add("Prueba"+i);
        }
        MiHilo miHilo = new MiHilo(c);
        Thread t = new Thread(miHilo);
        Thread t2 = new Thread(miHilo);
        t.start();
        t2.start();
    }

    public void mostrarInfo(String nombre, String proceso)
    {
        System.out.println("El Hilo " + nombre + " proceso " + proceso);
    }

    public String procesar()
    {
        String proceso = "";
        int i = lista.size();
        proceso = this.lista.get(i-1);
        this.lista.remove(i-1);
        return proceso;
    }
}
