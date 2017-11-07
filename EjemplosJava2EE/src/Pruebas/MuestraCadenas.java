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
public class MuestraCadenas {
    public static void main(String[] args) {
        String resultado="";
        int mayor=0;
        for(String s:args){
            if (s.length()>mayor){
                mayor=s.length();
                resultado=s;
            }
        }
        System.out.println("La cadena más larga es: " + resultado);
    }
    
}
