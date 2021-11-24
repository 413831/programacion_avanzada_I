package utn.clase;

public class Main {

    public static void main(String[] args) throws InterruptedException
    {
        MiHilo miHilo = new MiHilo();
        Thread thread1 = new Thread(miHilo, "T1");
        Thread thread2 = new Thread(miHilo, "T2");
        Thread thread3 = new Thread(miHilo, "T3");

        // Se puede configurar la prioridad de cada Hilo
        thread1.setPriority(3);
        thread2.setPriority(2);
        thread3.setPriority(1);

        // Con el start() se ejecuta el run() del Hilo
        thread1.start();
        // Con el metodo JOIN se unen los hilos entre sí
        //thread1.join();
        System.out.println(Thread.currentThread().getName());
        thread2.start();
        //thread2.join();
        thread3.start();
        //thread2.join();
        System.out.println("Se terminó el proyecto");

        Thread.sleep(1000);
        synchronized (miHilo)
        {
            System.out.println("Despierto hilo");
              miHilo.notify();
             // miHilo.notifyAll();
        }

        //thread1.interrupt();
        //thread2.interrupt();
        //thread3.interrupt();
    }
}
