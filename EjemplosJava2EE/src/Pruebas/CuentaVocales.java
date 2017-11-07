/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

/**
 *
 * @author vcaruncho
 */
public class CuentaVocales {
    public static void main(String[] args) {
        String cad="cadena de prueba";
        int contador=0;
        for (int i=0;i<cad.length();i++){
            switch (cad.charAt(i)){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                contador++;
                            
            }
        }
        System.out.println("Número de vocales = " + contador);
    }
    
}
