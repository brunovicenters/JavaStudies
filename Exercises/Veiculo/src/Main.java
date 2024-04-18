import veiculo.Carro;
import veiculo.Moto;

public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Honda", "Civic", 2022, 4);
        Moto minhaMoto = new Moto("Honda", "Hornet", 2010, 600);

        meuCarro.exibirInfo();
        System.out.println();
        minhaMoto.exibirInfo();
    }
}