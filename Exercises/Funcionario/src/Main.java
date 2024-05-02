import funcionario.*;

public class Main {
    public static void exibirDetalhes(Funcionario func) {
        System.out.println("Nome:" + func.getNome());
        System.out.println("Matrícula: " + func.getMatricula());
        System.out.println("Cargo: " + func.getCargo());
        System.out.println("Salário: " + func.calcularSalario());
        System.out.println("***********************************************");
    }

    public static void main(String[] args) {
        Funcionario gerente = new Gerente("Gerson", "1F3E", "Gerente");
        Funcionario programador = new Programador("Vicente", "2G4H", "Programador");
        Funcionario analista = new Analista("Guarulhos", "5T7Y", "Analista");
        Funcionario estagiario = new Estagiario("Tarsila", "6A8V", "Estagiário");

        exibirDetalhes(gerente);
        exibirDetalhes(programador);
        exibirDetalhes(analista);
        exibirDetalhes(estagiario);

    }
}