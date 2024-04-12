package Funcionarios;

public class Entregador extends Empregado {
    private double bonusPorEntrega;


    public Entregador(String matricula, String nome, double salario, double bonusPorEntrega) {
        super(matricula, nome, salario);
        this.bonusPorEntrega = bonusPorEntrega;
    }

    public double getBonusPorEntrega() {
        return bonusPorEntrega;
    }

    public double calculaPagamento() {
        return getSalario()*(1+getBonusPorEntrega());
    }
}
