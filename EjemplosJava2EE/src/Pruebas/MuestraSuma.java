/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;
import static java.lang.Math.*;



/**
 *
 * @author vcaruncho
 */
public class MuestraSuma {
    public static void main(String[] args) {
        int n1=(int)floor(random()*100);
        int n2=(int)floor(random()*100);
        int suma=0;
        for (int i=min(n1,n2);i<(max(n1,n2));i++) {
            suma+=i;
        }
        System.out.println("La suma de los números vale: " + suma);
    }
    
}
