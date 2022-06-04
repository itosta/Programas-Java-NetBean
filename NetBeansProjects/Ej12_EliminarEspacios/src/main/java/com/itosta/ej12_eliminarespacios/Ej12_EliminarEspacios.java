/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.itosta.ej12_eliminarespacios;
import javax.swing.JOptionPane;

public class Ej12_EliminarEspacios {

    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog(null, "Escribe una cadena: ", "Titulo", JOptionPane.INFORMATION_MESSAGE);
        
        char caracterActual;
        String txtEspacio="";
        
        for (int i=0;i<texto.length();i++){
            
            caracterActual = texto.charAt(i);
            
            if(caracterActual!=' '){
                txtEspacio+=caracterActual;
            }
            
        }
        JOptionPane.showConfirmDialog(null, txtEspacio, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}
