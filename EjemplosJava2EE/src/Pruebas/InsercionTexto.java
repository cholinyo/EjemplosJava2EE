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
public class InsercionTexto {
    public static void main(String[] args) {
        StringBuilder texto = new StringBuilder("Texto donde se insertan los espacios");
        int inicio=0;
        int posinsercion;
        while (inicio<texto.length()){
            posinsercion = texto.indexOf(" ",inicio);
            if (posinsercion !=-1) {
                texto.insert(posinsercion," ");
                inicio=posinsercion + 2 ;
                
            }
            else {
                break;
            }
            
        }
        System.out.println(texto.toString());
    }
    
}
