package cuadrado;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vcaruncho
 */
public class Sumatorio {
    public static void main(String[] args) {
        int [] datos = { 5, 7, 20 ,11};
        int suma = 0;
        for (int i:datos) {
            suma += i; 
        }
        System.out.println("La suma resultante es:" + suma);       
    }
}
