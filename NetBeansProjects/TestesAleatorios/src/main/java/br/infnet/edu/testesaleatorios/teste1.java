package br.infnet.edu.testesaleatorios;

public class teste1 {
    
    
    public class Garrafa{
        
        public void Finalidade(){
                System.out.println("Garrafa genérica");
        }
        
    }
    
    public class GarrafaTermica extends Garrafa{
        
        @Override
        public void Finalidade(){
                System.out.println("Manter a temperatura");
        }
        
    }
}
