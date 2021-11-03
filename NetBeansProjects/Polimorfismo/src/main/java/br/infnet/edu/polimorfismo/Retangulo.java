/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.infnet.edu.polimorfismo;

/**
 *
 * @author wasabi
 */
public class Retangulo extends Forma {
    
    public Retangulo(int l, int a) {
        super(l, a);
    }
    
    @Override
    public int area() {
        return getAltura() * getLargura();
    }
}
