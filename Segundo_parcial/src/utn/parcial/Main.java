package utn.parcial;

import java.lang.reflect.InvocationTargetException;

public class Main {

    static MiHilo miHilo = new MiHilo();

    public static void main(String[] args)
    {
        Auto auto = new Auto("Volkswagen","XXS", "2019");
        ManejoStringTest manejoStringTest = new ManejoStringTest();
        test();

        try
        {
            Thread t1 = new Thread(miHilo);
            t1.start();

            Thread.sleep(1000L);
            synchronized (miHilo)
            {
                System.out.println("Notify");
                miHilo.notify();
            }
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }

    public static void test()
    {


    }
}
