/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Reverso;

import java.util.Scanner;

/**
 *
 * @CRISTIAN ESTRADA
 */
public class Inverso_doWhile {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String cadena="";
        System.out.println("Bucle do while");
        System.out.print("ESCRIBE UNA CADENA DE CARACTERES = ");
        cadena= leer.nextLine();
       
       
        int longitud =(int) cadena.length()-1;
         String inverso=" ";
        
        do {
            inverso += cadena.charAt(longitud);
            longitud--;
        } while (longitud>=0);
       
        System.out.println("SU INVERSO ES = "+inverso);
        
    }
    
}
