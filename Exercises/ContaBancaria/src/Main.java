import ContaBancaria.ContaBancaria;

public class Main {
    public static void main(String[] args) {
        ContaBancaria cb = new ContaBancaria(150, "Bruno");

        cb.depositar(12.50);
        cb.sacar(2.33);
        System.out.println(cb.getSaldo());
    }
}