import Aluno.Aluno;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Bruno", 1, 10.00);

        System.out.println(aluno.getNome());
        System.out.println(aluno.getMatricula());
        System.out.println(aluno.getNota());
    }
}