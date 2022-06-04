/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.itosta.ej4_parinpar;

import java.util.Scanner;

/**
 *
 * @author Itosta
 */
public class Ej4_ParInpar {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        
        System.out.println("Ingrese un numero:");
        int n = sn.nextInt();
        
        if (n%2==0){
            System.out.print("Par");
        }
        else {
            System.out.print("Inpar");
        }
    }
}
