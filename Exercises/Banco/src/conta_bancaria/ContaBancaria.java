package conta_bancaria;

public class ContaBancaria {
    public int numeroConta;
    public double saldo;

    public ContaBancaria(int numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public double depositar (double valor) {
        return this.saldo += valor;
    }

    public double sacar (double valor) {
        return this.saldo -= valor;
    }
}
