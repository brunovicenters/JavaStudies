package conta_bancaria;

public class ContaPoupanca extends ContaBancaria {
    public double taxaRendimento;

    public ContaPoupanca(int numeroConta, double saldo, double taxaRendimento) {
        super(numeroConta, saldo);
        this.taxaRendimento = taxaRendimento;
    }

    public double rendimento (){
        return this.saldo *= taxaRendimento;
    }
}
