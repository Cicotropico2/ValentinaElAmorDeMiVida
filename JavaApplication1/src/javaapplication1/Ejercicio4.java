/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        float C,F;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese grados Celsius: ");
        C = entrada.nextFloat();
        F = 32 + (9 * C / 5);
        System.out.println("En Fahrenheit es: "+F);
                
                
                
        
        
        
    }
    
}
