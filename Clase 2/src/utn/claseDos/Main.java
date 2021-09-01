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

/*
5. Cree una interface llamada ICalcular, que tenga los siguientes métodos: ∙
sumar
∙ restar
∙ multiplicar
∙ dividir throw MiExcepcion
Todos los métodos reciben dos parámetros del tipo Numbre y retornan un Double. El
método dividir debe lanzar una excepción si se intenta dividir por 0.
Cree una clase llamada calculadora la cual implemente la interface anterior. En el método
main se deben mostrar por consola todos los métodos disponibles y un número. El
usuario debe ingresar la operación deseada y los valores requeridos por el método. El
sistema debe mostrar por consola el resultado. Utilice la estructura switch para la
ejecución de los métodos.
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
        System.out.println(palabra.contains("hOlA"));
        ///
        System.out.println("Ingrese un numero");
        int numero = scanner.nextInt();
        Integer iObjeto = Integer.valueOf(numero);
        System.out.println("iObjeto = " + iObjeto);
        int numeroDos = iObjeto.intValue();
        Persona persona = new Persona();
        persona.esMayor();
    }
}
