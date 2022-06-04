/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.itosta.ej5_mayormenor;

import java.util.Scanner;

/**
 *
 * @author Itosta
 */
public class Ej5_MayorMenor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el primero numero: ");
        int n1 = sc.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int n2 = sc.nextInt();
        
        if (n1 >= n2){
            if (n1 == n2){
                System.out.println("Los numeros son iguales." );
            }
            else{
                System.out.println("El numero mayor es: " + n1 );
            }
        }
        else {
            System.out.println("El numero mayor es: " + n2 );
        }
    }
}
