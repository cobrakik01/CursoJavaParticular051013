/*
 * ::::::::::::: Estructuras de control :::::::::::::
 * :::::::::::::          if            :::::::::::::
 * Programa que determina entre dos numeros cual es el mayor
 */
package com.cbk.curso.estructurasdecontrol;

import java.util.Scanner;

/**
 *
 * @author cobrakik
 */
public class ejercicio02 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); // Se crea un objeto "teclado" de tipo Scanner para poder leer datos desde el teclado
        int n1, n2; // Se declaran las variables n2 y n2 que se leeran posteriormente
        System.out.print("Ingresa un numero: "); // Pide el primer numero
        n1 = teclado.nextInt(); // Lee el primer numero

        System.out.print("Ingresa un otro: "); // Pide el segundo numero
        n2 = teclado.nextInt(); // Lee el segundo numero

        // Una vez leidos y guardados los dos numeros se evaluan para determinar cual es el mayor

        if (n1 >= n2) { // si el valor de la variable n1 es mayor al de n2 entonces
            System.out.println("El numero mayor es: " + n1); // es mayor de n1
        } else { // si no
            System.out.println("El numero mayor es: " + n2); // es mayor de n2
        }
    }
}
