/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.itosta.ej9_x;

import java.util.Scanner;

/**
 *
 * @author Itosta
 */
public class Ej9_X {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        
        System.out.println("Inserta un numero entero mayor que 1: ");
        int n;
        do{
            n = sn.nextInt();
            
            if(n <= 1){
                System.out.println("Error. Ingresa un numero mayor que 1");
            }            
        }       
        while(n <= 1);
            
        int suma = 0;
            
        for (int c = 1;c <= n; c++){
        System.out.println(c);
        
            suma = suma + c;
        }
            
            
        System.out.println("La suma es: " + suma);
    }
}
