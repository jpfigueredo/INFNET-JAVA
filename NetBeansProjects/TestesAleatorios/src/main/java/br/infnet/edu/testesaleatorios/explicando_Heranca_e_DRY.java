package br.infnet.edu.testesaleatorios;


public class explicando_Heranca_e_DRY{
    
    
    public class Servico {
        private Cliente cliente;
        private Funcionario funcionario;

        //Empréstimo
        private double valor;
        private double taxa;

        //Seguro Veiculo
        private Veiculo veiculo;
        private double valorSeguro;
        private double franquia

        /* SE TORNA */

        class Emprestimo{
            private Cliente cliente;
            private Funcionario funcionario;
        private double valor;
        private double taxa;
        }

        class SeguroVeiculo{
            private Cliente cliente;
            private Funcionario funcionario;
            private Veiculo veiculo;
            private double valorSeguro;
            private double franquia
        }

        /* APLICANDO HERANÇA E DRY */


        class Emprestimo extends Servico{
            private double valor;
            private double taxa;
        }

        class SeguroVeiculo extends Servico{
            private Veiculo veiculo;
            private double valorSeguro;
            private double franquia
        }
        // Agora podemos utilizar os atributos de Serviço
    }
    
}