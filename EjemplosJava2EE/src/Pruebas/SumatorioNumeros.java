/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;
import java.util.*;
/**
 *
 * @author vcaruncho
 */
public class SumatorioNumeros {
    public static void main(String[] args) {
        String lista="5,20,12,4";
        Scanner sc = new Scanner(lista);
        sc.useDelimiter(",");
        int suma=0;
        while (sc.hasNext()) {
            suma +=sc.nextInt();
        }
        System.out.println("La suma es: " + suma);
    }
    
}
