package br.edu.infnet.joao_figueredo_dr1_tp3.teste;

import auxiliar.Constantes;
import br.edu.infnet.joao_figueredo_dr1_tp3.testes.dominio.Aluno;
import br.edu.infnet.joao_figueredo_dr1_tp3.testes.dominio.Professor;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author wasabi
 */
public class Principal {

    private static List<Aluno> listaAluno;
    private static List<Professor> listaProf;
    private static int quantidadeAluno = 0;
    private static int quantidadeProfessor = 0;
    private static List<Funcionario> listaFuncionario;
    
    private static void impressao(){
            System.out.println("---- Listagem de Alunos e Professores ----");
            for(Funcionario func : listaFuncionario) {
                    func.impressao();
            }
            System.out.println("------------------------------------------");
    }
            
    public static void main(String[] args) {
        
        listaFuncionario = new ArrayList<Funcionario>();
        
        int opcao = 0;
        
        Scanner in = new Scanner(System.in);
        
        do{
            System.out.println("[1] Cadastrar Aluno");
            System.out.println("[2] Cadastrar Professor");
            System.out.println("[3] Consulta Individual");
            System.out.println("[4] Consultar todos");
            System.out.println("[5] Sair");
            
            try{
                opcao = Integer.valueOf(in.next());
            } catch (NumberFormatException e){
                System.out.println("Opção Inválida!");
                opcao = 5;
            }
            
            switch(opcao){
                case 1:
                    //trocar if por try
                    if(quantidadeAluno < Constantes.quantidadeMaxima){
                        Aluno novoAluno = new Aluno();
                    
                        System.out.println("Informe o nome: ");
                        novoAluno.setNome(in.next());
                        
                        System.out.println("Informe o sobrenome: ");
                        novoAluno.setSobrenome(in.next());

                        System.out.println("Informe a nota da AV1: ");
                        novoAluno.setNotaAV1(in.nextInt());
                        
                        System.out.println("Informe a nota da AV2: ");
                        novoAluno.setNotaAV2(in.nextInt());
                        
                        listaAluno.add(novoAluno);
                        
                        System.out.println(novoAluno);
                        
                        quantidadeAluno++;
                    }else{
                        System.out.println("Número máximo de alunos atingido!");
                    }
                    break;
                case 2:
                    if(quantidadeProfessor < Constantes.quantidadeMaxima){
                        Professor novoProf = new Professor();
                    
                        System.out.println("Informe o nome: ");
                        novoProf.setNome(in.next());
                        
                        System.out.println("Informe o sobrenome: ");
                        novoProf.setSobrenome(in.next());

                        System.out.println("Informe a matéria que irá lecionar: ");
                        novoProf.setMateria(in.next());
                        
                        listaProf.add(novoProf);
                        
                        System.out.println(novoProf);
                        novoProf.impressao();
                        quantidadeProfessor++;
                    }else{
                        System.out.println("Número máximo de professores atingido!");
                    }
                    break;
                case 3:
                    System.out.println("Informe o ID: ");
                    int id = in.nextInt();
                    
                    if(id < 0 || id > Constantes.quantidadeMaxima){
                        System.out.println("ERROR");
                        break;
                    }//tranformar em exception
                    if (id == 1){
                        System.out.println(); //aluno
                    }else if(id == 2){
                        System.out.println(); //professor
                    }else{
                        System.out.println("ERROR");
                    }
                    break;
                case 4:
                    
                    System.out.println("[1] Aluno");
                    System.out.println("[2] Professor");
                    opcao = in.nextInt();
                    if(opcao == 1){
                        int quantidadeDeIDS = Aluno.getIndexID();
                        System.out.println("LISTA DE ALUNOS: ");
                        for(int i = 0; i<= quantidadeDeIDS.length(); i++){
                            Aluno.impressao();                          
                        }
                    }else if(opcao == 2){
                        System.out.println("LISTA DE PROFESSORES: ");
                        Professor.impressao();
                    }
//                   print (aluno ou professor?)
//                    if aluno, impressao aluno
//                    if professor, impressao professor
                    break;
                case 5:
                    System.out.println("Saindo!");
                    break;
                default:                    
                    System.out.println("Opção Inválida!");
                    break;
            }
        }while(opcao != 5);
        
    }
    
}
