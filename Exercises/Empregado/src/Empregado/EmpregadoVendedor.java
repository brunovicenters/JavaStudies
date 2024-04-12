package Empregado;

public class EmpregadoVendedor extends Empregado {

    private double totalVendaMes;

    public EmpregadoVendedor(String matricula, String nome, double salario, double totalVendaMes) {
        super(matricula, nome, salario);
        this.totalVendaMes = totalVendaMes;
    }

    public double getTotalVendaMes() {
        return totalVendaMes;
    }

    public double calculaPagamento() {
        double bonusVendas = totalVendaMes*0.1;

        return getSalario()+bonusVendas;
    }
}
