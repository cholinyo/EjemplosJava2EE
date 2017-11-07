/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;
import figuras.Circulo;
/**
 *
 * @author vcaruncho
 */
public class Cliente {
    public static void main(String[] args) {
        int radio=Integer.parseInt(args[0]);
        Circulo c=new Circulo(radio);
        System.out.println("El area vale: " + c.area());
         System.out.println("El perimetro vale: " + c.perimetro());
    }
    
}
