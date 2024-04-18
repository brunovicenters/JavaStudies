package veiculo;

public class Carro extends Veiculo {
    public int numeroPortas;

    public Carro(String marca, String modelo, int ano, int numeroPortas) {
        super(marca, modelo, ano);
        this.numeroPortas = numeroPortas;
    }

    public void exibirInfo(){
        System.out.println("Meu carro -> ");
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("Ano: "+ano);
        System.out.println("Portas: "+numeroPortas);
    }
}
