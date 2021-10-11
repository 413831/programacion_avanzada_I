package utn.clase;

import java.util.Locale;

public class Main {

    public static void main(String[] args)
    {
        System.out.println(codificar("aAaBbccccaab"));
    }

    public static String codificar(String texto)
    {
        // “aAaBbccccaab”
        // “a3b2c4a2b1”
        String textoCodificado = "";
        String ultimoCaracter = "";
        int cantidadCaracteres = 0;

        for (int i = 0; i < texto.length() ; i++)
        {
            String caracter = String.valueOf(texto.charAt(i));

            if(!caracter.equalsIgnoreCase(ultimoCaracter))
            {
                textoCodificado = textoCodificado.concat(caracter.toLowerCase(Locale.ROOT));
                cantidadCaracteres = 1;
                textoCodificado = textoCodificado.concat(String.valueOf(cantidadCaracteres));
            }
            else if(cantidadCaracteres >= 1)
            {
                cantidadCaracteres++;
                int indiceCaracter = textoCodificado.lastIndexOf(caracter.toLowerCase(Locale.ROOT));
                textoCodificado = textoCodificado.substring(0,indiceCaracter + 1);
                textoCodificado = textoCodificado.concat(String.valueOf(cantidadCaracteres));
                System.out.println(cantidadCaracteres);
            }
            ultimoCaracter = caracter;
        }
        return textoCodificado;
    }
}
