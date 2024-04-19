import conta_bancaria.ContaCorrente;
import conta_bancaria.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(1, 250.50, 100.00);

        System.out.println(cc.numeroConta);
        System.out.println(cc.saldo);
        System.out.println(cc.limiteChequeEspecial);
        cc.emprestimo(55.39);
        System.out.println(cc.saldo);

        System.out.println();

        ContaPoupanca cp = new ContaPoupanca(2, 350, 1.05);
        System.out.println(cp.numeroConta);
        System.out.println(cp.saldo);
        System.out.println(cp.taxaRendimento);
        cp.rendimento();
        System.out.println("Depois do rendimento: " + cp.saldo);
    }
}