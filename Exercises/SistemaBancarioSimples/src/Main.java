import SistemaBancarioSimples.SistemaBancarioSimples;

public class Main {
    public static void main(String[] args) {
        SistemaBancarioSimples conta = new SistemaBancarioSimples("Bruno", 00.50);
        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Saldo: " + conta.getSaldo());

        conta.setTitular("Anderson");
        conta.setSaldo(12.1);
        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Saldo: " + conta.getSaldo());
    }
}