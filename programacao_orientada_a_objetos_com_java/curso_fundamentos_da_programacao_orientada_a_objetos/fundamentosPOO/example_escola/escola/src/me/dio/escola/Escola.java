package me.dio.escola;

public class Escola {
    public static void main(String[] args) {
        //Aluno lucas = new Aluno("Lucas Ferreira", 29);
        Aluno lucas = new Aluno();
        lucas.setNome("Lucas Ferreira da Silva");
        lucas.setIdade(29);
        System.out.println("O aluno " + lucas.getNome() + " tem " + lucas.getIdade() + " anos!");
    }
}
