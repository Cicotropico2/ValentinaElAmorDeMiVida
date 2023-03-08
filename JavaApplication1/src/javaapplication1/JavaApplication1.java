
package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {

/* Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos. El programa deberá después mostrar el resultado de la suma*/
    public static void main(String[] args) {
        int n1,n2,suma;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa dos numeros: ");
        n1 = entrada.nextInt();
        n2 = entrada.nextInt();
        suma = n1 + n2;
        System.out.println("La suma es: "+suma);
        
        
    
    }
    
}
