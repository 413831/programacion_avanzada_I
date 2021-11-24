package utn.clase;

public class MiHilo implements Runnable
{
    public Integer contador = 0;
    @Override
    public void run()
    {
        for (int i = 0; i < 1000; i++)
        {
            System.out.println("Se está ejecutando el hilo: " + Thread.currentThread().getName() + " - " + i);
            // Evalua el Hilo contra otros con la misma prioridad
            //Thread.yield();

            //int j = contador + 1;
            //contador = j;
            synchronized (contador)
            {
                contador = contador + 1;
            }
            System.out.println("contador = " + contador);

            try
            {
                /*
                if(Thread.interrupted())
                {
                    System.out.println("Interrupted");
                }
                */

                synchronized (this)
                {
                    System.out.println("Se detuvo " + Thread.currentThread().getName());
                    this.wait();
                }
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
                return;
            }
        }
    }

    public synchronized void contar()
    {
        contador++;
    }
}
