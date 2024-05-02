package funcionario;

public class Programador extends Funcionario {

    public Programador(String nome, String matricula, String cargo) {
        super(nome, matricula, cargo);
    }

    @Override
    public double calcularSalario(){
        return 1350.00 * 4.2;
    }

}
