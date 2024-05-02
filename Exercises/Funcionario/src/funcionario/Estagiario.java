package funcionario;

public class Estagiario extends Funcionario {
    public Estagiario(String nome, String matricula, String cargo) {
        super(nome, matricula, cargo);
    }

    @Override
    public double calcularSalario(){
        return 1350.00 * 0.8;
    }
}
