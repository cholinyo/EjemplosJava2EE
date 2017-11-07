/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

/**
 *
 * @author vcaruncho
 */
public class Circulo {
    private int radio;
    
    public Circulo(int r) {
        radio=r;
}
    public double area() {
        return radio*radio*3.1416;
    }
    public double perimetro() {
        return 2*3.1416*radio;
    }
    
}
