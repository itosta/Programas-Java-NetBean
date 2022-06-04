/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.itosta.ejercicio2_ascii;

import java.util.Scanner;

/**
 *
 * @author Itosta
 */
public class Ejercicio2_ASCII {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        
        System.out.println("Ingrese un numero: ");
        int n = sn.nextInt();
        
        char caracter = ((char)n);
        
        System.out.println("Numero: " + n + "\n ASCII: " + caracter);
    }
}
