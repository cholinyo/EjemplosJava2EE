/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;
import java.util.*;
import java.io.*;
/**
 *
 * @author vcaruncho
 */
public class GestionPrecios1 {
    public static void main(String[] args) {
        ArrayList<Double> precios=new ArrayList<Double>();
        String opcion;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Elegir una opcion:\n");
            System.out.println("1.Nuevo precio:\n");
            System.out.println("2.Precio medio:\n");
            System.out.println("3.Precio máximo:\n");
            System.out.println("4.Precio mínimo:\n");
            System.out.println("5.Mostrar todos los precios:\n");
            System.out.println("6.Salir:\n");
            opcion=sc.next();
            
            switch(Integer.parseInt(opcion)){
                case 1:
                    double pr;
                    System.out.println("Introduce precio");
                    pr=sc.nextDouble();
                    grabaPrecio(pr,precios);
                    break;
                case 2:
                    muestraMedia(precios);
                    break;
                case 3:
                    muestraMaximo(precios);
                    break;
                case 4:
                    muestraMinimo(precios);
                    break;
                case 5:
                    muestraTodos(precios);
                    break;
                      
            }
        }
        while(!opcion.equals("6"));
    }
    static void grabaPrecio(double d,ArrayList<Double> precios){
        precios.add(d);
        System.out.println("Nuevo precio grabado!\n");
    }
    static void muestraMedia(ArrayList<Double> precios){
        double media=0.0;
        for (Double pr:precios){
            media+=pr;
            
        }
        media/=precios.size();
        System.out.println("Precio medio= " + media);
        
    }
    static void muestraMaximo (ArrayList<Double> precios){
        double maximo;
        maximo = precios.get(0);
        
        for (Double pr:precios) {
            double aux;
            aux=pr;
            if (aux>maximo) {
                maximo=aux;
            }
            
        }
        System.out.println("El valor máximo es: " + maximo);
        
    }
    
    static void muestraMinimo (ArrayList<Double> precios) {
        double minimo;
        minimo = precios.get(0);
        
        for (Double pr:precios) {
            double aux;
            aux=pr;
            if (aux<minimo) {
                minimo=aux;
            }
            
        }
        System.out.println("El valor mínimo es: " + minimo);
    }
    static void muestraTodos(ArrayList<Double> precios) {
        for(int i=0;i<precios.size();i++){
            System.out.println(precios.get(i) + "|");
        }
    }
}
