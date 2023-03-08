
package javaapplication1;

import java.util.Scanner;

/**
Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt().

 */
public class Clase5 {
    public static void main(String[] args) {
        int num;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese número: ");
        num = entrada.nextInt();
        System.out.println("El doble es: "+num * 2+ " y el triple es: "+num * 3 + " Y la raiz cuadrada del num es: "+Math.sqrt(num));
        
    }
    
}
