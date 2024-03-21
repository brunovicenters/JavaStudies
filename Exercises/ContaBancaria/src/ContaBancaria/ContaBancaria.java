package ContaBancaria;

public class ContaBancaria {
    private double saldo;
    private String titular;

    public ContaBancaria(double saldo, java.lang.String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor){
        if (valor <= saldo) {
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente. Operação não realizada.");
        }
    }


}
