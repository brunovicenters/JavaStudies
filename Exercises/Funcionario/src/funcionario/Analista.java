package funcionario;

public class Analista extends Funcionario {

    public Analista (String nome, String matricula, String cargo) {
        super(nome, matricula, cargo);
    }

    @Override
    public double calcularSalario(){
        return 1350.00 * 1.7;
    }

}
