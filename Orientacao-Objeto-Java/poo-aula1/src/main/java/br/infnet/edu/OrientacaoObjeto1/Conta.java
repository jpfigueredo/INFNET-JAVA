/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.infnet.edu.OrientacaoObjeto1;

/**
 *
 * @author wasabi
 */
public class Conta {
    private int num;
    private String nome;
    private double saldo;

    public Conta(){
        
    }
    
    public Conta(int num, String nome, double saldo){
        this.num = num;
        this.nome = nome;
        this.saldo = saldo;
    }
    
    public void setNum(int num){
        this.num = num;
    }
    public int getNum(){
        return num;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    
    public String setSaldo(double saldo){
        if(saldo<0){
            return "Valor inválido";
        }
        this.saldo = saldo;
        return "Saldo alterado";
    }
    public double getSaldo(){
        return saldo;
    }
    
    public String creditar(double valor){
        if(valor <= 0){
            return "Valor inválido";
        }
        saldo += valor;
        return "Valor creditado";
    }
    public String debitar(double valor){
        if(valor <= 0){
            return "Valor inválido";
        }
        saldo -= valor;
        return "Valor creditado";
    }
    @Override
    public String toString(){
        return num + " " + nome + " " + saldo;
    }
    
}

