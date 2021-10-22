package br.edu.infnet.polimorfismo;

public class Formas {
    public static void main(String[] args) {

/*
        Retangulo ret = new Retangulo(2, 3);
        System.out.println(ret.area());
        
        Quadrado qua = new Quadrado(2);
        System.out.println(qua.area());
        
        Triangulo tri = new Triangulo(3, 7);
        System.out.println(tri.area());
*/

        Forma forma;
        
        forma = new Retangulo(2, 3);
        System.out.println(forma.area());
        forma = new Quadrado(2);
        System.out.println(forma.area());
        forma = new Triangulo(3, 7);
        System.out.println(forma.area());
    }
}
