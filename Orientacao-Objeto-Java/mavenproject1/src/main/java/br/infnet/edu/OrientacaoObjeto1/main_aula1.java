/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.infnet.edu.OrientacaoObjeto1;

/**
 *
 * @author wasabi
 */
public class main_aula1 {

    public static void main(String[] args) {
        
        Conta conta1 = new Conta();
        
        conta1.setNome("JP");
        conta1.setNum(1);
        conta1.setSaldo(100.00);
        
        
        System.out.println(conta1.getNum() + " " + conta1.getNome() + " " + conta1.getSaldo());
        
        
        Conta conta2 = new Conta();
        
        conta2.setNome("LP");
        conta2.setNum(2);
        conta2.setSaldo(200.00 + 10);
        
        System.out.println(conta2.getNum() + " " + conta2.getNome() + " " + conta2.getSaldo());
        
        
        Conta conta3 = new Conta(3,"Daniel",300);
        System.out.println(conta3.getNum() + " " + conta3.getNome() + " " + conta3.getSaldo());
        
        
        System.out.println(conta3);
        
        double valor = -100;
        System.out.println(conta3.creditar(valor));
        System.out.println(conta3);
    }
}

