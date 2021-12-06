package br.infnet.edu.fdevjavaaula1;

public class Funcionario {
    
    String nome;
    int idade;
    float salario;
    float bonus;
    float desconto;
    
    private final float SALARIO_MAX = 100000;

    Funcionario(){
        this.nome = "Fantasma";
    }
    
    Funcionario(String nome, int idade){
        this();
        this.nome = nome;
        this.idade = idade;
    }
    public Funcionario(String nome, int idade, float salario, float bonus, float desconto) {
        this(nome, idade);
//        this.nome = nome;
//        this.idade = idade;
        this.salario = salario;
        this.bonus = bonus;
        this.desconto = desconto;
    }
    
    private float calcularSalarioLiquido(){
        return salario+bonus-desconto;
    }
    private String obterSituacao(float fl){
        return fl > SALARIO_MAX ? "rico" : "pobre";
    }

    
    void impressao(){
        float salarioLiquido = calcularSalarioLiquido();
        
        String situacao = obterSituacao(salarioLiquido);
        
        System.out.println(this);
        System.out.println("Idade: "+idade);
        System.out.println("salario: "+salario);
        System.out.println("bonus: "+bonus);
        System.out.println("desconto: "+desconto);
        System.out.println("Situacao: "+situacao);
        System.out.println("Salário Líquido: "+salarioLiquido);
    }
    
    
    @Override
    public String toString() {
            return "\nNome: " + nome;
    }
    
    
    
}
