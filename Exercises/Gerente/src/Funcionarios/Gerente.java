package Funcionarios;

public class Gerente extends Empregado {
    public double bonusAnual;


    public Gerente(String matricula, String nome, double salario, double bonusAnual) {
        super(matricula, nome, salario);
        this.bonusAnual = bonusAnual;
    }

    public double getBonusAnual() {
        return bonusAnual;
    }

    public double calculaPagamento() {
        return getSalario() * (1+getBonusAnual());
    }
}
