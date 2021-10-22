package br.edu.infnet.polimorfismo;

public class Triangulo extends Forma {
    
    public Triangulo(int l, int a) {
        super(l, a);
    }
    
    @Override
    public int area() {
        return (getAltura() * getLargura()) / 2;
    }
}
