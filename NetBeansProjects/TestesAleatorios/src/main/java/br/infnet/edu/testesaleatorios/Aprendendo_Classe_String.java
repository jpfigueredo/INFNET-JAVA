package br.infnet.edu.testesaleatorios;

public class Aprendendo_Classe_String {

    public static void main(String[] args) {
        
        String nome = "João Figueredo";
        
        System.out.println("Seu nome é: "+nome);
        System.out.println("A primeira letra é: "+ nome.charAt(0));
        
        String nomeUp = nome.toUpperCase();
        System.out.println("Seu nome com as letras maiúscula é: " + nomeUp);
        
        String nomeLow = nome.toLowerCase();
        System.out.println("Seu nome com as letras minúsculas é: " + nomeLow);
        
        if(nome.equals(nomeUp)){
            System.out.println("nome == nomeUp");
        }else{
            System.out.println("nome != nomeup");
        }
        
        if(nome.equalsIgnoreCase(nomeUp)){
            System.out.println("nome == nomeUp");
        }else{
            System.out.println("nome != nomeup");
        }
        
        System.out.println("O Index/Posição da primeira String do atributo nome é: "+ nome.indexOf("J"));
        System.out.println("O Index/Posição da última String do atributo nome é: "+ nome.lastIndexOf("J"));
        
        System.out.println("Exibição de substring: "+nome.substring(5));
        
        
    }
    
}
