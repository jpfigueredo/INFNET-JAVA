package br.edu.infnet.guanabara.fundamentos_tp2;

class Aluno {
    
    private static String nome;
    private static int av1;
    private static int av2;
    
    int QTMAX = 100;

    public static String getNome() {
        return nome;
    }

    public static void setNome(String nome) {
        Aluno.nome = nome;
    }

    public static int getAv1() {
        return av1;
    }

    public static void setAv1(int av1) {
        Aluno.av1 = av1;
    }

    public static int getAv2() {
        return av2;
    }

    public static void setAv2(int av2) {
        Aluno.av2 = av2;
    }
    
}
