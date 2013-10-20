/*
 * ::::::::::::: Estructuras de control :::::::::::::
 * :::::::::::::          switch            :::::::::::::
 * Programa que determina si el usuario es o no mayor de edad.
 */
package com.cbk.curso.estructurasdecontrol;

import java.util.Scanner;

/**
 *
 * @author cobrakik
 */
public class ejercicio03 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); // Se crea un objeto "teclado" de tipo Scanner para poder leer datos desde el teclado
        int opcion; // Se declara la variable opcion para posteriormente asignarle el valor que se leera desde el teclado
        System.out.println("1. Platillos");
        System.out.println("2. Bebidas");
        System.out.println("3. Pedir cuenta");
        System.out.print("Eliga una opcion: ");
        opcion = teclado.nextInt();
        
        switch(opcion){
            case 1:
                System.out.println(":::: Platillos ::::");
                System.out.println("Enchiladas");
                System.out.println("Posole");
                break;
            case 2:
                System.out.println(":::: Bebidas ::::");
                System.out.println("Agua de jamaica");
                System.out.println("Colcacola");
                break;
            case 3:
                System.out.println("Cuenta a pagar $120 pesos");
                break;
            default:
                System.out.println("Esta opcion no existe en el menú");
                break;
        }
    }
}