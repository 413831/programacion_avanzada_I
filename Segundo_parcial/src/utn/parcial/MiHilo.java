package utn.parcial;

public class MiHilo implements Runnable
{
    ClasePrincipal c;

    public MiHilo()
    {

    }
    public MiHilo(ClasePrincipal c)
    {
        this.c = c;
    }

    @Override
    public void run()
    {
        /*
        while (c.lista.size() > 0)
        {
            String proceso = c.procesar();
            c.mostrarInfo(Thread.currentThread().getName(), proceso);
        }

         */
        try
        {
            synchronized (this)
            {
                System.out.println("bloqueado");
                this.wait();
                System.out.println("desbloqueado");
            }

        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
