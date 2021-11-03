package br.infnet.edu.fdevjava_tp1;

import java.util.Scanner;

//          mandar link do repositório do git para o projeto
//          exec.mainClass=br.infnet.edu.fdevjava_tp1.AlunoTeste
/*
montar estrutura para captação de dados
	- definir variáveis
definir operadores para manipulação de dados
	-pedir os dados para o usuário
	-armazena os dados
	-exibir os dados
*/
public class AlunoTeste {
    
    private static String[] nomes;
    private static double[] av1;
    private static double[] av2;
    private static final int QTDE_MAX = 99;
    private static int qtde = 0;


    private static void impressao(){
        System.out.println(" ");
        System.out.println("------- Relatório de Alunos -------");
        for (int j = 0; j < qtde; j++) {
                impressao(j);
        }
        System.out.println("-----------------------------------");
        System.out.println(" ");
    }

    private static double calcularMedia(int index){
            return (av2[index] + av1[index]) / 2;
    }

    private static String obterSituacao(double nota){
            if(nota < 4){
                return "Reprovado";
            }else if(nota > 7){
                return "Aprovado";
            }else{
                return "Prova final";
            }
            
    }

    private static void impressao(int index){
            double media = calcularMedia(index);

            String situacao = obterSituacao(media);		

            System.out.println(
                            nomes[index]  + " - " + 
                            av1[index] + " - " + 
                            av2[index] + " - " + 
                            situacao
                            );
    }

    public static void main(String[] args){

            nomes = new String[QTDE_MAX];
            av1 = new double[QTDE_MAX];
            av2 = new double[QTDE_MAX];

            int opcao = 0;

            Scanner in = new Scanner(System.in);

            do {
                System.out.println("[1] Registrar as notas de um novo aluno.");
                System.out.println("[2] Consultar boletim de um aluno.");
                System.out.println("[3] Consultar notas da turma.");
                System.out.println("[4] Sair");
                System.out.print("Digite a opção desejada: ");
                System.out.print(" ");
                opcao = in.nextInt();

                switch (opcao) {
                    case 1:
                        if(qtde < QTDE_MAX) {
                            System.out.print("Informe o seu nome: ");
                            nomes[qtde] = in.next();

                            System.out.print("Informe a nota da AV1: ");
                            av1[qtde] = in.nextDouble();

                            System.out.print("Informe o nota da AV2: ");
                            av2[qtde] = in.nextDouble();


                            impressao(qtde);
                            System.out.println(" ");
                            qtde++;
                        } else {
                            System.out.println("Impossível realizar o cadastramento!!!");
                        }
                        break;

                    case 2:
                        System.out.println("Informe o código do aluno: ");
                        int id = in.nextInt();

                        if(id >= 0 && id < qtde) {
                                impressao(id);
                        } else {
                                System.out.println("O código " + id + " é inválido!!");
                        }				
                        break;

                    case 3:
                        impressao();			
                        break;

                    case 4:
                        System.out.println("Sair");
                        break;

                    default:
                        System.out.println("Opção Inválida!");
                        break;
                }			
            } while (opcao != 4);

            in.close();

            System.out.println("Processamento realizado!");
    }
}