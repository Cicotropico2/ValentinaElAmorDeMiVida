
package javaapplication1;

import java.util.Scanner;

/**
Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. 
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        String frase;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        frase = entrada.nextLine().toLowerCase();
        System.out.println(frase);
        frase = frase.toUpperCase();
        System.out.println(frase);
        
    }
    
}
