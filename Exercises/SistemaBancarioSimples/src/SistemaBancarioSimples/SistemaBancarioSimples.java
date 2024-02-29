package SistemaBancarioSimples;

public class SistemaBancarioSimples {
    private String titular;
    private double saldo;

    public SistemaBancarioSimples(java.lang.String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public java.lang.String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
