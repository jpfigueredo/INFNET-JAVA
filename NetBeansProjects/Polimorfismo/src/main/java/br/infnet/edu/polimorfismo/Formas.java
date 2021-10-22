package br.infnet.edu.polimorfismo;

public class Formas {
    public static void main(String[] args) {
        /*
        Retangulo ret = new Retangulo(2,3);
        System.out.println(ret.area());
        
        Quadrado qua = new Quadrado(2);
        System.out.println(qua.area());
        
        Triangulo tri = new Triangulo(3,7);
        System.out.println(tri.area());
        */
        
        // POLIMORFISMO DINÂMICO -> 
        //     Usa sobrescrita pra fazer a classe se comportar de acordo com o que for dado.
        //     Ele identifica a forma em tempo de execuçãos
        Forma forma;
        forma = new Retangulo(2,3);
        System.out.println(forma.area());
        forma = new Quadrado(2);
        System.out.println(forma.area());
        forma = new Triangulo(3,7);
        System.out.println(forma.area());
        
    }
    
}
