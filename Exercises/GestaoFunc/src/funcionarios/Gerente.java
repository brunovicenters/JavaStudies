package funcionarios;

public class Gerente extends Funcionario {

    public Gerente(String nome, String matricula, String cargo) {
        super(nome, matricula, cargo);
    }

    @Override
    public double calcularSalario(){
        return 1350.00 * 6.5;
    }
}
