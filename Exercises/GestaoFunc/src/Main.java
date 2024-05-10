import funcionarios.Estagiario;
import funcionarios.Funcionario;
import funcionarios.Gerente;

public class Main {
    public static void exibirDetalhes(Funcionario func) {
        System.out.println("Nome:" + func.getNome());
        System.out.println("Matrícula: " + func.getMatricula());
        System.out.println("Cargo: " + func.getCargo());
        System.out.println("Salário: " + func.calcularSalario());
        System.out.println("***********************************************");
    }

    public static void main(String[] args) {
        Gerente gerente = new Gerente("Gerson", "1F3E", "Gerente");
        Estagiario estagiario = new Estagiario("Tarsila", "6A8V", "Estagiário");

        exibirDetalhes(gerente);
        gerente.marcarReuniao(23, 15, 23);

        System.out.println();
        System.out.println("******************************************");
        System.out.println();

        exibirDetalhes(estagiario);
        estagiario.mensagemParaOChefe("Tarefa realizada");
    }
}