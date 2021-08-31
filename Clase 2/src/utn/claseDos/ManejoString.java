package utn.claseDos;

import java.util.Locale;

public class ManejoString
{
    public static int cantidadCaracteres(String texto)
    {
        return texto.length();
    }

    public static String mitadTexto(String texto)
    {
        return texto.substring(0,texto.length() / 2);
    }

    public static char ultimoCaracter(String texto)
    {
        return texto.charAt(texto.length() - 1);
    }

    public static String invertirTexto(String texto)
    {
        String auxiliar = "";

        for (int i = texto.length() - 1; i >= 0; i-- )
        {
            auxiliar = auxiliar.concat(String.valueOf(texto.charAt(i)));
        }
        return auxiliar;
    }

    public static String marcarCaracteres(String texto, char separador)
    {
        String auxiliar = "";

        for (int i = 0; i < texto.length(); i++ )
        {
            auxiliar = auxiliar.concat(String.valueOf(texto.charAt(i)));
            auxiliar = auxiliar.concat(String.valueOf(separador));
        }
        return auxiliar;
    }

    public static boolean encontrarPalabra(String texto, String palabra)
    {
        int posicionLetra = 0;

        if(!texto.isEmpty() || !texto.isBlank())
        {
            for (int i = 0; i < texto.length();i++)
            {
                String letraTexto = String.valueOf(texto.charAt(i));
                String letraBuscada = String.valueOf(palabra.charAt(posicionLetra));

                if(letraTexto.equalsIgnoreCase(letraBuscada))
                {
                    posicionLetra++;
                }

                if(posicionLetra == palabra.length())
                {
                    return true;
                }
            }
        }
        return false;
    }
}
