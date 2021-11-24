package br.edu.infnet.polimorfismo;

public class Retangulo extends Forma {
    
    public Retangulo(int l, int a) {
        super(l, a);
    }
    
    @Override
    public int area() {
        return getAltura() * getLargura();
    }
    
}
