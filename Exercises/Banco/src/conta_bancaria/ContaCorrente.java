package conta_bancaria;

public class ContaCorrente extends ContaBancaria {
    public double limiteChequeEspecial;

    public ContaCorrente(int numeroConta, double saldo, double limiteChequeEspecial) {
        super(numeroConta, saldo);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public double emprestimo (double valor) {
        if (valor <= limiteChequeEspecial+saldo) {
            return saldo -= valor;
        } else {
            return 0;
        }
    }

}
