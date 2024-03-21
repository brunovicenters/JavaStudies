import Carro.Carro;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Ford", "Fiesta", 1995);
        System.out.println("Informações do carro: " + carro1.obterInformacoes());

        carro1.definirMarca("Chevrolet");

        System.out.println("Informações do carro após alteração da marca: " + carro1.obterInformacoes());

        System.out.println("É um carro antigo? " + ((carro1.ehAntigo()) ? "Sim" : "Não"));
    }
}