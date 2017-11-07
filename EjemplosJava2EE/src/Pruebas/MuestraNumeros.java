package Pruebas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author vcaruncho
 */
public class MuestraNumeros {
    public static void main(String[] args) {
        int mayor, menor;
        int n1 = 8;
        int n2 = 5;
        
        if (n1<n2) {
            menor = n1;
            mayor = n2;
       }
        else {
            menor = n2;
            mayor = n1;
        }
       for (int i=menor;i<=mayor; i++) {
           System.out.println("Número: " + i);
       }
                
    }
    
}
