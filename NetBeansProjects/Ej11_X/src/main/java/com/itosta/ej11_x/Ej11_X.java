/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.itosta.ej11_x;

import javax.swing.JOptionPane;

/**
 *
 * @author Itosta
 */
public class Ej11_X {

    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog(null, "Escribe una cadena: ", "Titulo", JOptionPane.INFORMATION_MESSAGE);
        texto = texto.toLowerCase();//Convierte a minuscula
        
        char vocales[] = {'a','e','i','o','u'};
        
        char caracterActual;
        int contadorVocales = 0;
        boolean esVocal;
        
        for (int i=0;i<texto.length();i++){
            
            caracterActual = texto.charAt(i);
            esVocal = false;
            
            for (int j=0;j<vocales.length && !esVocal;j++){
            
                if(vocales[j]==caracterActual){
                    contadorVocales++;
                    esVocal=true;
                }
            }
        }
        JOptionPane.showConfirmDialog(null, "El total de vocales es de: " + contadorVocales, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}
