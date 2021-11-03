/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.infnet.edu.polimorfismo;

/**
 *
 * @author wasabi
 */
public abstract class Forma {
    private int largura, altura;
    
    public Forma() { }
    
    public Forma(int l) {
        largura = l;
    }
    
    public Forma(int l, int a) {
        largura = l;
        altura = a;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public abstract int area();
}