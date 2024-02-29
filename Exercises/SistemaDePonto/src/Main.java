import SistemaDePonto.SistemaDePonto;

public class Main {
    public static void main(String[] args) {
        SistemaDePonto pontos = new SistemaDePonto(234.5, 34.9);

        System.out.println("Ponto x: " + pontos.getX());
        System.out.println("Ponto y: " + pontos.getY());
    }
}