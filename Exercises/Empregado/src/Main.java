import Empregado.Empregado;
import Empregado.EmpregadoVendedor;

public class Main {
    public static void main(String[] args) {
        Empregado empregado = new Empregado("123", "Bruno", 2000.00);
        System.out.println("Empregado:");
        System.out.println("Matrícula: " + empregado.getMatricula());
        System.out.println("Nome: " + empregado.getNome());
        System.out.println("Salário: " + empregado.getSalario());
        System.out.println("Pagamento: " + empregado.calculaPagamento());

        EmpregadoVendedor vendedor = new EmpregadoVendedor("456", "Tarsila", 2300.00, 5000.00);
        System.out.println("\n\nVendedor:");
        System.out.println("Matrícula: " + vendedor.getMatricula());
        System.out.println("Nome: " + vendedor.getNome());
        System.out.println("Salário: " + vendedor.getSalario());
        System.out.println("Vendas do mês: " + vendedor.getTotalVendaMes());
        System.out.println("Pagamento: " + vendedor.calculaPagamento());
    }
}