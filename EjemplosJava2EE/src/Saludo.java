/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vcaruncho
 */
public class Saludo {
    public static void main(String[] args) {
        int hora = 24;
        if (hora<1 || hora >24) {
            System.out.println("Hora incorrecta");
        }
        if (hora>0 && hora <13) {
            System.out.println("Buenos días");
        }
        if (hora>14 && hora<19) {
            System.out.println("Buenas tardes");
        }
         if (hora>19 && hora<=24) {
            System.out.println("Buenas noches");
        }
        
    }
    
}
