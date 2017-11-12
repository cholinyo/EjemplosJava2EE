/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

import java.util.Hashtable;
import java.util.Scanner;
import java.util.*;

/**
 *
 * @author vcaruncho
 */
public class Contactos {
    public static void main(String[] args) {
        Hashtable<Integer, String> lista = new Hashtable<Integer,String>();
        int opcion;
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        do {
            System.out.println("1. Añadir contacto");
            System.out.println("2. Eliminar contacto");
            System.out.println("3. Mostrar contactos");
            System.out.println("4. Salir");
            opcion=sc.nextInt();
            String nombre;
            Integer dni;
            switch (opcion) {
                case 1:
                    System.out.println("Introduce el nombre");
                    nombre = sc.next();
                    System.out.println("Introduce el DNI");
                    dni = sc.nextInt();
                    guardarContacto(nombre,dni,lista);
                    break;
                case 2:
                    System.out.println("Introduce el DNI");
                    dni = sc.nextInt();
                    eliminarContacto(dni,lista);
                    break;
                case 3:
                    mostrarContactos(lista);
                    break;   
            }
            
        }
        while (opcion!=4);
    }
    static void guardarContacto (String valor, Integer clave, Hashtable<Integer,String> lista) {
        if (!lista.containsKey(clave)){
            lista.put(clave, valor);
        }            
    }
    static void eliminarContacto (Integer clave, Hashtable<Integer,String> lista) {
        if (!lista.containsKey(clave)){
            lista.remove(clave);
        }            
    }
    static void mostrarContactos(Hashtable<Integer,String> lista) {
        System.out.println("Los contactos son:\n");
        Enumeration<Integer> claves=lista.keys();
        while (claves.hasMoreElements()) {
            Integer k=claves.nextElement();
            System.out.println(k.toString()+"-"+lista.get(k));
        }
        
    }
        
    
   
}
