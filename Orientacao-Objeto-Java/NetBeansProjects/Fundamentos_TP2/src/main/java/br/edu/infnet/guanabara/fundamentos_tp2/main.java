package br.edu.infnet.guanabara.fundamentos_tp2;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        
        Aluno aluno = new Aluno();
        String alunoNome;
        int alunoAV1;
        int alunoAV2;
        
        
        Scanner in = new Scanner(System.in);
        
        int opcao = 0;
                
        do{
            System.out.println("[1] Registrar as notas de um novo aluno.");
            System.out.println("[2] Consultar boletim de um aluno.");
            System.out.println("[3] Consultar notas da turma.");
            System.out.println("[4] Sair.");
            opcao = in.nextInt();

            switch(opcao){
                case 1:
                    System.out.println("Informe nome: ");
                    alunoNome = in.next();
                    System.out.println("Informe nota AV1: ");
                    alunoAV1 = in.nextInt();
                    System.out.println("Informe nota AV2: ");
                    alunoAV2 = in.nextInt();
                    
                    aluno
                    
                case 2:
                    System.out.println("[2] Consultar boletim de um aluno.");
                case 3:
                    System.out.println("[3] Consultar notas da turma.");
                case 4:
                    System.out.println("[4] Sair.");
            }
//            System.out.println("Registro feito no código: "+ codigo);
//            if (codigo[i].length > codigo.length){
//                System.out.println("Impossível inserir novo registro");
//                break;
//            }
        }while(opcao <= 4);
    }

}
