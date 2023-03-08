/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.

 */
public class Ejercicio2Clase2 {
    public static void main(String[] args) {
        String nombre;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresar nombre: ");
        nombre = entrada.nextLine();
        System.out.println("el nombre es: "+nombre);
        
        
    }
    
}
