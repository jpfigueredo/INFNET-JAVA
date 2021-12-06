package br.edu.infnet.joao_figueredo_dr1_tp3.teste;

import br.edu.infnet.joao_figueredo_dr1_tp3.testes.dominio.Aluno;

/**
 *
 * @author wasabi
 */
public class AlunoTeste {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Aluno primeiroAluno = new Aluno();
        primeiroAluno.setNome("Rodolfo");
        primeiroAluno.setSobrenome("D'Avila");
        primeiroAluno.setNotaAV1(5.5);
        primeiroAluno.setNotaAV2(7);
        System.out.println(primeiroAluno);
        
        Aluno segundoAluno = new Aluno();
        segundoAluno.setNome("Matheuszin");
        segundoAluno.setSobrenome("Do Berequenblack");
        segundoAluno.setNotaAV1(9);
        segundoAluno.setNotaAV2(10);
        System.out.println(segundoAluno);

    }
    
}
