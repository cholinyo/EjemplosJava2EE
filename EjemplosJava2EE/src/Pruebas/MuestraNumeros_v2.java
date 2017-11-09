/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;
import java.io.*;
import static java.lang.Math.*;

/**
 *
 * @author vcaruncho
 */
public class MuestraNumeros_v2 {
    public static void main(String[] args) {
        Console consola=System.console();
        consola.printf("Introduce un numero:");
        int n1=Integer.parseInt(consola.readLine());
        consola.printf("Introduce otro numero:");
        int n2=Integer.parseInt(consola.readLine());
        consola.printf("El mayor de los numeros es %ld y el menos es %2d", max(n1,n2) , min(n1,n2));
        
    }    
}
