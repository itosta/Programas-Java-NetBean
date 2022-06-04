/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.itosta.ej10_insertarno;

import java.util.Scanner;

/**
 *
 * @author Itosta
 */
public class Ej10_InsertarNo {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        
        System.out.println("Ingresa un numero mayor a 0: ");
        int n = sn.nextInt(); //Numero
        int c = 0; //Contador
        int n4 = 0; //Numero 4
        
        while(n!=-1){
                           
            c++;
            n = sn.nextInt();
            
            if(n==4){
                n4++;
            }
        }
        
        System.out.println("The End \n Total de numeros correctos: " + c +
                                   "\n Total de numero 4: " + n4);
        
    }
}
    