/*
 * ::::::::::::: Estructuras de control :::::::::::::
 * :::::::::::::         if else        :::::::::::::
 * Programa que determina si el usuario es o no mayor de edad.
 */
package com.cbk.curso.estructurasdecontrol;

import java.util.Scanner;

/**
 *
 * @author cobrakik
 */
public class ejercicio01 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); // Se crea un objeto "teclado" de tipo Scanner para poder leer datos desde el teclado
        int edad; // Se declara la variable edad para posteriormente asignarle el valor que se leera desde el teclado
        System.out.print("Ingresa tu edad: "); // imprime el mensaje para pedir la edad
        edad = teclado.nextInt(); // Lee la edad desde el teclado y lo asigna a la variable "edad"

        if (edad >= 18) { // si "edad" es mayor o igual a 18 entonces
            System.out.println("Eres mayor de edad!!!"); // es mayor de edad
        } else { // si no
            System.out.println("Eres menor de edad!!!"); // es menor de edad
        }
    }
}
