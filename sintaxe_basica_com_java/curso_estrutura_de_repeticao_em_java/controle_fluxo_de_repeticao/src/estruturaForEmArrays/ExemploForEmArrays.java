package estruturaForEmArrays;

public class ExemploForEmArrays {
    public static void main(String[] args) {
        String alunos[] = {"Lucas", "Tampinha", "Fernanda", "Paula", "Julia"};

        for(int i = 0; i < alunos.length; i++) {
            System.out.println(alunos[i] + " e o " + i + "º aluno!");
        }
    }
}
