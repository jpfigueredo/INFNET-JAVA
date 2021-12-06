/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.infnet.joao_figueredo_dr1_tp3.testes.dominio;

/**
 *
 * @author wasabi
 */
public class Professor {
    private int id;
    private String nome;
    private String sobrenome;
    private String materia;
    private static int indexID;
    
    public Professor(){}
    
    public Professor(String nome, String sobrenome, String materia){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.materia = materia;
    }
    
    public String impressao(){
        return ("ID : "+id+
                "\nNome: "+nome+
                "\nSobrenome: "+sobrenome+
                "\nMateria: "+materia);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }    

    public static int getIndexID() {
        return indexID;
    }

    public static void setIndexID(int indexID) {
        Professor.indexID = indexID;
    }

    
    
    
    @Override
    public String toString() {
        return ("ID: "+this.id+
                "\nNome: "+this.nome+
                "\nSobrenome: "+this.sobrenome+
                "\nMatéria: "+this.materia);
    }
}
