package Reverso;

import java.util.Scanner;


/**
 *
 * @CRISTIAN ESTRADA
 */
public class Inverso_For {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String cadena;
        String inverso = " ";
        System.out.println("Bucle for");
        System.out.print("ESCRIBE UNA CADENA DE CARACTERES = ");
        cadena = leer.nextLine();

        for (int contador = cadena.length() - 1; contador >= 0; contador--) {

            inverso += cadena.charAt(contador);
            
        }

        System.out.println("SU INVERSO ES = " + inverso);

    }

}
