package utn.ejercicio;

import utn.ejercicio.Clases.*;

public class Main {

    public static void main(String[] args)
    {
        Alumno alumno = new Alumno("Pepito", "Gomez","31821","Tecnicatura en Seguridad e Higiene", new Ingreso());

        // Estado inicial - Ingreso
        System.out.println(alumno.getEstado().getClass());

        // Regular
        Contexto contexto = new Contexto(alumno.getEstado());
        contexto.ejecutarAccion(alumno);

        System.out.println(alumno.getEstado().getClass());

        // Irregular
        ((Regular) alumno.getEstado()).setSiguienteEstado(new Irregular());
        contexto.setEstado(alumno.getEstado());
        contexto.ejecutarAccion(alumno);

        System.out.println(alumno.getEstado().getClass());

        // Regular
        ((Irregular) alumno.getEstado()).setSiguienteEstado(new Regular());
        contexto.setEstado(alumno.getEstado());
        contexto.ejecutarAccion(alumno);

        System.out.println(alumno.getEstado().getClass());

        // Recibido
        ((Regular) alumno.getEstado()).setSiguienteEstado(new Recibido());
        contexto.setEstado(alumno.getEstado());
        contexto.ejecutarAccion(alumno);

        System.out.println(alumno.getEstado().getClass());
    }
}
