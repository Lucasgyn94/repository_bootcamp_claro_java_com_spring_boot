package estruturaForEmArrays;

public class ExemploForAbreviadoEmArrays {
    public static void main(String[] args) {
        String alunos[] = {"Lucas", "Tampinha", "Fernanda", "Paula", "Julia"};
        int contador = 1;

        for (String aluno : alunos) {
            System.out.println(aluno + " é o " + contador + "º aluno!");
            contador++; // Incrementar o contador dentro do loop
        }
    }
}
