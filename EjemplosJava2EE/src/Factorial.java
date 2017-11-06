/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vcaruncho
 */
public class Factorial {
    public static void main(String[] args) {
        int num = 4 ;
        long result = 1 ;
        if (num>1) {
            for (int i=num;i>0;i--) {
                result *=i;
            }
        }
        System.out.println("El factrorial de " + num + " es:" + result);
    }
    
}
