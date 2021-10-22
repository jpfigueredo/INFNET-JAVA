package br.infnet.edu.fdevjavaaula1;

import java.util.Scanner;

public class Segundo {
    
    private static String[] nomes;
    private static int[] idades;
    private static float[] salarios;
    private static final int QTMAX = 5;
    private static float[] descontos;
    private static float[] bonus;
    
    
    private static void impressao(){
        System.out.println("---- Relatórios de Funcionários ----");
        for(int j = 0; j < QTMAX ; j++){
            if(nomes[j] != null){
            impressao(j);
            }
        }
        System.out.println("------------------------------------");
    }
    
    private static void impressao(int index){
        float salarioLiquido = 0;
        String situacao = null;
        
        System.out.println( index + " - " + 
                            nomes[index] + " - " + 
                            idades[index] + " - " +
                            salarios[index] + " :: " +
                            salarioLiquido + " - " +
                            situacao
                            );
    }
      
    public static void main(String[] args){
                
        nomes = new String[QTMAX];
        idades = new int[QTMAX];
        salarios = new float[QTMAX];
        descontos = new float[QTMAX];
        bonus = new float[QTMAX];

        int opcao = 0;
        int qtde = 0;
        
        Scanner in = new Scanner(System.in);
                
        do{
            System.out.println("[1] Cadastrar");
            System.out.println("[2] Consultar um");
            System.out.println("[3] Consultar todos");
            System.out.println("[4] Sair");
            System.out.print("Informe a opção desejada: ");
            opcao = in.nextInt();
            
            switch (opcao){
                case 1:
                    if(qtde <= QTMAX){
                        System.out.println("Digite o nome: ");
                        nomes[qtde] = in.next();
                        System.out.println("Digite o idade: ");   
                        idades[qtde] = in.nextInt();
                        System.out.println("Digite o salario: ");
                        salarios[qtde] = in.nextInt();
                        
                        System.out.println("Digite o bonus: ");
                        bonus[qtde] = in.nextInt();
                        
                        System.out.println("Digite o desconto: ");
                        descontos[qtde] = in.nextInt();
                        
                        impressao(qtde);
                        
                        qtde++;

                    }else{
                        System.out.println("Impossível realizar o cadastramento!!");
                    }

                    break;
                case 2:
                    System.out.print("Informe o código do funcionário: ");
                    int codigo = in.nextInt();
                    if(codigo > 0 && codigo < qtde){
                        impressao(codigo);
                    }else{
                        System.out.println("O código " + codigo + " é inválido!!");
                    }
                    break;
                case 3:
                    impressao();
                    break;
                case 4:
                    System.out.println("Sair");
                    break;
                default:
                    System.out.println("Opção Inválida!!!!!");
                    break;
            } 
        }while(opcao != 4);
        in.close();
        System.out.println("Processamento finalizado!");
        
    }
    
}
