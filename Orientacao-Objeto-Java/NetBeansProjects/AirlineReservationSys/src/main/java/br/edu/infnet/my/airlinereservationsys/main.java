package br.edu.infnet.my.airlinereservationsys;

import java.util.Scanner;

public class main {
    
    private static final Scanner in = new Scanner(System.in);
    private static int opcao = 0;
    static String user = "";
    static String password = null;
    static String[][] gerentes;
    static String[] atendentes;
    static String[] clientes;
    
    private static void introducao() {
        System.out.println("-------------------------");
        System.out.println("|     A.R. Airlines!    |");
        System.out.println("|                       |");
        System.out.println("|    [1] Entrar         |");
        System.out.println("|    [2] Criar conta    |");
        System.out.println("|    [3] Sair           |");
        System.out.println("-------------------------");
        System.out.print("Selecione uma opção: ");
        opcao = in.nextInt();
    }
    
    private static void escolheOpcao(int opcao){
        switch(opcao){
            case 1:
                obterConta();
                break;
            case 2:
                System.out.println("[1] Conta Cliente");
                System.out.println("[2] Conta Atendente");
                var conta = in.nextInt();
                criarConta(conta);
                break;
            case 3:
                break;
            default:
                System.out.println("Opção Inválida!");
                break;
        }
    }
    
    private static void criarConta(int conta) {       
        switch(conta){
            case 1:
                Gerente.registraCliente();
                break;
            case 2:
                Gerente.registraAtendente();
                break;
            default:
                System.out.println("Opção Inválida!");
                break;
        }
        
    }
    private static void verificarConta() {
//        if(user, password in gerentes){
//          telaGerente;
//        }else if(user, password in atendentes){
//          telaAtendente;
//        }else if(user, password in clientes){
//          telaCliente;
//        }else{
//          System.out.println("Opção Inválida");
//        }
//  checar se o login existe e se é do gerente, atendente ou cliente

//        if(id_gerente == ){
//            for (String x, String password: gerentes){
//                if(x.equals()){
//
//                }
//            }
//        }


    }
    private static void obterConta() {
        
        System.out.print("Login: ");
        user = in.next();
        System.out.print("Senha: ");
        password = in.next();
        
        verificarConta();
    }
    
    public static void main(String[] args) {
/*              ARLINE RESERVATIONS

    Reserva e cancelamento de passagens aéreas.
    Automação das funções do sistema da companhia aérea.
    Execute o gerenciamento de transações e funções de roteamento.
    Ofereça respostas rápidas aos clientes.
    Manter os registros dos passageiros e relatar as transações diárias de negócios

    Tá, para reservar uma airline.
    Como atores nesse sistema, temos: Atendente e Gerente.
    Gerente faz tudo que a atendente faz e registra e exclui Atendente, e gerenciamento de transações.
    Atendente pode (1) reservar e cancelar o ticket, (2) Responder ao cliente,

*/
        introducao();
        escolheOpcao(opcao);

    }           
}
