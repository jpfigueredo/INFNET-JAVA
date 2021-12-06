package br.infnet.edu.fdevjavaaula1;

public class FuncionarioTeste {
    
    public static void main(String[] args){
               
        Funcionario f1= new Funcionario("joao", 24);
        f1.bonus = 200;
        f1.desconto = 30;
        f1.salario = 1000;
        f1.impressao();
        
        Funcionario f2 = new Funcionario();
        f2.bonus = 500;
        f2.desconto = 100;
        f2.idade = 18;
//        f2.nome = "lelezinha";
        f2.salario = 2000;
        f2.impressao();
        
        Funcionario f3 = new Funcionario("pedrin", 44, 3000, 400, 50);
        f3.impressao();
    
    }
    
}
