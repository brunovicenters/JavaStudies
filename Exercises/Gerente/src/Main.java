import Funcionarios.Entregador;
import Funcionarios.Gerente;

public class Main {
    public static void main(String[] args) {
        Gerente g = new Gerente("1", "Matheus", 5000.00,0.20);

        System.out.println("Gerente: " + g.getNome());
        System.out.println(g.getSalario());
        System.out.println(g.calculaPagamento());

        Entregador e = new Entregador("2", "Loris", 1350.00, 0.05);
        System.out.println("Entregador: " + e.getNome());
        System.out.println(e.getSalario());
        System.out.println(e.calculaPagamento());
    }
}