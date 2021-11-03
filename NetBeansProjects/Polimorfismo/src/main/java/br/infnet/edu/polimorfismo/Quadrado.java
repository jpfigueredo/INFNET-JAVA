package br.infnet.edu.polimorfismo;

public class Quadrado {
    
    public Quadrado(int lado) {
        super(lado);
    }
    
    @Override
    public int area() {
        return getLargura() * 2;
    }
    
}
