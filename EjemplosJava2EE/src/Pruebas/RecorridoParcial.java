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
public class RecorridoParcial {
    public static void main(String[] args) {
        int[] datos = {60 , 20 ,-5 ,8 ,9};
        int n = 0;
        while (n<datos.length && datos[n]>=0) {
            System.out.println("dato" + datos[n]);
            n ++;
            }
        System.out.println("numeros recuperados: " + n);
    }
    
}
