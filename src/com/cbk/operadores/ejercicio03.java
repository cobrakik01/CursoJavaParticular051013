/*
 * :::::::::::::::::: Operadores aritmeticos ::::::::::::::::::
 * Programa que lee dos enteros y realiza la suma
 */
package com.cbk.operadores;

import java.util.Scanner;

/**
 *
 * @author cobrakik
 */
public class ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);// Se crea un objeto de tipo escaner para poder leer datos
        int numero1, numero2, suma; // Se declaran todas las variables que se van a ocupar durante el programa
        System.out.print("Ingresa el primer numero: "); // imprime en pantalla "Ingresa el primer numero: "
        numero1 = teclado.nextInt(); // con el objeto sc lee un entero con el metodo nextInt();
        System.out.print("Ingresa el segundo numero: ");// imprime en pantalla "Ingresa el segundo numero: "
        numero2 = teclado.nextInt();// con el objeto sc lee un entero con el metodo nextInt();

        suma = numero1 + numero2; // realiza la suma de la variable numero1 y numero2, el resultado se almacena en la variable suma

        System.out.println("La suma de los numeros es: " + suma); // imprime el resultado de la suma anterior
    }
}
