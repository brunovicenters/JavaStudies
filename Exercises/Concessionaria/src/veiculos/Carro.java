package veiculos;

public class Carro extends Veiculo {

    private int numeroPortas;


    public Carro(String marca, String modelo, int ano, double preco, int numeroPortas) {
        super(marca, modelo, ano, preco);
        this.numeroPortas = numeroPortas;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "numeroPortas=" + numeroPortas +
                '}';
    }
}
