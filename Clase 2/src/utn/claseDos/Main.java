package utn.claseDos;

import java.util.Scanner;

/**
 * @author aleksei
 * @version 1.0
 */

/*
3. Cargar un String por teclado e implementar los siguientes métodos:
∙ Imprimir la cantidad de caracteres que posee.
∙ Imprimir la primera mitad de los caracteres de la cadena.
∙ Imprimir el último caracter.
∙ Imprimirlo en forma inversa.
∙ Imprimir cada caracter del String separado con un guión.
∙ Implementar un método que verifique si la cadena posee la palabra “hola”
(indistintamente si posee letras mayúsculas o minúsculas)
 */

public class Main {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String palabra;
        String ejemplo = "matias";

        System.out.println("Ingrese una palabra: ");
	    palabra = scanner.nextLine();
        
        if(palabra.isEmpty())
        {
            System.out.println(ejemplo);
        }

        if("matias".equals(ejemplo))
        {
            System.out.println("string = " + ejemplo);
        }
        /// Ejercicio 3
        System.out.println(ManejoString.mitadTexto(palabra));
        System.out.println(ManejoString.ultimoCaracter(palabra));
        System.out.println(ManejoString.invertirTexto(palabra));
        System.out.println(ManejoString.marcarCaracteres(palabra,'-'));
        System.out.println(ManejoString.encontrarPalabra(palabra,"hoLa"));
    }
}
